package model;

/**
 * Clase PERSONA base para cualquier persona vinculada a la empresa LLanquihue tour
 *
 */

public class Persona {
    private String nombre;
    private String correo;
    private String telefono;
    private Direccion direccion;

    /**
     * 
     * @param nombre Nombre de la persona
     * @param correo correo electronico para contactar a la persona
     * @param telefono numero de telefono para contactar a la persona
     * @param direccion direccion física de la persona
     */
    public Persona(String nombre, String correo, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    /**
     * 
     * @return entrega datos de contacto de la persona
     */
    @Override
    public String toString(){
    return "Nombre: " + nombre + "| Correo: " + correo + "| Telefono: " + telefono + "| Dirección: " + direccion;
    
}

}

package app;

import model.Persona;
import model.Direccion;
import model.Cliente;
        
/**
 * Clase principal del sistema LLanquihue tour
 * 
 */
public class main {

    public static void main(String[] args) {
System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        
// 1. Declarar direcciones
Direccion dir1 = new Direccion("El Volcan", 111, "Llanquihue", "Los Lagos");
Direccion dir2 = new Direccion("Av. Providencia", 234, "Santiago", "Metropolitana");
Direccion dir3 = new Direccion("Rua Das Pedras", 567, "Rio de Janeiro", "Brasil");

// 2. Crear instancia de clientes
Cliente cliente1 = new Cliente("Peter Parker", "ppark@yahoo.com", "56996067878", dir1, 28, "Chileno", "Excursion cultural");
Cliente cliente2 = new Cliente("Christian Carvajal", "ccarvaj@hotmail.com", "569915777745", dir2, 40, "Chileno", "Turismo Gastronomico");
Cliente cliente3 = new Cliente("Ana Barbosa", "abarbosa@gmail.com", "54991372322", dir3, 53, "Brasileña", "Paseo Lacustre");
      
// 3. Mostrar resultados
System.out.println(" --- LLANQUIHUE TOUR --- \n");
System.out.println("Clientes registrados:");
System.out.println(cliente1);
System.out.println(cliente2);
System.out.println(cliente3);

    }
    
}

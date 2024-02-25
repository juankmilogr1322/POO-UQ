package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Gómez", "1032678049", "juanc.gomezr@uqvirtual.edu.co", "3223652623", 18);
        System.out.println(estudiante);

        /*
         * Estudiante de prueba a continuación
         */
        Estudiante estudiante00 = new Estudiante("John", "Emmanuel", "1092657878", "jhone.ramireze@uqvirtual.edu.co", "3223652623", 34);
        System.out.println(estudiante00);
    }
}
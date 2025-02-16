public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas Nombres Variables
        String nombreCompleto = "Juan Carlos"; // Correcto y buena practica
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2"; // Correcto pero no aplica buena practica
        System.out.println("NombreCompleto = " + NombreCompleto);
        String nombre_cliente = "Juan Carlos 3"; // Correcto pero no aplica buena practica
        //String nombre-cliente = "Juan Carlos 4"; // Incorrecto. No se permite el guion: dara error
        String _apellido = "Perez"; // Correcto y aceptable
        String $apellido = "Perez 2"; // Correcto y aceptable
        int totPzs = 10; // Correcto pero no aplica buena practica
        int totalPiezas = 10; // Correcto y buena practica
        boolean casado = true; // Correcto pero puede mejorar
        boolean isCasado = true; // Correcto y buena practica (otra opcion: esCasado)
        boolean hasSaldo = true; // Correcto y buena practica (otra opcion; tieneSaldo)
    }
}

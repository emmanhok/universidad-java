// Reto 3 de la Seccion 03

public class ReservaHoteles {
    public static void main(String[] args) {

        // Mensaje de inicio del programa
        System.out.println("----------------------------------");
        System.out.println("| Reserva de Habitacion de Hotel |");
        System.out.println("----------------------------------");

        // Declaracion de variables y valores iniciales
        final var NOMBRE_CLIENTE = "Emmanuel Herrera";
        var diasEstancia = 5;
        var tarifaDiaria = 9999.99;
        var tieneVistaMar = true;

        // Impresion de valores iniciales
        System.out.println("\nIMPRESION DE VALORES INICIALES");
        System.out.println("NOMBRE_CLIENTE = " + NOMBRE_CLIENTE);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("hasViewsSea = " + tieneVistaMar);

        // Modificacion de algunos valores
        diasEstancia = 4;
        tarifaDiaria = 4999.99;
        tieneVistaMar = false;

        // Impresion de valores modificados
        // Impresion de valores iniciales
        System.out.println("\nIMPRESION DE VALORES MODIFICADOS");
        System.out.println("NOMBRE_CLIENTE = " + NOMBRE_CLIENTE);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("hasViewsSea = " + tieneVistaMar);
    }
}

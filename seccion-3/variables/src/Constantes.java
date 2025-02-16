public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***\n");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        //DIAS_SEMANA = 8; // Dara error porque no se puede modificar el valor de las constantes
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI = " + Math.PI);
        final var MENSAJE_BIENVENIDA = "Bienvenido/a a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var SEGUNDOS_POR_MINUTO = 60;
        System.out.println("SEGUNDOS_POR_MINUTO = " + SEGUNDOS_POR_MINUTO);
    }
}

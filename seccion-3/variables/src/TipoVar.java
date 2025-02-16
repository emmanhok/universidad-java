public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables usando var
        var edad = 32;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;
        System.out.println("sueldo = " + sueldo);
        var esCasado = false;
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);
        //esCasado = "No"; // Error

        // Con var siempre se debe definir su valor sino dara error
        //var precio; // Dara error
        var precio = 99.99;

        // Se debe inferirel tipo de dato
        //var apellido = null; // Dara error
        var apellido = "Perez";

    }
}

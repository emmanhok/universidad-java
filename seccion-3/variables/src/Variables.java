public class Variables {
    public static void main(String[] args) {
        // Variables
        int edad = 32;
        double precio = 300.40;
        boolean disponible = true; // true/false
        char genero;
        genero = 'M'; // M-Masculino / F-Femenino

        // Acceder a las variables
        System.out.println(edad);
        // Modificar valor
        edad = 33;
        System.out.println(edad);
        // Impresion del resto de las variables
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);

        /*
        Memoria en Java:
            Stack(Pila)
                Almacena variables primitivas cuando se declaran dentro de un metodo.
                Almacena variables locales y referencias a objetos
            Heap
                Almacena los objetos, asi como sus datos
         */

    }
}

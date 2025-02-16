// Reto 2 de la Seccion 03

public class DetalleProducto {
    public static void main(String[] args) {
        // Titulo
        System.out.println("-----------------");
        System.out.println("| TIENDA ONLINE |");
        System.out.println("-----------------");
        // Declaracion de variables
        String nombreProducto = "Martillo";
        float precioProducto = 599.99F;
        int cantidadDisponible = 0;
        boolean hasStock = false;
        // Impresion de valores cargados
        System.out.println("\nIMPRESION DE VALORES CARGADOS");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("hasStock = " + hasStock);
        // Modificacion de valores
        nombreProducto = "Destornillador";
        precioProducto = 399.99F;
        cantidadDisponible = 5;
        hasStock = true;
        // Impresion de valores modificados
        System.out.println("\nIMPRESION DE VALORES MODIFICADOS");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("hasStock = " + hasStock);
    }
}

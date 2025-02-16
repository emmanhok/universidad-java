public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;
        // Impresion de los valores de las variables
        System.out.println("Título del libro: " + tituloLibro);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Disponibilidad: " + libroDisponible);
        System.out.println("Precio: " + precio);
        // Modificar el titulo del libro
        tituloLibro = "El Señor de los Anillos"; // Al crearse este otro objeto la memoria ocupada por el objeto de linea 4 se destruye con el recolector
        System.out.println("Nuevo objeto para titulo del libro: " + tituloLibro);
    }
}

public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (todo numero sin punto es por default int) - (valor por default 0)
        byte tipoByte = 127; // byte tipoByte = (byte)128;
        System.out.println("tipoByte = " + tipoByte); // Operador '+' luego de una cadena convierte la variable de la derecha en cadena
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321; // long tipoLong = 9876543219875432L // Este ultimo valor es el limite maximo para L
        System.out.println("tipoLong = " + tipoLong);
        // Punto Flotante (todo numero con punto es por default double) - (valor por default 0.0)
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter  - (valor por default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // Este numero equivale a la letra 'A' de unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        boolean tipoBoolean2 = false;
        System.out.println("tipoBoolean2 = " + tipoBoolean2);

        // Object o Referencia (valor por default null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);

    }
}


    import java.util.Scanner;

    public class cadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();

        int cantidadPalabras = contarPalabras(texto);

        System.out.println("Número de palabras: " + cantidadPalabras);
    }

    public static int contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        
        if (texto.trim().isEmpty()) {
            return 0;
        }
        return palabras.length;
    }
}


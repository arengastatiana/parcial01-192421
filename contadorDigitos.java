public class contadorDigitos {
    public class ContadorDigitos {
        public static void main(String[] args) {
            int numero1 = 12345;
            int numero2 = 987654321;
            
            System.out.println("El número " + numero1 + " tiene " + contarDigitos(numero1) + " dígitos.");
            System.out.println("El número " + numero2 + " tiene " + contarDigitos(numero2) + " dígitos.");
        }
    
        public static int contarDigitos(int numero) {
            // Usamos Math.abs para manejar números negativos
            return String.valueOf(Math.abs(numero)).length();
        }
    }
}

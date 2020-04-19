public class DesafioJava {
    public static void main(String[] args) {
        for (int numero = 3; numero % 3 == 0; numero += 3) {
            if (numero < 100) {
                System.out.println (numero);
            }
        }
    }
}
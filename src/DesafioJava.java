public class DesafioJava {
    public static void main(String[] args) {
        int numero = 3;
        while (true) {
            if (numero % 3 != 0) break;
            if (numero > 100) {
                break;
            }
            System.out.println (numero);
        }
    }
}
public class DesafioJava {
    public static void main(String[] args) {
        for (int numero = 1; numero % 3 != 0; numero++) {
            for (int numero1 = 0; numero1 % 3 == 0; numero1 = numero1 + 3) {
                if (numero1 < 100) {
                    System.out.println (numero1);
                }
            }
        }
    }
}
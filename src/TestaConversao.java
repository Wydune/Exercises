public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println (valor);

        long numeroGrande = 4112412321412321423l;
        short valorPequeno = 9999;
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println (total);
    }
}

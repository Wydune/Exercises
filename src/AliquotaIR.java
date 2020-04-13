public class AliquotaIR {
    public static void main(String[] args) {
        /* De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636 */
        double salario = 4000;
        if (salario >= 1900 && salario <= 2800) {
            System.out.println ("o ir é de 7,5% e pode deduzir na declaração o valor de R$ 142,00");
        }
        if (salario >= 2800.01 && salario <= 3751) {
            System.out.println ("o ir é de 15% e pode deduzir R$ 350,00");
        }
        if (salario >= 3751.01 && salario <= 4664) {
            System.out.println ("o ir é de 22,5% e pode deduzir R$ 636,00");
        }
    }
}

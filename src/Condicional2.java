public class Condicional2 {
    public static void main(String[] args) {
        int idade = 20;
        boolean acompanhado = true;
        int quantidadePessoas = 3;
        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println ("bem vindo");
        } else {
            System.out.println ("vc não pode entrar");
        }
        if (acompanhado) {
            System.out.println ("vc pode entrar pois possui " + quantidadePessoas + " de acompanhantes");
        } else {
            System.out.println ("vc não pode entrar pois possui " + quantidadePessoas + " de acompanhantes");
        }
        if (idade >= 18) {
            System.out.println ("vc pode entrar pois tem " + idade + " anos");
        } else {
            System.out.println ("vc não pode entrar pois tem " + idade + " anos");
        }
    }
}
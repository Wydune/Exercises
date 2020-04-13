public class TestaCondicional {
    public static void main(String[] args) {
        int idade = 15;
        int quantidadePessoas =8;
        if (quantidadePessoas < 3 && idade >= 18) {
            System.out.println ("vc está desacompanhado, mas pode entrar pois tem " + idade + " anos");
        } else if (idade >= 18) {
            System.out.println ("vc pode entrar pois tem " + idade + " anos");
        }   else if (quantidadePessoas >= 3 && idade <= 18) {
            System.out.println ("vc não poderia entrar, pois tem " + idade + " anos, mas está acompanhado de "
                    + quantidadePessoas + " pessoas");
        }
    }
}


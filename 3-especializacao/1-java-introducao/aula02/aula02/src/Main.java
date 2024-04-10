//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tipos primitivos em JAVA
        /*
        *Sao 8 tipos primitivos:
        * Boolean - true / false
        * Byte - inteiro de -127 a 128
        * Char - caracter unicode, usa aspas simples ''
        * Short - Inteiro de 16 bits -32.768 a 32.767
        * Int - inteiros de 32 bits -2.148.483.648 a -2.148.483.647
        * Long - inteiros de 64 bits -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        * Float - representa valores numericos de 32 bits. Representando numeros de ate 7 digitos de forma limitada.
        * Double - Ocupa 64bits e representa numeros de 15 digitos.
        * */


        char caracter = 'c';
        System.out.println(caracter);

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.6 + 7.5) / 3;
        String carName = "Volvo";
        System.out.println("Primeira String" + carName);
        carName = "Teste";
        System.out.println("Nova string:"+carName);
        System.out.println("A media do filme sera: " + media);

        String senha_admin = "123456";
        String senha_digitada = "12345";
        if (senha_admin.equals(senha_digitada)) {
            System.out.println("Autorizado.");
        }else{
            System.out.println("Negado.");
        }

        String nome = "Gabriel";
        int idade = 20;
        float dinheiro = 600.50f;
        //Formatando uma string
        System.out.println(String.format("Ola, sou o %s, tenho %d anos e possuo R$ %f .", nome, idade, dinheiro));
        String texto1 = "Ola, sou o %s, tenho %d anos e possuo R$ %f .".formatted(nome, idade, dinheiro);
        System.out.println(texto1);



        //Casting
        int classificacao;
//        classificacao = ((4.4 + 5.5) / 2); // retorna erro, pois int recebe float.
        //Resolve-se adicionando (int)
        classificacao = (int) ((4.4 + 5.5) / 2);

    }
}
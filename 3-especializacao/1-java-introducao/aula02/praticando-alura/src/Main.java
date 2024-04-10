//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Media notas
        double nota1, nota2, media;
        nota1 = 5.5;
        nota2 = 7.5;
        media = (nota1 + nota2) / 2;
        System.out.println("Sua media e: " + media);
    //Casting
        double decimal = 5.5;
        int inteiro;
        inteiro = (int) decimal;
        System.out.println("Decimal: " + decimal);
        System.out.println("Casting: " + inteiro);
    //3
        char l = 'r';
        String word = "Palavra";
        System.out.println(word + l);

        //4
        double precoProduto = 5.5;
        int qtde = 30;
        System.out.println("O preco total sera: " + qtde * precoProduto);

        double precoOriginal = 10.00;
        double percentualDesconto = 10.00;
        System.out.println("Novo preco: " + (precoOriginal - ((precoOriginal* percentualDesconto) / 100)));
    }
}
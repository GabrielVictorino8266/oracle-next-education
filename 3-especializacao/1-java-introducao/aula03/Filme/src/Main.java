public class Main {

    public static void main(String[] args){
        Filme filme1 = new Filme(); //cria um objeto do tipo Filme.
        Filme filme2 = new Filme();

        filme1.nome = "Poderoso-Chefao";
        filme1.anoDeLancamento = 2016;
        filme1.duracaoEmMinutos = 120;
        filme1.incluidoNoPlano = true;


        System.out.println(filme1.nome); // # retorna a informacao referente ao objeto.
//      System.out.println(filme1); // fornece a referencia da classe

//        filme1.exibeFichaTecnica(); // chama o metodo exibeFichaTecnica
        filme1.avaliar(9);
        filme1.avaliar(10);
        filme1.avaliar(5);
        filme1.avaliar(4);

//        System.out.println("Soma das avaliacoes: " + filme1.somaDasAvaliacoes);
//        System.out.println("Total Avaliacoes: " + filme1.totalDeAvaliacoes); // Deixamos a var private, assim nao a acesso.
        System.out.println("Media: " + filme1.obterMedia());

        System.out.println("Soma avaliacoes: " + filme1.retornarSomaAvaliacoes());
        System.out.println("Total Avaliacao: " + filme1.retornarTotalAvaliacoes());
    }
}

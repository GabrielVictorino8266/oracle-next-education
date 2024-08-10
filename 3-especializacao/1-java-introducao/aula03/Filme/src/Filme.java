public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    double duracaoEmMinutos;

    //        Metodos
    void exibeFichaTecnica(){
        System.out.println("Nome filme: " + nome);
        System.out.println("Ano lancamento: " + anoDeLancamento);
        System.out.println("Total avaliacao: " + totalDeAvaliacoes);
        System.out.println("Duracao: " + duracaoEmMinutos);
        System.out.println("Inlcuido no Plano: " + incluidoNoPlano);
    }

    void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double obterMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    double retornarSomaAvaliacoes(){
        return somaDasAvaliacoes;
    }

    int retornarTotalAvaliacoes(){
        return totalDeAvaliacoes;
    }



    //Da maneira atual, o Java permite alteracoes nas variaveis apenas chamando e mudando seu valor.

}
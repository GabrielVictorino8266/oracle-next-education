public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("titulo: " + titulo);
        System.out.println("artista: " + artista);
        System.out.println("ano de lancamento: " + anoLancamento);
        System.out.println("Avaliacao: " + avaliacao);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    double exibirMediaFilme(){
        avaliacao = avaliacao / numAvaliacao;
        return avaliacao;
    }

}
let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 1;

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
};

exibirTextoNaTela('h1', 'Jogo do número secreto');
exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');

function limparCampo() {
    chute = document.querySelector('input');
    chute.value = '';
};


function verificarChute() {
    let chute = document.querySelector('input').value;
    
    let palavraTentiva = tentativas > 1 ? 'tentativas':'tentativa';
    let mensagemTentativa = `Voce descobriu o numero secreto com ${tentativas} ${palavraTentiva}`;


    if (chute == numeroSecreto) {
        exibirTextoNaTela('h1', 'Acertou!');
        exibirTextoNaTela('p', mensagemTentativa);
        document.getElementById("reiniciar").removeAttribute("disabled");
    } else {
        if (chute > numeroSecreto) {
            exibirTextoNaTela('p', 'Numero Secreto e menor.');
            limparCampo();
            tentativas++;
        } else {
            exibirTextoNaTela('p', 'Numero Secreto e maior.');
            limparCampo();
            tentativas++;
        }
    }
};

function exibirMensagemInicial() {
    exibirTextoNaTela('h1', 'Jogo do número secreto');
    exibirTextoNaTela('p', 'Escolha um número entre 1 e 10');
}

function novoJogo(){
    numeroSecreto = gerarNumeroAleatorio();
    exibirMensagemInicial();
    limparCampo();
    tentativas = 1;
    document.getElementById("reiniciar").setAttribute("disabled", "");
};


function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 10 + 1);
};
let numeroSecreto = gerarNumeroAleatorio();

function exibirTextoNaTela(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
};


exibirTextoNaTela('h1', 'Jogo do Numero Secreto.');
exibirTextoNaTela('p', 'Escolha um numero entre 1 e 10.');

function verificarChute() {
    let chute = document.querySelector('input').value;
    let acerto = false;

    if(chute == numeroSecreto){
        exibirTextoNaTela('h1', 'Parabens! Voce acertou!');
        alert()
    };
    return console.log(numeroSecreto);
};

function gerarNumeroAleatorio() {
  return parseInt(Math.random() * 10 + 1);
};
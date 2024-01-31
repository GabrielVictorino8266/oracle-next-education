alert("Bem-vindo! Vamos começar!!!");
alert("Saiba que para começar, voce precisa escolher um número e vamos tentar encontrá-lo através do sorteio.");

let numeroSecreto = 30;
let numeroEscolha;



function verificaAcerto(numeroSecreto, numeroEscolha){
    let acerto = false;
    numeroEscolha = parseInt(prompt("Digite seu número da sorte entre 1 e 30: "));

    if (numeroEscolha == numeroSecreto) {
        alert('acertou');
        acerto = true;
    } else if(numeroEscolha > numeroSecreto){
        alert('Numero secreto e menor');
    } else if(numeroEscolha < numeroSecreto){
        alert('Numero secreto e maior.');
    } else {
        alert('e, nao acertou mesmo.');
    }

    return acerto;
};


while(!acerto){
    acerto = verificaAcerto(numeroSecreto, numeroEscolha);
};
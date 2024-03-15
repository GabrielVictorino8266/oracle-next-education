alert("Bem-vindo! Vamos começar!!!");
alert("Saiba que para começar, voce precisa escolher um número e vamos tentar encontrá-lo através do sorteio.");

let numeroSecreto = 30;
let numeroEscolha;




function verificaAcerto(numeroSecreto, numeroEscolha){
    numeroEscolha = parseInt(prompt("Digite seu número da sorte entre 1 e 30: "));

    
    if (numeroEscolha == numeroSecreto) {
        console.log('acertou')
    } else if(numeroEscolha > numeroSecreto){
        
    }
}


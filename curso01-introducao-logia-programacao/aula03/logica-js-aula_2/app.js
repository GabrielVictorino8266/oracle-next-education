alert('Boas vindas ao jogo do número secreto');
let numeroSecreto = 9;
console.log(numeroSecreto)
let chute;
let tentativas = 1;

//entquanto chute for diferente do n.s.
while(chute !=numeroSecreto){
    chute = prompt('Escolha um número entre 1 e 10');

    // se chute for igual ao número secreto
    if (chute == numeroSecreto) {
        alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas.`);
        tentativas++;
    } else {
        if(chute > numeroSecreto){//chute for maior
            alert(`Numero secreto e menor que ${chute}. Tentativas: ${tentativas}`);
            tentativas++;
        } else{//chute for menor
            alert(`Numero secreto e maior que ${chute}. Tentativas ${tentativas}`);
            tentativas++;
        }
    };
};
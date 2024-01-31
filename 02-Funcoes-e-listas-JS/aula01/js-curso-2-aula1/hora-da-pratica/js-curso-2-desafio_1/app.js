let titulo = document.querySelector("h1");
titulo.innerHTML = "Hora do Desafio.";

function botaoConsole(){
    return console.log("Botao Pressionado!");
};

function botaoAlerta(){
    return alert("Eu amo JS!");
};

function botaoPrompt(){
    let cidade;
    cidade = prompt("Informe uma cidade que esteve.");
    
    return alert(`Estive em ${cidade} e lembrei de voce.`);
};

function botaoSoma(){
    let numero1 = 0;
    let numero2 = 0;
    let soma;

    numero1 = parseInt(prompt("Digite um numero: "));
    numero2 = parseInt(prompt("Digite mais um numero: "));
    soma = numero1 + numero2;
    
    return alert(`A soma entre ${numero1} e ${numero2} e igual a ${soma}`)
};
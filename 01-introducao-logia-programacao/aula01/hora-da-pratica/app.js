alert('Bem-vindo ao site!');

let nome = 'Lua';
let idade = 25;
let numeroDeVendas = 50;
let saldoDisponivel = 1000;

console.log(numeroDeVendas)
console.log(saldoDisponivel)

let mensagemDeErro = 'Erro! Preencha todos os campos.';
alert(mensagemDeErro);


nome = prompt('Me dia o seu nome: ')
idade = prompt('Digite sua idade.')

if (idade >= 18){
    alert("Pode tirar habilitação!")
}


//pratica1
function helloWorld() {
    return console.log("Ola, Mundo!");
};

helloWorld();

//pratica2
function olaPessoa(nome) {
    return console.log(`Ola ${nome}!`);
};

olaPessoa('Gabriel');

//pratica3
function dobro(numero) {
    return console.log(numero*2);
};

dobro(2);

//pratica4
function media(numero1, numero2, numero3) {
  return console.log((numero1 + numero2 + numero3) / 3);  
};

media(7,8,9);

//pratica5
function maior(numero1, numero2) {
    if (numero1 > numero2) {
        console.log('Numero 1 e maior');
    } else {
        console.log('Numero 2 e maior.');
    };
}

maior(0,9)

//pratica6

function multiplicacao(numero) {
    return console.log(numero * numero);
};

multiplicacao(2);
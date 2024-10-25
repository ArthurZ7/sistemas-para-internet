// 8. Implemente o jogo Joquempô (“Pedra”, “Papel” ou “Tesoura”). A sua solução deverá gerar
// automaticamente, após o carregamento da página, a opção de cada jogador (“Pedra”, “Papel”
// ou “Tesoura”) e mostrar quem foi o ganhador (JOGADOR 1 ou JOGADOR 2). DESAFIO:
// Mostrar a imagem da “mãozinha” sorteada de cada jogador.

var nome = prompt("Qual o seu nome?")

let jogada = ["Pedra", "Papel", "Tesoura"];

var nroAleatorio = parseInt(Math.random()*3);

let jogadaComp =  jogada[nroAleatorio];
let jogadaUser = jogada[parseInt(prompt("- JOQUEMPÔ -\n\n[Pedra = 1]\n[Papel = 2]\n[Tesoura - 3]\n\nQual opção você escolhe?"))-1];


document.write(`<h1>Jogo Joquempô</h1>`);
document.write(`<section>`);
document.write(`<p>Jogada Computador: <b>${jogadaComp}</b></p>`);
document.write(`<img src="./img/${jogadaComp}.png">`);
document.write(`<p><b> X </b></p>`);
document.write(`<img src="./img/${jogadaUser}.png">`);
document.write(`<p>Jogada de ${nome}: <b>${jogadaUser}</b></p>`);
document.write(`</section>`);

document.write(`<section>`);
document.write("<h2><b>")
if ((jogadaComp == "Pedra") && (jogadaUser == "Papel")){
    document.write(`${nome} GANHOU!`);
} else if ((jogadaComp == "Pedra") && (jogadaUser == "Tesoura")){
    document.write(`COMPUTADOR GANHOU!`);
} else if ((jogadaComp == "Papel") && (jogadaUser == "Tesoura")){
    document.write(`${nome} GANHOU!`);
} else if ((jogadaComp == "Papel") && (jogadaUser == "Pedra")){
    document.write(`COMPUTADOR GANHOU!`);
} else if ((jogadaComp == "Tesoura") && (jogadaUser == "Pedra")){
    document.write(`${nome} GANHOU!`);
} else if ((jogadaComp == "Tesoura") && (jogadaUser == "Papel")){
    document.write(`COMPUTADOR GANHOU!`);
} else {
    document.write(`EMPATE!`)
}
document.write("</b></h2>")
document.write(`</section>`);


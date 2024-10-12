// 11. Crie uma página web para sortear as cartas do jogo TRUCO para os 4 jogadores. Devem
// ser sorteadas 12 cartas, 3 para cada jogador. OBS: A imagem a seguir está exibindo as cartas
// dos dois primeiros jogadores.

let cartas = [];
for (let i=1; i <= 27; i++) {
    cartas.push(i);
}

function embaralhaVetor(vetor) {
    for (let i = vetor.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [vetor[i], vetor[j]] = [vetor[j], vetor[i]]; // Troca de lugar
    }
    return vetor;
}

embaralhaVetor(cartas);

let carta = 0;

document.write("<h1>JOGUE TRUCO:</h1>");
document.write("<h2>Cartas sorteadas:</h2>");
for (let i=0; i < 4; i++) {
    document.write(`<section>`)
    document.write(`<h1>Cartas do Jogador ${i+1}:</h1>`);
    for (let j=0; j < 3; j++) {
        document.write(`<img src="./cartas/carta${cartas[carta]}.png">`);
        carta++;
    }
    document.write(`</section>`)
}
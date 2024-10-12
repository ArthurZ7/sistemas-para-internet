// 9. Crie uma página web capaz de sortear a ordem de apresentação de um grupo de pessoas a
// partir das seguintes informações: número de pessoas e o nome de cada uma delas. Após a
// entrada dessas informações a página deverá ser capaz de exibir ao usuário, no corpo do
// documento, a sequência das apresentações, conforme mostrado na imagem a seguir:

var numPessoas = parseInt(prompt("Quantas pessoas são? "));
let nomePessoas = [];
let nroAleatorio = [parseInt(Math.random()*numPessoas)];

for (let i=0; i < numPessoas; i++) {
    nomePessoas[i] = prompt(`Qual o ${i+1}º nome: `);
}

function embaralhaVetor(vetor) {
    for (let i = vetor.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [vetor[i], vetor[j]] = [vetor[j], vetor[i]]; // Troca de lugar
    }
    return vetor;
}

embaralhaVetor(nomePessoas);


document.write(`<h1>Ordem de apresentação dos grupos</h1>`)
document.write(`<section>`)
for (let i=0; i < numPessoas; i++) {
    document.write(`<p>${i+1}º - ${nomePessoas[i]}</p>`)
}
document.write(`</section>`)

// 5. Você irá participar de um evento organizado pela empresa Google e você, juntamente com os
// seus colegas, irão de ônibus para ele. O guia da excursão precisa saber a idade média dos
// passageiros e sortear o nome de uma pessoa para ganhar o almoço na primeira parada do
// ônibus. Proponha uma solução web, utilizando JavaScript, para resolver esse problema.

let passageirosNome = [];
let passageirosIdade = [];
let idadeTotal = 0;

qntPassageiros = parseInt(prompt("Quantos são os passageiros? "));

for (let i=0; i < qntPassageiros; i++) {
    passageirosNome[i] = prompt(`Qual o nome do passageiro ${i+1}? `);
    passageirosIdade[i] = parseInt(prompt(`Qual a idade de ${passageirosNome[i]}? `));

    idadeTotal += passageirosIdade[i];
    
    document.write(`<p>Passageiro ${i+1}: ${passageirosNome[i]} - ${passageirosIdade[i]} anos</p>`)
}

document.write(`<p>A idade média dos passageiros é: ${idadeTotal/qntPassageiros}</p>`)

var nroAleatorio = parseInt(Math.random()*qntPassageiros);

document.write(`<p style="font-weight:bold">> Quem ganhou o almoço foi: ${passageirosNome[nroAleatorio]}</p>`)
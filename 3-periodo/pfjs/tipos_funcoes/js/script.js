window.addEventListener("DOMContentLoaded", () => {

// 1. Implemente uma solução em JavaScript para retornar a soma de idades de pessoas armazenadas num vetor. OBS: É necessário utilizar o conceito de arrow functions.

    const sumAges = (vet) => {
        let sum = 0;
        for (let i = 0; i < vet.length; i++) 
            sum += vet[i];
        return sum;
    }
    const vetAges = [10, 21, 31, 40];
    
    document.write(`<p>(a) Soma das idades = ${sumAges(vetAges)}</p>`);

// 2. Em relação ao exercício anterior, informe também no corpo da página do navegador os seguintes resultados (OBS: utilize sempre arrow function para solucionar cada um dos problemas abaixo). Cada resultado abaixo deverá ser exibido num parágrafo diferente.
// a) A média aritmética simples das idades

    const avgAges = (vet) => {
        let sum = 0;
        for (let i = 0; i < vet.length; i++) 
            sum += vet[i];
        return sum / vetAges.length;
    }

    document.write(`<p>(b) Média das idades = ${avgAges(vetAges)}</p>`);

// b) A maior idade
    
    const bigAge = (vet) => {
        let maior = 0;
        for (var i = 0; i < vet.length; i++)
            if (vet[i] >= maior) maior = vet[i];
        return maior;
    }
        
    document.write(`<p>(c) Maior das idades = ${bigAge(vetAges)}</p>`);

// c) As idades ímpares
    
    const oddAges = (vet) => {
        let odd = [];
        for (let i = 0; i < vet.length; i++) 
            if (vet[i] % 2 != 0) odd.push(vet[i]);
        return odd;
    }

    document.write(`<p>(d) Idades ímpares = ${oddAges(vetAges)}</p>`);

// d) Verificar se todos são maiores de idade (idade >= 18); Retorno: true ou false
    
    const over18Age = (vet) => {
        return vet.every(elemento => elemento >= 18);
    }

    document.write(`<p>(e) Maior de idade? ${over18Age(vetAges)}</p>`);

// e) Verificar se todas as idades são maiores ou iguais a um valor informado pelo usuário

    const valor = parseInt(prompt("Informe um valor de referência para comparação das idades: "));
    
    const AgesBiggerRef = (vet, valor) => {
        return vet.some(elemento => elemento >= valor);
    }
    
    document.write(`<p>(f) Todas as idades são maiores que ${valor}? ${AgesBiggerRef(vetAges, valor)}</p>`);

// f) Exibir todas as idades maiores ou iguais a determinada idade

    const PrintAgesRef = (vet, valor) => {
        return vet.filter(elemento => elemento >= valor);
    }

    const vetor = PrintAgesRef(vetAges, valor);

    document.write(`<p>(g) Idades maiores que ${valor} = `);
    
    for (let i = 0; i < vetor.length; i++) {
        document.write(`${vetor[i]}; `);
    }
    document.write(`</p>`);

// g) A média das idades das pessoas com idades maiores ou iguais a determinada idade
    
    const avgAgesRef = (vet, valor) => {
        let sum = 0;
        let count = 0;
        for (let i = 0; i < vet.length; i++) {
            if (vet[i] >= valor) {
                sum += vet[i];
                count++;
            }
        }
        return sum / count;
    }

    document.write(`<p>(h) Média das idades maiores que ${valor} = ${avgAgesRef(vetAges, valor)}</p>`);

});

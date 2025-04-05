window.addEventListener("DOMContentLoaded", () => {

document.write("<h2>Lista 02-A - Métodos de Array</h2>");
const vetAges = [10, 21, 31, 40, 52, 15];

// a) A soma das idades
    const sumAges = (vet) => {
        let sum = 0;
        vet.forEach(age => sum += age);
        return sum;
    }
    
    document.write(`<p>(a) Soma das idades = ${sumAges(vetAges)}</p>`);

// b) A média aritmética simples das idades

    const avgAges = (vet) => {
        let sum = 0;
        vet.forEach(age => sum += age);
        return sum / vetAges.length;
    }

    document.write(`<p>(b) Média das idades = ${avgAges(vetAges)}</p>`);

// c) A maior idade
    
    const bigAge = (vet) => {
        let maior = 0;
        vet.forEach(age => {
            if (age >= maior) maior = age;
        });
        return maior;
    }
        
    document.write(`<p>(c) Maior das idades = ${bigAge(vetAges)}</p>`);

// d) As idades ímpares
    
    const oddAges = (vet) => {
        let odd = [];
        vet.forEach(age => {
            if (age % 2 != 0) odd.push(age);
        });
        return odd;
    }

    document.write(`<p>(d) Idades ímpares = ${oddAges(vetAges)}</p>`);

// e) Verificar se todos são maiores de idade (idade >= 18); Retorno: true ou false
    
    const over18Age = (vet) => {
        return vet.every(elemento => elemento >= 18);
    }

    document.write(`<p>(e) Maior de idade? ${over18Age(vetAges)}</p>`);

// f) Verificar se todas as idades são maiores ou iguais a um valor informado pelo usuário

    const valor = parseInt(prompt("Informe um valor de referência para comparação das idades: "));

    const AgesBiggerRef = (vet, valor) => {
        return vet.some(elemento => elemento >= valor);
    }
    
    document.write(`<p>(f) Todas as idades são maiores que ${valor}? ${AgesBiggerRef(vetAges, valor)}</p>`);

// g) Exibir todas as idades maiores ou iguais a determinada idade

    const PrintAgesRef = (vet, valor) => {
        return vet.filter(elemento => elemento >= valor);
    }

    const vetor = PrintAgesRef(vetAges, valor);

    document.write(`<p>(g) Idades maiores que ${valor} = `);
    
    for (let i = 0; i < vetor.length; i++) {
        document.write(`${vetor[i]}; `);
    }
    document.write(`</p>`);

// h) A média das idades das pessoas com idades maiores ou iguais a determinada idade
    
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

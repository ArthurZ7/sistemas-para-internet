window.addEventListener("DOMContentLoaded", () => {

    const maior = (a, b) => (a > b) ? a : b;
    maior(120, 130);

    const vet = [25, 3, 10, 9, 23, 22, 10, 4];
    const ref = 20;

    // construir uma arrow function que receba dois parâmetros. Ela deverá retornar o maior valor. Use o operador ternário 

    // Crie uma funcao que dado um VET e um VALOR, retorna um vetor contendo todos os valores do vetor maiores ou igual a VALOR. Em seguida, exiba todos os valores encontrados no console, utilizando forEach.
    
    const maioresRef = (vet, ref) => {
        var vetMaiores = [];
        for (var i=0; i<vet.length; i++)
            if (vet[i] >= ref) vetMaiores.push(vet[i])
        return vetMaiores
    }

    const imprimirVet = (vet) => {
        vet.forEach((elemento, i) => console.log(`${i} = ${elemento}`));
    }

    imprimirVet(maioresRef(vet, ref))


    // MAP
    console.log(vet.map(elemento => elemento *2))
    
    // FILTER
    // em relação a const vet = [10, 5, 75, 21, 33]; exiba todos os elementos maiores ou iguais a 15
    const vet1 = [10, 5, 75, 21, 33]
    console.log(vet1.filter(elemento => elemento >= 15))

    // Cada um dos(todos) elementos são maiores que 15?
    // EVERY
    console.log(vet1.every(elemento => elemento >= 15))
    
    // Algum dos elementos é maior do que 15?
    // SOME
    console.log(vet1.some(elemento => elemento >= 15));
    
    // REDUCE
    console.log(vet1.reduce((soma, elemento) => soma += 15, 0));

    
})
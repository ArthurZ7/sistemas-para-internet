window.addEventListener("DOMContentLoaded", () => {

    const pessoas = [
        {nome: "Ana", idade: 18, genero: "F", salario: 1000},
        {nome: "João", idade: 20, genero: "M", salario: 3000},
        {nome: "César", idade: 33, genero: "M", salario: 1900},
        {nome: "Maria", idade: 12, genero: "F", salario: 7000},
        {nome: "Zé", idade: 17, genero: "M", salario: 2400}
    ];

    console.table(pessoas)
    
    // Exibir o nome e idade de todas as pessoass maiores de idade
    console.table("-- Ex1")
    pessoas.forEach(pessoas => {
        if (pessoas.idade >= 18)
        console.log(`Nome: ${pessoas.nome}; Idade:${pessoas.idade}`);
});

    // Exibir os nomes de todas as pessoass do sexo masculino
    console.table("-- Ex2")
    pessoas.forEach(pessoas => {
        if (pessoas.genero == "M")
            console.log(`Nome: ${pessoas.nome}`);
    });

    // Exibir os dados da pessoas com o maior salario
    console.table("-- Ex3")
    // pessoas.filter(elemento => elemento)

    // Há alguma mulher que ganha acima de 5000,00?
    console.table("-- Ex4")
    console.log(pessoas.some(pessoas => pessoas.salario >= 5000));

    // Média dos salarios dos homens e das mulheres
    console.table("-- Ex5")
    console.log(pessoas.reduce((soma, pessoas) => soma + pessoas.salario, 0)/ pessoas.length);

    
})
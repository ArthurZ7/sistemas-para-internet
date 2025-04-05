window.addEventListener("DOMContentLoaded", () => {

    document.write("<h2>Lista 02-B - Métodos de Array JSON</h2>");

    const pessoas = [
        {nome: "Ana", idade: 18, genero: "F", salario: 1000},
        {nome: "João", idade: 20, genero: "M", salario: 3000},
        {nome: "César", idade: 33, genero: "M", salario: 1900},
        {nome: "Maria", idade: 12, genero: "F", salario: 7000},
        {nome: "Zé", idade: 17, genero: "M", salario: 2400}
    ];

    // Criar tabela HTML
    let tabela = `
        <style>
            * {
                font-family: Arial, sans-serif;
            }
            table {
                width: 100%;
                border-collapse: collapse;
                margin: 20px 0;
                font-size: 14px;
                text-align: center;
            }
            th, td {
                padding: 4px;
                border: 1px solid #ddd;
            }
            th {
                background-color: #f4f4f4;
                color: #333;
            }
            tr:nth-child(even) {
                background-color: #f9f9f9;
            }
            tr:hover {
                background-color: #f1f1f1;
            }
        </style>
        <table>
            <tr>
                <th>Nome</th>
                <th>Idade</th>
                <th>Gênero</th>
                <th>Salário</th>
            </tr>`;
    pessoas.forEach(pessoa => {
        tabela += `<tr>
            <td>${pessoa.nome}</td>
            <td>${pessoa.idade}</td>
            <td>${pessoa.genero}</td>
            <td>${pessoa.salario}</td>
        </tr>`;
    });
    tabela += "</table>";

    // Exibir tabela
    document.write(tabela);
    
    // Exibir o nome e idade de todas as pessoas maiores de idade
    document.write("<h3>Ex1: Nome e idade de todas as pessoas maiores de idade</h3>");
    pessoas.forEach(pessoa => {
        if (pessoa.idade >= 18)
            document.write(`<p>Nome: ${pessoa.nome}; Idade: ${pessoa.idade}</p>`);
    });

    // Exibir os nomes de todas as pessoas do sexo masculino
    document.write("<h3>Ex2: Nomes de todas as pessoas do sexo masculino</h3>");
    pessoas.forEach(pessoa => {
        if (pessoa.genero == "M")
            document.write(`<p>Nome: ${pessoa.nome}</p>`);
    });

    // Exibir os dados da pessoa com o maior salário
    document.write("<h3>Ex3: Dados da pessoa com o maior salário</h3>");
    const maiorSalario = pessoas.reduce((max, pessoa) => pessoa.salario > max.salario ? pessoa : max, pessoas[0]);
    document.write(`<p>Nome: ${maiorSalario.nome}; Idade: ${maiorSalario.idade}; Gênero: ${maiorSalario.genero}; Salário: ${maiorSalario.salario}</p>`);

    // Há alguma mulher que ganha acima de 5000,00?
    document.write("<h3>Ex4: Há alguma mulher que ganha acima de 5000,00?</h3>");
    const mulherAcima5000 = pessoas.some(pessoa => pessoa.genero === "F" && pessoa.salario >= 5000);
    document.write(`<p>${mulherAcima5000 ? "Sim" : "Não"}</p>`);

    // Média dos salários dos homens e das mulheres
    document.write("<h3>Ex5: Média dos salários dos homens e das mulheres</h3>");
    const salariosHomens = pessoas.filter(pessoa => pessoa.genero === "M").reduce((soma, pessoa) => soma + pessoa.salario, 0);
    const salariosMulheres = pessoas.filter(pessoa => pessoa.genero === "F").reduce((soma, pessoa) => soma + pessoa.salario, 0);

    const qtdHomens = pessoas.filter(pessoa => pessoa.genero === "M").length;
    const qtdMulheres = pessoas.filter(pessoa => pessoa.genero === "F").length;
    
    const mediaHomens = qtdHomens > 0 ? (salariosHomens / qtdHomens).toFixed(2) : 0;
    const mediaMulheres = qtdMulheres > 0 ? (salariosMulheres / qtdMulheres).toFixed(2) : 0;

    document.write(`<p>Média dos salários dos homens: ${mediaHomens}</p>`);
    document.write(`<p>Média dos salários das mulheres: ${mediaMulheres}</p>`);
});
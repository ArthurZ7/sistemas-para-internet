// 3. Refaça o exercício anterior utilizando a estrutura de repetição FOR IN.

var disciplinas = ["Projeto Sistema Web MVC e SQL", "Algoritmos e Programação", "Programação Orientada a Objetos 1", "Fundamentos de Banco de Dados", "JavaScript Básico"]
var cod_Disciplinas = ["P2", "AP", "POO1", "FBD", "JSB"]

document.write("<table>")
document.write(`    <tr>`)
document.write(`        <th>Código</td>`)
document.write(`        <th>Disciplina</td>`)
document.write(`    </tr>`)

for (i in disciplinas) {
    document.write(`    <tr>`)
    document.write(`        <td>${cod_Disciplinas[i]}</td>`)
    document.write(`        <td>${disciplinas[i]}</td>`)
    document.write(`    </tr>`)

}
document.write(`</table>`)
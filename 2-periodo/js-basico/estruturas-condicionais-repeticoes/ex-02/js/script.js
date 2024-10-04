// 2. Construa um script para mostrar no corpo do documento de uma página web os códigos e
// nomes das disciplinas do 2o período do curso de Tecnologia em Sistemas para Internet do
// IFTM campus Uberlândia (MG),

var disciplinas = ["Projeto Sistema Web MVC e SQL", "Algoritmos e Programação", "Programação Orientada a Objetos 1", "Fundamentos de Banco de Dados", "JavaScript Básico"]
var cod_Disciplinas = ["P2", "AP", "POO1", "FBD", "JSB"]

document.write("<table>")
document.write(`    <tr>`)
document.write(`        <th>Código</td>`)
document.write(`        <th>Disciplina</td>`)
document.write(`    </tr>`)

for (var i = 0; i < disciplinas.length; i++) {
    document.write(`    <tr>`)
    document.write(`        <td>${cod_Disciplinas[i]}</td>`)
    document.write(`        <td>${disciplinas[i]}</td>`)
    document.write(`    </tr>`)

}
document.write(`</table>`)
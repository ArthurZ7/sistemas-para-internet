var totalPassageiros = prompt("Quantos passageiros vão entrar?");

var homens = [];
var mulheres = [];
var sexo;


for (var i = 0; i < totalPassageiros; i++) {
    // Leitura do Sexo
    sexo = prompt(`Qual o sexo do passageiro ${i + 1} (H ou M):`)
    // Leitura do nome de cada passageiro
    nome = prompt(`Qual o nome do passageiro ${i + 1}:`)

    if ((sexo == "H") || (sexo == "h"))
        homens.push(nome);
    else if ((sexo == "M") || (sexo == "m"))
        mulheres.push(nome);
}

var nroIteracoes;

if (homens.length > mulheres.length)
    nroIteracoes = homens.length;
else
    nroIteracoes = mulheres.length;


document.write("<table>")
document.write(`    <tr>`)
document.write(`        <th>Homens</td>`)
document.write(`        <th>Mulheres</td>`)
document.write(`    </tr>`)

for (var i = 0; i < nroIteracoes; i++) {
    document.write(`    <tr>`)
    if (homens[i] != undefined)
        document.write(`        <td>${homens[i]}</td>`)
    else
        document.write("        <td><p> [-] </p></td>")
    if (mulheres[i] != undefined)
        document.write(`        <td>${mulheres[i]}</td>`)
    else
        document.write("        <td><p> [-] </p></td>")
    document.write(`    </tr>`)

}

document.write(`</table>`)
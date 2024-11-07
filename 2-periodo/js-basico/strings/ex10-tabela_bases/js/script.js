// 10. Construa uma página web capaz de solicitar ao usuário um valor inteiro positivo maior ou
// igual 2 e, em seguida, a partir do número lido, exibir uma tabela no corpo do documento da
// página, conforme mostrado no exemplo a seguir, contendo os valores de 0 (zero) até o
// número informado pelo usuário nos seguintes sistemas de numeração: decimal, binário e
// hexadecimal.
// • Exemplo: número informado = 3
// • Tabela gerada e exibida no corpo do documento:

var num = parseInt(prompt("Digite um valor maior ou igual 2: "));

var base10 = [];
var base2 = [];
var base16 = [];

for (var i=0; i<num; i++){

    // DECIMAL
    base10 [i] = i;

    // BINÁRIO
    base2[i] =  i.toString(2);

    // HEXADECIMAL
    base16[i] = i.toString(16).toUpperCase();
}

console.log(base10)
console.log(base2)
console.log(base16)

document.write(`<table>`)
document.write(`
    <tr>
        <th>Base decimal</th>
        <th>Base binária</th>
        <th>Base hexadecimal</th>
    </tr>
`);

for (var i=0; i<num; i++){
    document.write(`<tr>`)
    document.write(`<td>${base10[i]}</td>`)
    document.write(`<td>${base2[i]}</td>`)
    document.write(`<td>${base16[i]}</td>`)
    document.write(`</tr>`)
}
document.write(`</table>`)




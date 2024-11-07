// 6. Construa uma página web capaz de solicitar um texto e informar no corpo do documento a
// concatenação da primeira com a última palavra do texto (deve haver um espaço entre as
// palavras).

var texto = prompt("Digite um texto: ");

var vetPartesTexto = texto.split(" ");

var primeiraPal = vetPartesTexto[0]
var ultimoPal = vetPartesTexto[vetPartesTexto.length - 1]

document.write(`<h1>${primeiraPal} ${ultimoPal}</h1>`)
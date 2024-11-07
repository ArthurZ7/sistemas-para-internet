// 5. Construa uma página web capaz de solicitar do usuário um texto qualquer e, em seguida,
// informar através de uma mensagem de alerta a quantidade de palavras contidas no texto.


var texto = prompt("Escreva um texto: ");

var qntPalavras = (texto.split(" ")).length; 

alert(qntPalavras);
// 2. Construa uma página web capaz de solicitar o nome completo do usuário e, em seguida,
// escrever no corpo do documento o nome informado e a quantidade de caracteres presentes no
// texto.


var nome = prompt("Digite seu nome completo: ")

var qntCaracter = nome.length;

document.write(`<p>O nome <b>${nome}</b> possui ${qntCaracter} caracteres</p>`)

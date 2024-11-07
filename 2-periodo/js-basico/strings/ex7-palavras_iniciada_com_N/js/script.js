// 7. Construa uma página web capaz de solicitar um texto e uma letra e informar no corpo do
// documento apenas as palavras iniciadas com a letra informada (deve haver um espaço entre
// as palavras).

var texto = prompt("Escreva um texto: ");

var letra = prompt("Escolha uma letra: ");

var vetPalavras = (texto.split(" ")); 

document.write(`<h1>Palavras iniciadas com ${letra}</h1>`)
for (var p in vetPalavras){
    if (vetPalavras[p].charAt(0) == letra){
        document.write(`${vetPalavras[p]} `)
    }
}
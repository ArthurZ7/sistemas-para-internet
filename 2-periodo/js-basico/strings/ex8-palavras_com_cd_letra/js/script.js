// 8. Construa uma página web capaz de solicitar um texto e exibir no corpo do documento todas
// as palavras iniciadas com a letra ‘a’, seguidas das palavras iniciadas com a letra ‘b’, e assim
// sucessivamente. Veja o exemplo abaixo:

var letras = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];

var texto = prompt("Escreva um texto: ");

var vetPalavras = (texto.split(" ")); 
vetPalavras.sort();

var letrasUsadas = [];

for (var i in letras){
    var letraEncontrada = false;
    for (var j in vetPalavras) {
        if (vetPalavras[j].charAt(0).toLowerCase() === letras[i]) {
            letraEncontrada = true;
            break;
        }
    }
    if (letraEncontrada) {
        letrasUsadas.push(letras[i]);
    }
}

for (var letra in letrasUsadas){
    document.write(`<p>Palavras iniciadas com a ${letrasUsadas[letra].toUpperCase()}: </p>`)
    
    document.write("<ul>")
    for (var p in vetPalavras){
        if (vetPalavras[p].charAt(0).toLowerCase() == letrasUsadas[letra]){
            document.write(`<li>${vetPalavras[p]}</li>`)
        }
    }
    document.write("</ul>")
} 

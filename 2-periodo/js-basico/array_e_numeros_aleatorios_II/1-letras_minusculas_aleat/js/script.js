// 1) Crie um script para exibir uma letra minúscula aleatória no console do navegador.

let letras = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];

var letraAleatoria = letras[parseInt(Math.random() * 26)];

document.write("<h1>" + letraAleatoria + "</h1>")
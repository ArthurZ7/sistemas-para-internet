// 2) Crie um script para exibir uma letra maiúscula aleatória no console do navegador.

let letras = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];

let letrasMaiusculas = [];

for (var i = 0; i < letras.length; i++) {
    letrasMaiusculas[i] = letras[i].toUpperCase();
}

var letraAleatoria = letrasMaiusculas[parseInt(Math.random() * 26)];

document.write("<h1>" + letraAleatoria + "</h1>")
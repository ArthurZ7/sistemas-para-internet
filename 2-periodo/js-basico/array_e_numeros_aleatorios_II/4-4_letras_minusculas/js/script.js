// 4) Crie um script para exibir 4 letras minúsculas aleatórias no console do navegador.

let letras = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];

let quatroletrasAleat = "";

for (let i = 0; i < 4; i++) {
    var letraAleatoria = letras[parseInt(Math.random() * 26)];
    quatroletrasAleat += letraAleatoria;
}

document.write("<h1>" + quatroletrasAleat + "</h1>")

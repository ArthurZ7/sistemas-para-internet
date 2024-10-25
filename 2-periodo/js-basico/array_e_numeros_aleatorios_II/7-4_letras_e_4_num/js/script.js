// 7) Crie um script para exibir 4 letras minúsculas aleatórias seguidas de 4 números aleatórios
// no console do navegador.

let letras = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"];

let oitoAlfanumericos = "";

for (var i = 0; i < 4; i++) {
    oitoAlfanumericos += letras[parseInt(Math.random() * 26)];
}

for (var i = 0; i < 4; i++) {
    oitoAlfanumericos += parseInt(Math.random() * 10);
}

document.write("<h1>" + oitoAlfanumericos + "</h1>")
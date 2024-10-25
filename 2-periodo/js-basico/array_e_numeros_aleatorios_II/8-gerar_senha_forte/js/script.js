// 8) Crie um script para gerar senhas fortes no console do navegador. Um senha será forte se
// for composta por uma sequência de 8 caracteres formados aleatoriamente por letras
// minúsculas, maiúsculas e números.

let alfanumericos = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

let senhaForte = "";

for (var i = 0; i < 8; i++) {
    senhaForte += alfanumericos[parseInt(Math.random() * 62)];
}

document.write("<h1>" + senhaForte + "</h1>")
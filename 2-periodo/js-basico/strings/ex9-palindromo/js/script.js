// 9. Construa uma página web capaz de solicitar um texto e informar através de uma mensagem
// de alerta se o texto informado é um palíndromo.

var texto = prompt("Digite um texto: ")

texto = texto.trim().toLowerCase();

var vetTexto = texto.split("");

var textoInverso = (vetTexto.reverse()).join("")

console.log(texto)
console.log(textoInverso)

if (texto == textoInverso) {
    alert(`${texto} é um palíndromo!`)
} else {
    alert(`${texto} NÃO é um palíndromo!`)
}

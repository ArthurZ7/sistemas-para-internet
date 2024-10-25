// 4. Construa uma página web para exibir no corpo da página (document.write) um número
// aleatório entre N e M, onde N e M deverão ser informados pelo usuário.

numInicial = parseInt(prompt("Insira um número inicial: "))
numFinal = parseInt(prompt("Insira um número final: "))

var nroAleatorio = parseInt(Math.random() * (numFinal - numInicial + 1)) + numInicial;

document.write("<h1>" + nroAleatorio + "</h1>")
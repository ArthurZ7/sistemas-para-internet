// 4. Construa uma página web para exibir no corpo da página (document.write) um número
// aleatório entre N e M, onde N e M deverão ser informados pelo usuário.

num1 = parseInt(prompt("Insira um número inicial: "))
num2 = parseInt(prompt("Insira um número final: "))

var nroAleatorio = parseInt(Math.random()*num2)+num1;

document.write("<h1>" + nroAleatorio + "</h1>")
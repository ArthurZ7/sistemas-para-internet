// 3. Construa uma página web para exibir no corpo da página (document.write) um número
// aleatório entre 1 e N, onde N deverá ser um número informado pelo usuário.

num = parseInt(prompt("Insira um número: "))

var nroAleatorio = parseInt(Math.random()*num)+1;

document.write("<h1>" + nroAleatorio + "</h1>")
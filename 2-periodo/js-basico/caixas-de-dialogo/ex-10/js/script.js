// 10. Construa uma página web capaz de solicitar do usuário um valor inteiro positivo (X) maior
// do que zero e, em seguida, o nome completo dele. Exiba no corpo do documento HTML o
// nome da pessoa informado X vezes. Os nomes deverão ser exibidos em linhas diferentes.

x = parseInt(prompt("Insira um valor inteiro: "))

if (x<=0) {
    x = parseInt(prompt("O valor deve ser maior que 0"))
}

nome = prompt("Insira seu nome completo: ")

for (i=0; i<x; i++ )
    document.write("<h3>" + nome + "</h3>")

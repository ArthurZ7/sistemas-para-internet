// 1. Interprete o código abaixo (não use o navegador) e descubra o que ele faz.

// Em seguida, você deverá executar o código acima no navegador e conferir a resposta produzida
// com a sua resposta. Agora, altere o código-fonte acima de tal forma a atender os seguintes
// requisitos:
// • Ao invés de solicitar o nome completo da pessoa, a página deverá solicitar: o primeiro
// nome e, em seguida, o sobrenome, em caixas de diálogo diferentes. Em seguida exibir o
// nome completo da pessoa (nome + sobrenome) N vezes no corpo da página, um em cada
// linha diferente, conforme mostrado no código acima. OBS: A quantidade N deverá ser
// informada pelo usuário, através de uma caixa de diálogo.
// • A página deverá solicitar também do usuário a cor que ele deseja ver no nome dele. A
// aplicação da cor no nome completo deverá obedecer a seguinte sequência: 1o nome –
// PRETO, 2o nome – COR INFORMADA PELO USUÁRIO, 3o nome – PRETO, 4o nome
// - COR INFORMADA PELO USUÁRIO, e assim sucessivamente.


var nome = prompt("Qual o seu primeiro nome?");
var sobrenome = prompt("Qual o seu sobrenome?");

var n = prompt("Quantas vezes o nome deve repetir?")

var cor = prompt("Qual cor você deseja ver seu nome? (ingles)")

for (i=1; i<=n; i++)
    if (i%2==0){
        document.write(`<p style="color: ${cor}"> ${i} - ${nome} ${sobrenome}</p>`)
    } else {
        document.write(`<p style="color: black"> ${i} - ${nome} ${sobrenome}</p>`)
    }

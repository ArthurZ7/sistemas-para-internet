// 6. Crie uma página web capaz de solicitar ao usuário o nome completo dele. Em seguida, mostre
// o nome digitado no corpo da página, contendo a seguinte formatação:
// • Cor: vermelho
// • Tamanho da fonte: 20px
// • Alinhamento: centralizado

nome = prompt("Por favor, insira seu nome completo: ")

document.write(`<p style="color: red; font-size:20px; text-align:center">${nome}</p>`)
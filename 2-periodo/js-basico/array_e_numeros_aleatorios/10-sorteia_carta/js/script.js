// 10. Cria uma página web para sortear uma carta do baralho (anexo) e exibi-la no corpo do
// documento.

var cartaSorteada = parseInt((Math.random()*27)+1); //Sortear um numero de 1 a 27.

document.write("<h1>Carta do baralho sorteada:</h1>");
document.write(`<img src="./cartas/carta${cartaSorteada}.png">`);

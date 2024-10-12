// 6. Construa uma página web para gerar e mostrar no corpo do documento uma sugestão de 6
// (seis) números da mega sena.

var nroAleatorio = 0;

document.write("<h1>")
for (let i=0; i < 6; i++) {
    nroAleatorio = parseInt(Math.random()*100);
    document.write(`${nroAleatorio}`)
    if (i < 5) {
        document.write(" - ");
    }
}
document.write("</h1>")

// 6) Crie um script para exibir 4 números aleatórios no console do navegador.

let numsAleat = "";

for (var i = 0; i < 4; i++) {
    numsAleat += parseInt(Math.random() * 10);
}
document.write("<h1>" + numsAleat + "</h1>")
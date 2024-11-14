function exibirMsg(msg) {
    alert(msg);
}

var btn1 = document.getElementById("btn1");
var btn2 = document.getElementById("btn2");

btn1.onclick = function () {
    exibirMsg("Você clicou aqui");
}
exibirMsg;
btn2.onmouseenter = function () {
    exibirMsg("Você colocou o mouse aqui");
}
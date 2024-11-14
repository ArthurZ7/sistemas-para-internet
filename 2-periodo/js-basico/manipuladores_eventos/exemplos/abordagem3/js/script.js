function exibirMsg(msg) {
    alert(msg);
}

var btn = document.getElementById("btn1");

btn.addEventListener("click", function () {
    exibirMsg("Clicou");
});

btn.addEventListener("mouseout", function () {
    exibirMsg("Tchau");
});

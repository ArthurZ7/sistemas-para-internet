var btnExibir = document.getElementById("btnExibir");
var nome = document.getElementById("txtNome");
var sobrenome = document.getElementById("txtSobrenome");
var nomeComp = document.getElementById("txtNomeComp");

btnExibir.addEventListener("click", function () {
    nomeComp.value = `${nome.value} ${sobrenome.value}`;
});
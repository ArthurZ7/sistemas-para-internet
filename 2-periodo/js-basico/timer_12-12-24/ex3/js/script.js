window.addEventListener("DOMContentLoaded", function () {

    var nome1 = document.getElementById("nome1")
    var nome2 = document.getElementById("nome2")
    var text = document.getElementById("text")
    var btnExibir = document.getElementById("btnExibir")

    btnExibir.addEventListener("click", function () {
        setTimeout(copiarTxt, 1000);
    })

    function copiarTxt() {
        nome2.value = nome1.value;
        text.innerHTML = nome1.value;
    }

});

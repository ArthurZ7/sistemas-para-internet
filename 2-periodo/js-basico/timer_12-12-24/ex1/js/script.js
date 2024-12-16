// Executa o script após o carregamento do DOM
window.addEventListener("DOMContentLoaded", function () {

    var btnPlay = document.getElementById("btnPlay");
    var btnPause = document.getElementById("btnPause");
    var btnStop = document.getElementById("btnStop");
    var contador = document.getElementById("contador");

    var cont = 0;
    var idCronometro = null;
    btnPlay.addEventListener("click", function () {
        idCronometro = setInterval(incrementar, 100);
    });

    btnPause.addEventListener("click", function () {
        clearInterval(idCronometro);
    });

    btnStop.addEventListener("click", function () {
        clearInterval(idCronometro);
        contador.innerHTML = 0;
        cont = 0;
    });

    function incrementar() {
        contador.innerHTML = ++cont;
    }

});

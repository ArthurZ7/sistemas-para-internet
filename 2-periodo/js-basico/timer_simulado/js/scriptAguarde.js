window.addEventListener("DOMContentLoaded", function () {
    var tempo = document.getElementById("tempo");

    var nroAleatorio = parseInt(Math.random() * 6) + 5;

    tempo.innerHTML = nroAleatorio;

    var contagem = setInterval(function () {
        nroAleatorio--;
        tempo.innerHTML = nroAleatorio;

        if (nroAleatorio <= 3) {
            tempo.style.color = "red";
        }

        if (nroAleatorio <= 0) {
            clearInterval(contagem);
            window.location.href = "./varVeiculos.html";
        }
    }, 1000);
});
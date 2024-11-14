var candidatos = document.querySelectorAll(".candidato");
var votos = Array(candidatos.length).fill(0);

function contaVoto(index) {
    votos[index]++;
    document.getElementById(`voto${index}`).innerHTML = votos[index];
}

candidatos.forEach(function (candidato, index) {
    candidato.addEventListener("click", function () {
        contaVoto(index);
    });
});

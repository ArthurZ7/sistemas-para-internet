window.addEventListener("DOMContentLoaded", function () {
    var btnVoltar = document.getElementById("btn-voltar");
    
    var vetVeiculos = [
        {img:"civic.jpg", fabricante:"Honda", nome:"Civic", potencia:"150 cv", garantia:"3 anos", consumo:"9,7 km/l"},
        {img:"corolla.jpg", fabricante:"Toyota", nome:"Corolla", potencia:"144 cv", garantia:"3 anos", consumo:"10,6 km/l"},
        {img:"troller.jpg", fabricante:"Ford", nome:"Troller", potencia:"200 cv", garantia:"3 anos", consumo:"7,7 km/l"},
        {img:"wrangler.jpg", fabricante:"Jeep", nome:"Wrangler", potencia:"199 cv", garantia:"2 anos", consumo:"3,1 km/l"}
    ];

    var idCron = null;
    var slideShow = document.getElementById("slideShow");
    var nomeUser = document.getElementById("nomeUser");
    
    var passatempo = localStorage.getItem("passatempo");
    var user = localStorage.getItem("nome");
    
    var fabricante = document.getElementById("fabricante");
    var nomeCarro = document.getElementById("nomeCarro");
    var potencia = document.getElementById("potencia");
    var garantia = document.getElementById("garantia");
    var consumo = document.getElementById("consumo");
    
    nomeUser.innerHTML = user;
    var slideAtual;
    if (passatempo == "b") {
        slideAtual = 0;
    } else {
        slideAtual = 2;
    }

    function mostrarImg() {
        validaImg();
        slideShow.src= `img/${vetVeiculos[slideAtual].img}`;
        fabricante.innerHTML = vetVeiculos[slideAtual].fabricante;
        nomeCarro.innerHTML = vetVeiculos[slideAtual].nome;
        potencia.innerHTML = vetVeiculos[slideAtual].potencia;
        garantia.innerHTML = vetVeiculos[slideAtual].garantia;
        consumo.innerHTML = vetVeiculos[slideAtual].consumo;
        slideAtual++;
    }

    function validaImg() {
        if (passatempo == "b" && slideAtual == 2) {
            slideAtual = 0;
        } else if (passatempo == "c" && slideAtual == 4) {
            slideAtual = 2;
        }
    }

    mostrarImg();
    idCron = setInterval(mostrarImg, 2000);

    btnVoltar.addEventListener("click", function (){
        window.location.href = "./index.html";
    })

})
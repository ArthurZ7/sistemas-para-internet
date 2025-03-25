window.addEventListener("DOMContentLoaded", function () {

    var btnMario = document.getElementById("btnMario");
    var btnLuigi = document.getElementById("btnLuigi");
    var img = document.getElementById("img");
    var contMario = 0
    var contLuigi = document.getElementById("contLuigi");

    var imgMario = "../img/mario.gif";
    var imgLuigi = "../img/luigi.gif";


    btnMario.addEventListener("click", function () {
        img.src = imgMario;
        contMario = document.getElementById("contMario");
    })

    btnLuigi.addEventListener("click", function () {
        img.src = imgLuigi;
        img.addEventListener("click", function () {
            qntLuigi++;
            contLuigi.innerHTML = qntLuigi;
        })
    })

    var qntMario = 0;
    var qntLuigi = 0;

    console.log(img.src)
    console.log(document.getElementById("img").src)

    img.addEventListener("click", function () {
        qntMario++;
        contMario.innerHTML = qntMario;
    })

    // img.addEventListener("click", function () {
    //     if(img.src === imgMario) {
    //         qntMario++;
    //         contMario.innerHTML = qntMario;
    //     } else {
    //         qntLuigi++;
    //         contLuigi.innerHTML = qntLuigi;
    //     }
        
    //})
})
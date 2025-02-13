window.addEventListener("DOMContentLoaded", function () {
    var btn1 = document.getElementById("btnGerar1");
    var btn2 = document.getElementById("btnGerar2");
    var btn3 = document.getElementById("btnGerar3");
    var caixa = document.getElementById("caixa");
    var txt = document.getElementById("txt");

    btn1.addEventListener("click", function () {
        var pNovo = document.createElement("p");
        pNovo.textContent = "Arthur";

        caixa.appendChild(pNovo);
    })

    btn2.addEventListener("click", function () {
        var pNovo = document.createElement("p");
       
        pNovo.innerHTML = "Instituto <strong>Federal</strong> do Triângulo Mineiro";
        caixa.appendChild(pNovo);

    })

    btn3.addEventListener("click", function () {
        var div = document.createElement("div")
        var img = document.createElement("img")
        img.setAttribute("src", "Siri_fazendo_barra_incrivel.gif")
        img.setAttribute("name", txt.value)

        var p = document.createElement("p")
        p.textContent = txt.value;
        div.appendChild(img)
        div.appendChild(p)
        
        img.addEventListener("click", mostrar)
        
        
        caixa.appendChild(div)
    })
    
    function mostrar(e) {
        alert(e.currentTarget.name)
    }
})

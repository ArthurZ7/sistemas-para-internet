window.addEventListener("DOMContentLoaded", function () {

    var nome = localStorage.getItem("nome");
    var sobrenome = localStorage.getItem("sobrenome");
    var txtNomeCompleto = document.getElementById("txtNomeCompleto")
    var pNomeCompleto = document.getElementById("pNomeCompleto")
    var p1 = document.getElementById("p1")
    var p2 = document.getElementById("p2")
    var p3 = document.getElementById("p3")
    var p4 = document.getElementById("p4")
    
    
    txtNomeCompleto.value = nome + " " + sobrenome
    pNomeCompleto.innerHTML = txtNomeCompleto.value;
    
    var nomeCompleto = txtNomeCompleto.value
    console.log(nomeCompleto)

    
    var vetNome = nomeCompleto.split(" ");
    // Quantidade de caracteres
    p1.innerHTML = nomeCompleto.length

    // Primeira palavra do texto
    p2.innerHTML = vetNome[0]

    // Última palavra do texto
    p3.innerHTML = vetNome[vetNome.length - 1]

    // Quantidade de palavras
    p4.innerHTML = vetNome.length; 



})
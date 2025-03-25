window.addEventListener("DOMContentLoaded", function () {

    var texto = prompt("Escreva um texto: ");
    var letra = prompt("Escolha uma letra: ");
    
    var vetTexto = (texto.split(" ")); 

    for (var palavra in vetTexto){
        if (vetTexto[palavra].charAt(0) != letra){
            document.write(`${vetTexto[palavra]} `)
        }
    }

})
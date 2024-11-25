var user = document.getElementById("user")
var senha = document.getElementById("senha")
var btn_entrar = document.getElementById("btn-entrar")
var btn_limpar = document.getElementById("btn-limpar")

btn_entrar.addEventListener("click", function (){
    var valueUser = user.value;
    var valueSenha = senha.value;
    if (valueUser == "" || valueUser == null || valueSenha == "" || valueSenha == null) {
        alert("Informe usuário e senha!")
    } else if (valueUser.toLowerCase() == "visitante") {
        window.location.href = "./visitante.html"
    } else{
        window.location.href = "./construcao.html"
    }
})

btn_limpar.addEventListener("click", function (){
    user.value = "";
    senha.value = "";
})
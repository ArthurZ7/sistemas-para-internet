var user = document.getElementById("user")
var senha = document.getElementById("senha")
var btn_entrar = document.getElementById("btn-entrar")
var cadastro = document.getElementById("cadastro")

btn_entrar.addEventListener("click", function () {
    var valueUser = user.value;
    var valueSenha = senha.value;

    // Verificar campos vazios
    if (valueUser === "" || valueSenha === "") {
        alert("Informe usuário e senha!");
        return;
    }

    // Obter usuários do localStorage
    var users = JSON.parse(localStorage.getItem("users")) || [];
    var userFound = false;

    // Verificar credenciais
    for (var i = 0; i < users.length; i++) {
        if (users[i].username === valueUser) {
            userFound = true;
            if (users[i].password === valueSenha) {
                window.location.href = "./tamagotchi.html";
                return;
            } else {
                alert("Senha inválida!");
                return;
            }
        }
    }

    if (!userFound) {
        alert("Usuário inexistente!");
    }
})


cadastro.addEventListener("click", function () {
    window.location.href = "./cadastro.html"
})

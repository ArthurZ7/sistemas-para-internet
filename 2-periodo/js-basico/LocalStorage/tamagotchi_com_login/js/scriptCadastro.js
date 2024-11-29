
var email = document.getElementById("email")
var senha = document.getElementById("senha")
var btn_cadastrar = document.getElementById("btn-cadastrar")

// var btn_carregar = document.getElementById("btn-carregar");
// var userTable = document.getElementById("user-table").getElementsByTagName('tbody')[0];

btn_cadastrar.addEventListener("click", function () {
    var newUser = { username: email.value, password: senha.value }

    var users = localStorage.getItem("users");

    if (newUser.username == "" || newUser.password == "") {
        alert("Informe usuário e senha!")
    } else if (newUser.password < 5) {
        alert("A senha deve conter pelo menos 5 caracteres")
    } else {
        // 1a situação: Cadastrar o primeiro user
        if (!users) {
            var vetUser = [newUser];
            localStorage.setItem("users", JSON.stringify(vetUser))
            alert("Usuário cadastrado com sucesso.")
            // 2a situação: Cadastrar os proximos usuários
        } else {
            users = JSON.parse(users);
            console.log(checkUser(users, newUser))
            console.log(users, newUser)
            if (checkUser(users, newUser.username)) {
                alert("Este usuário já foi cadastrado!")
            } else {
                users.push(newUser);
                localStorage.setItem("users", JSON.stringify(users));
                alert("Usuário cadastrado com sucesso.")
            }
        }
    }
    
})

// btn_carregar.addEventListener("click", function () {
//     var users = localStorage.getItem("users");
//     if (users) {
//         users = JSON.parse(users);
//         userTable.innerHTML = ""; // Limpa a tabela antes de carregar os dados
//         users.forEach(function(user) {
//             var row = userTable.insertRow();
//             var cell1 = row.insertCell(0);
//             var cell2 = row.insertCell(1);
//             cell1.innerHTML = user.username;
//             cell2.innerHTML = user.password;
//         });
//     } else {
//         alert("Nenhum usuário cadastrado.");
//     }
// });


btn_limpar.addEventListener("click", function () {
    user.value = "";
    senha.value = "";
})


btn_cadastrar.addEventListener("click", function () {
    window.location.href = "./cadastro.html"
})



function checkUser(vetUsers, user) {
    for (i in vetUsers) {
        if (vetUsers[i].username == user) {
            return true;
        }
    }
    return false
}
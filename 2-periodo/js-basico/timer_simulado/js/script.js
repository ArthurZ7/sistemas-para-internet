var nome = document.getElementById("nome")
var idade = document.getElementById("idade")
var passatempo = document.getElementById("passatempo")
var btn_entrar = document.getElementById("btn-entrar")
var btn_limpar = document.getElementById("btn-limpar")

btn_entrar.addEventListener("click", function (){
    var valNome = nome.value;
    var valIdade = idade.value;
    var valPassatempo = passatempo.value;
    if (valNome == "") {
        alert("Informe o nome!")
    } else if (valIdade == "") {
        alert("Informe a idade!")
    } else if (valPassatempo == "a") {
        alert("Informe o passatempo predileto!")
    } else{
        console.log("Armazenando no localStorage:");
        console.log("Nome:", valNome);
        console.log("Idade:", valIdade);
        console.log("Passatempo:", valPassatempo);

        localStorage.setItem("nome", valNome);
        localStorage.setItem("idade", valIdade);
        localStorage.setItem("passatempo", valPassatempo);

       window.location.href = "/aguarde.html";
    }
})

btn_limpar.addEventListener("click", function (){
    nome.value = "";
    idade.value = "";
    passatempo.value = "a";
})
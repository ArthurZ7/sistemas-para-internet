window.addEventListener("DOMContentLoaded", function () {

    var txtNome = document.getElementById("txtNome");
    var txtSobrenome = document.getElementById("txtSobrenome");
    var sexo = document.getElementById("sexo");
    var btnEnviar = document.getElementById("btnEnviar");

    
    btnEnviar.addEventListener("click", function () {

        localStorage.setItem("nome", txtNome.value);
        localStorage.setItem("sobrenome", txtSobrenome.value);
        
        if ((txtNome.value === "") || (txtSobrenome.value === "")) {
            alert("Favor informar o NOME e SOBRENOME")
        } else {
            var padrao = /^(REC|RECUPERAÇÃO)-(Jsbásico:)\(1\)[2345]+$/;
            if (padrao.test(senha.value)) {
                alert("Válido");
                if (sexo.value == 1)
                    window.location.href = "./masculino.html"
                else if (sexo.value == 2)
                    window.location.href = "./feminino.html"
            } else
                alert("Senha inválida!");
        }
    })
})
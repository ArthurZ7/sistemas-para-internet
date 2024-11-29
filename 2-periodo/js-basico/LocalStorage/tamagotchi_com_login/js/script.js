var boy = document.getElementById("boy");
var texto = document.getElementById("texto");
var sair = document.getElementById("sair");

function changeBoy(source, texto) {
    boy.src = source;
    document.getElementById("texto").innerHTML = texto;
}

boy.addEventListener("mouseenter", function () {
    changeBoy("img/assustado.png", "O que você quer?");
});

boy.addEventListener("mouseout", function () {
    boy.src = "img/pensativo.png";
    document.getElementById("texto").innerHTML = "zzzzzzzzz!";
});

boy.addEventListener("click", function () {
    var nome = prompt("Qual o seu nome?");
    console.log(nome);
    if (nome == null || nome == "") {
        boy.src = "img/nervoso.png";
        boy.classList.add('moveNervoso');
        texto.innerHTML = `Não me faça perder o meu tempo!`;
    } else {
        boy.src = "img/alegre.png";
        boy.classList.add('moveAlegre');
        texto.innerHTML = `${nome}, seja bem-vindo!`;
    }
});

boy.addEventListener("mouseleave", function () {
    boy.classList.remove('moveNervoso');
    boy.classList.remove('moveAlegre');
});

sair.addEventListener("click", function () {
    window.location.href = "./";
});
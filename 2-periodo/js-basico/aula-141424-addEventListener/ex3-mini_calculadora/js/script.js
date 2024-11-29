var valor1 = document.getElementById("valor1");
var valor2 = document.getElementById("valor2");
var operador = document.getElementById("operador");
var btnResult = document.getElementById("btnResult");
var result = document.getElementById("result");

btnResult.addEventListener("click", function () {
    result.value = eval(valor1.value + operador.value + valor2.value)
})
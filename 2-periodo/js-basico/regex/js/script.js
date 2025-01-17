window.addEventListener("DOMContentLoaded", function () {

    var txtInfo = document.getElementById("txtInfo");
    var btnValidar = document.getElementById("btnValidar");

    btnValidar.addEventListener("click", function () {
        // var padrao = /\d/;  // Valida se há nº em qlqr lugar
        // var padrao = /^\d/;  // Valida se há nº no INICIO
        // var padrao = /\d$/;  // Valida se há nº no FINAL
        // var padrao = /^\d$/;  // Valida se há 1 UNICO nº
        // var padrao = /^\d\d\d\d\d-\d\d\d\d$/;  // Validação telefone
        // var padrao = /^\d{5}-\d{4}$/;  // Validação telefone

        // var padrao = /^\d{1,3}\d\/\d{0,2}\/\d{4}$/;  // Validação data

        // var padrao = /^[Ii][Ff][Tt][Mm]-\d{4,6}-(TSPI|LCO|MKT):\d[A-Z]$/;
        // var padrao = /^(I|i)(F|f)(T|t)(M|m)-\d{4,6}-(TSPI|LCO|MKT):\d[A-Z]$/;

        // var padrao = /^(M|F|Masculino|Feminino)$/i;

        // var padrao = /^IFTM\s{0,2}TSPI$/i;
        // var padrao = /^IFTM\s?TSPI$/i;

        // var padrao = /^[\dA-F]+$/i; // Padrao para hexadecimal

        // var padrao = /^[^1234]$/

        var padrao = /^[A-z]{4,}\d{2,4}\W\W$/

        if (padrao.test(txtInfo.value))
            alert("Válido");
        else
            alert("Inválido");
    })

})
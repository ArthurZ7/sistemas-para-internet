window.addEventListener("DOMContentLoaded", function () {

    var binario = document.getElementById("binario");
    var btn1 = document.getElementById("btn1");
    // Questão A: Verifica se o valor é um número binário (composto apenas por 0 e 1)
    btn1.addEventListener("click", function () {
        var padrao = /^[01]+$/;
        
        if (padrao.test(binario.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var hexadecimal = document.getElementById("hexadecimal");
    var btn2 = document.getElementById("btn2");
    // Questão B: Verifica se o valor é um número hexadecimal (composto por dígitos de 0-9 e letras de A-F)
    btn2.addEventListener("click", function () {
        var padrao = /^[\dA-F]+$/i;
        
        if (padrao.test(hexadecimal.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var decimal = document.getElementById("decimal");
    var btn3 = document.getElementById("btn3");
    // Questão C: Verifica se o valor é um número decimal com vírgula
    btn3.addEventListener("click", function () {
        var padrao = /^[\d]+,[\d]+$/i;
        
        if (padrao.test(decimal.value))
            alert("Válido");
        else
            alert("Inválido");
    });
    
    var real = document.getElementById("real");
    var btn4 = document.getElementById("btn4");
    // Questão D: Verifica se o valor é um número real (com ou sem sinal negativo e com ponto ou vírgula)
    btn4.addEventListener("click", function () {
        var padrao = /^-?\d+(?:[.,]\d+)?$/;
        
        if (padrao.test(real.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var horario = document.getElementById("horario");
    var btn5 = document.getElementById("btn5");
    // Questão E: Verifica se o valor é um horário no formato HH:MM:SS
    btn5.addEventListener("click", function () {
        var padrao = /^\d\d\:\d\d\:\d\d$/;
        
        if (padrao.test(horario.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var data_nasc = document.getElementById("data_nasc");
    var btn6 = document.getElementById("btn6");
    // Questão F: Verifica se o valor é uma data no formato DD/MM/AAAA ou DD/MM/AA
    btn6.addEventListener("click", function () {
        var padrao = /^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/(\d{2}|\d{4})$/;
        
        if (padrao.test(data_nasc.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var cep = document.getElementById("cep");
    var btn7 = document.getElementById("btn7");
    // Questão G: Verifica se o valor é um CEP brasileiro no formato XXXXX-XXX ou XXXXXXXX
    btn7.addEventListener("click", function () {
        var padrao = /^\d{5}-?\d{3}$/;
        
        if (padrao.test(cep.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var cpf = document.getElementById("cpf");
    var btn8 = document.getElementById("btn8");
    // Questão H: Verifica se o valor é um CPF no formato XXX.XXX.XXX-XX ou XXXXXXXXXXX
    btn8.addEventListener("click", function () {
        var padrao = /^\d{3}\.?\d{3}\.?\d{3}-?\d{2}$/;
        
        if (padrao.test(cpf.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var cnpj = document.getElementById("cnpj");
    var btn9 = document.getElementById("btn9");
    // Questão I: Verifica se o valor é um CNPJ no formato XX.XXX.XXX/XXXX-XX ou XXXXXXXXXXXXXX
    btn9.addEventListener("click", function () {
        var padrao = /^\d{2}\.?\d{3}\.?\d{3}\/?\d{4}-?\d{2}$/;
        
        if (padrao.test(cnpj.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var num_parenteses = document.getElementById("num_parenteses");
    var btn10 = document.getElementById("btn10");
    // Questão J: Verifica se o valor é um número entre parênteses
    btn10.addEventListener("click", function () {
        var padrao = /^\([\d]+\)$/;
        
        if (padrao.test(num_parenteses.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var email = document.getElementById("email");
    var btn11 = document.getElementById("btn11");
    // Questão K: Verifica se o valor é um email válido
    btn11.addEventListener("click", function () {
        var padrao = /^.+@.+\..{2,3}$/;
        
        if (padrao.test(email.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var ipv4 = document.getElementById("ipv4");
    var btn12 = document.getElementById("btn12");
    // Questão L: Verifica se o valor é um endereço IPv4 válido
    btn12.addEventListener("click", function () {
        var padrao = /^(25[0-5]|2[0-4]\d|1\d{2}|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d{2}|[1-9]?\d)){3}$/;
        
        if (padrao.test(ipv4.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var altura = document.getElementById("altura");
    var btn13 = document.getElementById("btn13");
    // Questão M: Verifica se o valor é uma altura no formato X,XX ou X.XX
    btn13.addEventListener("click", function () {
        var padrao = /^\d[,.]\d\d?$/;
        
        if (padrao.test(altura.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var nome = document.getElementById("nome");
    var btn14 = document.getElementById("btn14");
    // Questão N: Verifica se o valor é um nome começando com letra maiúscula seguido de letras minúsculas
    btn14.addEventListener("click", function () {
        var padrao = /^[A-Z][a-z]+$/;
        
        if (padrao.test(nome.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var telefone = document.getElementById("telefone");
    var btn15 = document.getElementById("btn15");
    // Questão O: Verifica se o valor é um telefone no formato +XX(XX)XXXXX-XXXX
    btn15.addEventListener("click", function () {
        var padrao = /^\+\d\d\(\d\d\)\d{5}-\d{4}$/;
        
        if (padrao.test(telefone.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var campus = document.getElementById("campus");
    var btn16 = document.getElementById("btn16");
    // Questão P: Verifica se o valor é um dos dois campus do IFTM em Uberlândia
    btn16.addEventListener("click", function () {
        var padrao = /^(IFTM campus Uberlândia|IFTM campus Uberlândia Centro)$/;
        
        if (padrao.test(campus.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var range = document.getElementById("range");
    var btn17 = document.getElementById("btn17");
    // Questão Q: Verifica se o valor é um número de 1 a 100
    btn17.addEventListener("click", function () {
        var padrao = /^\d{1,100}$/;
        
        if (padrao.test(range.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var placa = document.getElementById("placa");
    var btn18 = document.getElementById("btn18");
    // Questão R: Verifica se o valor é uma placa de veículo no formato XXX-0X00 ou XXX0X00
    btn18.addEventListener("click", function () {
        var padrao = /^[A-Z]{3}-?[0-9][A-Z0-9][0-9]{2}$/;
        
        if (padrao.test(placa.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var letras = document.getElementById("letras");
    var btn19 = document.getElementById("btn19");
    // Questão S: Verifica se o valor é composto apenas por vogais e as letras b, c, d
    btn19.addEventListener("click", function () {
        var padrao = /^[aeioubcd]+$/i;
        
        if (padrao.test(letras.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var faturamento = document.getElementById("faturamento");
    var btn20 = document.getElementById("btn20");
    // Questão T: Verifica se o valor é um valor monetário no formato R$X.XXX,XX
    btn20.addEventListener("click", function () {
        var padrao = /^R\$\d{1,3}(\.\d{3}){0,3},\d{1,2}$/;
        
        if (padrao.test(faturamento.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var matricula1 = document.getElementById("matricula1");
    var btn21 = document.getElementById("btn21");
    // Questão U: Verifica se o valor é uma matrícula no formato IFTM-XXX/XXX-XX ou iftm-XXX/XXX-XX
    btn21.addEventListener("click", function () {
        var padrao = /^(IFTM|iftm)-\d{3}\/\d{3}-[a-zA-Z0-9]{2}$/;
        
        if (padrao.test(matricula1.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var matricula2 = document.getElementById("matricula2");
    var btn22 = document.getElementById("btn22");
    // Questão V: Verifica se o valor é uma matrícula no formato MT-XX.XXX-IFTM ou MT-XX.XXX-iftm
    btn22.addEventListener("click", function () {
        var padrao = /^(MT)-\d{2}\.\d{3}-(IFTM|iftm)$/;
        
        if (padrao.test(matricula2.value))
            alert("Válido");
        else
            alert("Inválido");
    });

    var matricula3 = document.getElementById("matricula3");
    var btn23 = document.getElementById("btn23");
    // Questão W: Verifica se o valor é uma matrícula no formato MT-XX.XXX-IFTM Uberlândia ou MT-XX.XXX-IFTM Uberlândia Centro
    btn23.addEventListener("click", function () {
        var padrao = /^(MT|mt|Mt|mT)-\d{2}\.\d{3}-(IFTM|iftm)\s?(Uberlândia|Uberlândia Centro)$/;
        
        if (padrao.test(matricula3.value))
            alert("Válido");
        else
            alert("Inválido");
    });
});
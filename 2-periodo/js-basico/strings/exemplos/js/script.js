var nome = prompt("Digite seu nome completo: ")

var qntCaracter = nome.length;

document.write(`<p>O nome <b>${nome}</b> possui ${qntCaracter} caracteres</p>`)

var primeiraLetra = nome.charAt(0);
document.write(`<p>A primeira letra do nome é: <b>${primeiraLetra}</b></p>`)

var nomeMaiusculo = nome.toUpperCase();
document.write(`<p>O nome com letras maiúsculas fica: <b>${nomeMaiusculo}</b></p>`)

var nomeMinusculo = nome.toLowerCase();
document.write(`<p>O nome com letras minúsculas fica: <b>${nomeMinusculo}</b></p>`)

var primeiroNome = nome.slice(0, nome.search(" "));
document.write(`<p>Primeiro nome = <b>${primeiroNome}</b></p>`)

var vetPartesNome = nome.split(" "); // Transforma em vetor, dividindo cada parte do nome
var ultimoNome = vetPartesNome[vetPartesNome.length - 1]
document.write(`<p>Último nome = <b>${ultimoNome}</b></p>`)

var primeiroUltNome = primeiroNome + ultimoNome;

document.write(`<p>Primeiro e último nome concatenados = <b>${primeiroUltNome}</b></p>`)


document.write(`<p>Primeiro e último nome concatenados (maiúsculos) = <b>${primeiroUltNome.toUpperCase()}</b></p>`)

document.write(`<p>Total de palavras no nome = <b>${vetPartesNome.length}</b></p>`)

var iniciaisNome = "";
for (var i in vetPartesNome)
    iniciaisNome += vetPartesNome[i].charAt(0);
document.write(`<p>Iniciais do nome (maiúsculas) = <b>${iniciaisNome.toUpperCase()}</b></p>`)
// 4. Construa uma página web capaz de solicitar o nome completo do usuário e, em seguida,
// exibir através de uma mensagem de alerta o primeiro nome dele contendo letras maiúsculas
// e o restante composto apenas por letras minúsculas.


var nome = prompt("Digite seu nome completo: ")

var primeiroNome = nome.slice(0, nome.search(" "));

var vetPartesNome = nome.split(" "); // Transforma em vetor, dividindo cada parte do nome
var ultimoNome = vetPartesNome[vetPartesNome.length - 1]

alert(primeiroNome.toUpperCase() + " " + ultimoNome.toLowerCase());
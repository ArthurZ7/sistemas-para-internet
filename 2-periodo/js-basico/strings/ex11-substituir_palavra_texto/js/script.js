var texto = prompt("Informe o texto: ", "O carro quebrou na estrada de São Paulo. O carro foi levado para a oficina.")
var palAntiga = prompt(`${texto}\n\nInforme uma palavra do texto para ser trocada: `)
var palNova = prompt("Informe a palavra nova: ")

document.write(`<p><b>Mensagem Inicial:</b></p>`)
document.write(`<p>${texto}</p>`)

document.write(`<p><b>Mensagem Final:</b></p>`)
document.write(`<p>${texto.replaceAll(palAntiga, palNova)}</p>`)




const dataAtual = new Date();

var diasSemana = ["Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"]

document.write(`Hoje é ${diasSemana[dataAtual.getDay()]}!`)

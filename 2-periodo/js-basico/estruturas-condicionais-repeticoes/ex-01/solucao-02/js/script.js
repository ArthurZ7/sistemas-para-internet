const dataAtual = new Date();

diaSemana = dataAtual.getDay();

switch (diaSemana) {
    case 0:
        document.write("Hoje é Domingo!");
        break;
    case 1:
        document.write("Hoje é Segunda-feira!");
        break;
    case 2:
        document.write("Hoje é Terça-feira!");
        break;
    case 3:
        document.write("Hoje é Quarta-feira!");
        break;
    case 4:
        document.write("Hoje é Quinta-feira!");
        break;
    case 5:
        document.write("Hoje é Sexta-feira!");
        break;
    case 6:
        document.write("Hoje é Domingo!");
        break;
    default:
        document.write("Hoje é Sábado!");
}

// 4. Solicite ao usuário as notas do 1o e 2o bimestres e, em seguida, informe se ele foi
// aprovado/reprovado na disciplina. Um aluno será aprovado se a soma das notas for maior ou
// igual a 60,0 pontos. Caso ele tenha sido reprovado informe a quantidade de pontos faltantes
// para ele ter sido aprovado.

nota1 = parseFloat(prompt("Qual sua nota da primeira prova bimestral?"))
nota2 = parseFloat(prompt("Qual sua nota da segunda prova bimestral?"))

notaFinal = nota1 + nota2;

if (notaFinal >= 60) {
    alert(`Você está APROVADO - Nota Final: ${notaFinal}`)
}
else
    alert(`Você está REPROVADO - Faltaram: ${60 - notaFinal} pontos`)
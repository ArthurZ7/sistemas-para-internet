let url = "https://wilton-filho.github.io/PFJS-GitHub/bases/alunos.json";

// Fetch .then...
function getFetch() {
    fetch(url)
        // Recebe os dados da url como json
        .then(resposta => resposta.json())
        .then(dados => {
            document.write("<h1>Estudantes</h1>");
            document.write("<p>O que você deseja visualizar?</p>");
            document.write("<select id='select'>");
            document.write("<option value='0'>Selecione</option>");
            document.write("<option value='1'>Todos os estudantes</option>");
            document.write("<option value='2'>Estudantes homens</option>");
            document.write("<option value='3'>Estudantes mulheres</option>");
            document.write("<option value='4'>Estudantes aprovados</option>");
            document.write("<option value='5'>Estudantes reprovados</option>");
            document.write("<option value='6'>Todos os alunos aprovados?</option>");
            document.write("<option value='7'>Nota média da turma</option>");
            document.write("</select>");
            
            document.write("<spam>");
            
            // Adiciona um listener para capturar a seleção
            const select = document.getElementById('select');
            select.addEventListener('change', (option) => {
                const value = option.target.value;
                const output = document.querySelector('spam');
                output.innerHTML = ''; // Limpa o conteúdo anterior

                switch (value) {
                    case '1':
                        dados.forEach(aluno => {
                            output.innerHTML += "<p>" + aluno.nome + ": " + aluno.notaBim1 + " (bimestre 1) e " + aluno.notaBim2 + " (bimestre 2) = " + (aluno.notaBim1 + aluno.notaBim2) + "</p>";
                        });
                        break;

                    case '2':
                        dados.filter(aluno => aluno.sexo === 'M').forEach(aluno => {
                            output.innerHTML += "<p>" + aluno.nome + ": " + aluno.notaBim1 + " (bimestre 1) e " + aluno.notaBim2 + " (bimestre 2) = " + (aluno.notaBim1 + aluno.notaBim2) + "</p>";
                        });
                        break;

                    case '3':
                        dados.filter(aluno => aluno.sexo === 'F').forEach(aluno => {
                            output.innerHTML += "<p>" + aluno.nome + ": " + aluno.notaBim1 + " (bimestre 1) e " + aluno.notaBim2 + " (bimestre 2) = " + (aluno.notaBim1 + aluno.notaBim2) + "</p>";
                        });
                        break;

                    case '4':
                        dados.forEach(aluno => {
                            aluno.soma = (aluno.notaBim1 + aluno.notaBim2); // Calcula a soma
                        });
                        
                        // Filtra os alunos com soma >= 60 e exibe seus nomes
                        dados.filter(aluno => aluno.soma >= 60).forEach(aluno => {
                            output.innerHTML += "<p>" + aluno.nome + ": " + aluno.notaBim1 + " (bimestre 1) e " + aluno.notaBim2 + " (bimestre 2) = " + (aluno.notaBim1 + aluno.notaBim2) + "</p>";
                        });
                        break;

                    case '5':
                        dados.forEach(aluno => {
                            aluno.soma = (aluno.notaBim1 + aluno.notaBim2); // Calcula a soma
                        });
                        
                        // Filtra os alunos com soma < 60 e exibe seus nomes
                        dados.filter(aluno => aluno.soma < 60).forEach(aluno => {
                            output.innerHTML += "<p>" + aluno.nome + ": " + aluno.notaBim1 + " (bimestre 1) e " + aluno.notaBim2 + " (bimestre 2) = " + (aluno.notaBim1 + aluno.notaBim2) + "</p>";
                        });
                        break;

                    case '6':
                        dados.forEach(aluno => {
                            aluno.soma = (aluno.notaBim1 + aluno.notaBim2); // Calcula a soma
                        });
                        const todosAprovados = dados.every(aluno => aluno.soma >= 60); // Verifica se todos os alunos estão aprovados
                        output.innerHTML = "<p>" + (todosAprovados ? "Sim" : "Não") + "</p>";
                        break;

                    case '7':
                        const mediaTurma = dados.reduce((i, aluno) => i + (aluno.notaBim1 + aluno.notaBim2), 0) / dados.length;
                        output.innerHTML = "<p>Nota média = "  + mediaTurma.toFixed(2) + "</p>";
                        break;

                    default:
                        output.innerHTML = "<p>Selecione uma opção válida.</p>";
                }
            });
        })
        .catch(error => console.log(error));
}

const ajax = {
    getFetch,
}

export default ajax;
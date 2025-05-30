import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public String listarFuncionario() {
        StringBuilder sb = new StringBuilder();
        sb.append("DEPARTAMENTO: ").append(nome).append("\n");
        for (Funcionario funcionario : funcionarios) {
            sb.append(funcionario.mostrarDados()).append("\n");
        }
        return sb.toString();
    }

}

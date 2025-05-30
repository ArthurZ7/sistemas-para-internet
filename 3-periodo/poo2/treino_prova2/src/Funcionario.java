public class Funcionario extends Pessoa implements Pagavel {
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    public double calcularSalario(double bonus) {
        return salarioBase + bonus;
    }
    
    @Override
    public String mostrarDados() {
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nSalario Base: " + Util.formatarMoeda(salarioBase);
    }


}

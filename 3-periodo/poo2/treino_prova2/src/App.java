public class App {
    public static void main(String[] args) throws Exception {

        try {
            // Departamento RH
            Departamento departamento = new Departamento("Recursos Humanos");

            Funcionario funcionario = new Funcionario("Felipe", "12345678910", 4000);
            Gerente gerente = new Gerente("Pedro", "412563101230", 5000, 1000);

            departamento.adicionarFuncionario(funcionario);
            departamento.adicionarFuncionario(gerente);
            System.out.println(departamento.listarFuncionario());

            // Departamento Vendas
            Departamento departamentoVendas = new Departamento("Vendas");
            Funcionario funcionarioVendas = new Funcionario("Ana", "98765432100", 3000);

            departamentoVendas.adicionarFuncionario(funcionarioVendas);
            System.out.println(departamentoVendas.listarFuncionario());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}

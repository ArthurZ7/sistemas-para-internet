public class ContaCoEmpresarial extends ContaCo {

    private double taxaJurosEmprestimo;

    public ContaCoEmpresarial(String titular, double saldo, double limitechequeEspecial, double taxaJurosEmprestimo) {
        super(titular, saldo, limitechequeEspecial);
        this.taxaJurosEmprestimo = taxaJurosEmprestimo;
    }

    public boolean solicitaEmprestimo (double valor) {
        if (saldo + limitechequeEspecial >= valor) {
            saldo += valor;
            saldo -= valor * (taxaJurosEmprestimo / 100);
            return true;
        }
        return false;
    }

    @Override
    public String exibeSaldo() {
        return "Saldo da conta empresarial de " + titular + ": R$" + saldo;
    }
}

public class ContaCoPremium extends ContaCo{
    
    private double cashBackPercentual;

    public ContaCoPremium(String titular, double saldo, double limitechequeEspecial, double cashBackPercentual) {
        super(titular, saldo, limitechequeEspecial);
        this.cashBackPercentual = cashBackPercentual;
    }

    @Override
    public boolean sacar (double valor) {
        if (saldo + limitechequeEspecial >= valor) {
            saldo -= valor;
            saldo += valor * (cashBackPercentual / 100);
            return true;
        }
        return false;
    }

    public String exibeBeneficioPremium() {
        return "Conta Corrente Premium com cashback de " + cashBackPercentual + "em cada saque.";
    }

    public double getCashBackPercentual() {
        return cashBackPercentual;
    }

    public void setCashBackPercentual(double cashBackPercentual) {
        this.cashBackPercentual = cashBackPercentual;
    }

    
}

public class ContaCo extends ContaBancaria{

    protected  double limitechequeEspecial;

    public ContaCo(String titular, double saldo, double limitechequeEspecial) {
        super(titular, saldo);
        this.limitechequeEspecial = limitechequeEspecial;
    }

    @Override
    public boolean sacar (double valor) {
        if (saldo + limitechequeEspecial >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String exibeLimiteChequeEspecial () {
        return "Limite do Cheque Especial: R$" + limitechequeEspecial;
    }

    public double getLimitechequeEspecial() {
        return limitechequeEspecial;
    }

    public void setLimitechequeEspecial(double limitechequeEspecial) {
        this.limitechequeEspecial = limitechequeEspecial;
    }

    
}
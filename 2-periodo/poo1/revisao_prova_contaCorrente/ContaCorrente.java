public class ContaCorrente {

    private String nome;
    private String numeroConta;
    private double saldo;
    private String tipoConta;


    public ContaCorrente(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = "comum";
    }
    
    public ContaCorrente(String nome, String numeroConta, double saldo, String tipoConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) { 
            saldo -= (valor - (valor*0.001)); // valor de saque - 1% de taxa
            return true; 
        } else {
            return false;
        }
    }

    public boolean sacar(double valor, double limiteEspecial) {
        if (valor <= (saldo + limiteEspecial)) { 
            saldo -= (valor - (valor*0.002)); 
            return true; 
        } else {
            return false;
        }
    }

    public void depositar (double valor) {
        saldo += valor;
    }
    
}

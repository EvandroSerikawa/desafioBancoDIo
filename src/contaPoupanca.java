public class contaPoupanca extends conta{

    private cadastro cadastro;
    private double saldo;

    public contaPoupanca(int agencia, int conta, int saldo) {
        super(agencia, conta, saldo);
    }


    @Override
    public void deposita(double valor) {
        super.deposita(valor);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor);
    }

    @Override
    public boolean transfere(double valor, int destino) {
        return super.transfere(valor, destino);
    }

    public cadastro getCadastroPf() {
        return cadastro;
    }

    public void setCadastroPf(cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

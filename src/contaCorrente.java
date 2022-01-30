public class contaCorrente extends conta{

    private cadastro cadastro;
    private double saldo;

    public contaCorrente(int agencia, int conta, double saldo) {
        super( agencia , conta , saldo);

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



    public cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(cadastro cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


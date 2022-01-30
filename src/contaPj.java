public class contaPj extends conta{

    private cadastroPj cadastroPj;
    private double saldo;


    public contaPj(int agencia, int conta, int saldo) {
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

    public cadastroPj getCadastroPj() {
        return cadastroPj;
    }

    public void setCadastroPj(cadastroPj cadastroPj) {
        this.cadastroPj = cadastroPj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

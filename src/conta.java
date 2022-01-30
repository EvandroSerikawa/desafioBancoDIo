public abstract  class conta {

    protected int idConta;
    protected int idCadastro;
    private int agencia;
    private int conta;
    private double saldo;


    public conta( int agencia , int conta , double saldo){

        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;

        System.out.println("Nova conta criada com sucesso!");
        System.out.println("Seguem os dados da conta: " + this.agencia + ", " + this.conta + "\n");
    }



    public void deposita( double valor ){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso.\nSaldo atual:" + this.saldo);
    }


    public boolean saca ( double valor ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.\nSaldo atual:" + this.saldo);
            return true;
        }
        else{
            return false;
        }
    }


    public  boolean transfere(double valor  , int destino ){
        if( this.saldo >= valor ){
            this.saldo = saldo-valor;
            System.out.println("transferencia efetuada com Sucesso:" + valor +"\nSaldo atual:" + this.saldo);
            return true;
        }else{
            return false;
        }
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(int idCadastro) {
        this.idCadastro = idCadastro;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


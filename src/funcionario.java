public class funcionario implements autenticacao{

    protected int idFuncionario;
    private cadastro cadastro;
    private String funcao;
    private int registro;
    private double salario;
    private int login;
    private int senha;
    private contaCorrente conta;

    public funcionario( int idFuncionario , String funcao , int registro
            , double salario ){
        this.idFuncionario = idFuncionario;
        this.funcao = funcao;
        this.registro = registro;

        System.out.println("Novo funcionario criado com sucesso!");
        System.out.println("Conta bancaria vinculada ao cadastro do funcionario.");
    }


    public cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}

public abstract class banco {

    protected int idBanco;
    private cadastroPj cadastro;


    public banco( int idBanco, cadastroPj cadastro){
        this.idBanco = idBanco;
        this.cadastro = cadastro;

        System.out.println("Nova filial aberta com sucesso.");
    }

}

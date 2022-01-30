public class cadastroPj {

    protected int idCadastroPj;
    protected cadastro idCadastro;
    private String razaoSocial;
    private int cnpj;
    private int inscricaoEstadual;

    public cadastroPj( int IdCadastroPj , String razaoSocial , int cnpj){
        this.idCadastroPj = idCadastroPj;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;

    }

    public int getIdCadastroPj() {
        return idCadastroPj;
    }

    public void setIdCadastroPj(int idCadastroPj) {
        this.idCadastroPj = idCadastroPj;
    }

    public cadastro getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(cadastro idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}

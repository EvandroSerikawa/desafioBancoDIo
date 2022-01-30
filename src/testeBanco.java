public class testeBanco {
    public static void main(String[] args) {

        cadastro novoCadastro = new cadastro(123 , "nome1" ,  123456789);
        System.out.println("Novo cadastro criado com sucesso: ");
        System.out.println("Dados do cadastro:" + "ID Cadastro:"+ novoCadastro.idCadastro + "\n"+
                           "Nome do titular:" + novoCadastro.getNome() + "\n" + "CPF:" + novoCadastro.getCpf() + "\n");

        System.out.println("*************************************");

        conta novaConta = new contaCorrente(1023, 123240, 200 );

        System.out.println("*************************************");

        cadastroPj novoCadastroPj = new cadastroPj( 10231 , "razaoSocial1", 1234567800);
        System.out.println("Novo cadastro PJ criado com sucesso: ");
        System.out.println("Dados do cadastro: \n" + "ID Cadastro:" + novoCadastroPj.getIdCadastroPj() + "\n" +
                "Razão Social:" + novoCadastroPj.getRazaoSocial() + "\n" + "CNPJ:" + novoCadastroPj.getCnpj() + "\n");

        novaConta.deposita(500);
        novaConta.saca(200);
        novaConta.transfere(100 , 24359);

        System.out.println("*************************************");

        funcionario novoFuncionario = new funcionario( 10249 , "atendente" , 5836 , 58000 );


        System.out.println("*************************************");

    }
}

package folhadepagamento;

public class App extends MenuPrincipal {

    public static void main(String[] args) {
        int opcao;
        System.out.println("Digite a opção desejada." +
                "\n1. Cadastrar Funcionário" +
                "\n2. Agendar o Pagamento" +
                "\n3. Consultar Folha" +
                "\n4. Sair");

                switch (opcao)
        {
            case 1:
                cadastrarFunc();
                break;
            case 2:
                agendarPag();
                break;
            case 3:
                consultarFolha();
                break;
            case 4:
                sair();
                break;
        }
    }

}

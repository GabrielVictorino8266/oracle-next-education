import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String nomeCliente= "Gabriel Victorino";
    public static double saldo = 2500.00;
    public static String tipoConta = "Corrente";

    public static void main(String[] args) {
        int opcao = 0;
        double valorOperacao = 0.0;

        Scanner input = new Scanner(System.in);


        System.out.println("Bem-vindo ao Sistema Bancario JavReal.\n");

        while (opcao != 4) {
            infoUsuario(nomeCliente, saldo, tipoConta);


            System.out.println("|----------MENU----------|");
            System.out.println("|1- Consultar Saldo.-----|");
            System.out.println("|2- Receber Valor.-------|");
            System.out.println("|3- Transferir Valor.----|");
            System.out.println("|4- Sair-----------------|");
            System.out.println("|------------------------|");

            System.out.println("Informe a opcao desejada: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                consultarSaldo(saldo);
            }else if(opcao == 2) {
                System.out.println("Informe o valor a depositar: R$");
                valorOperacao = input.nextDouble();
                saldo = receberValor(valorOperacao, saldo);
            }else if(opcao == 3){
                System.out.println("Informe o valor a transferir: R$");
                valorOperacao = input.nextDouble();
                if (saldo >= valorOperacao) {
                    saldo = transferirValor(valorOperacao, saldo);
                }else{
                    System.out.println("Lamento, mas a operacao nao pode ser realizada.");
                }
            }
        }
    }


    public static void infoUsuario(String nomeCliente, double saldo, String tipoConta) {
        System.out.println("**************************************");
        System.out.println("Dados Iniciais do Cliente: ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo: " + "R$ " + saldo);
        System.out.println("**************************************\n\n");
    }

    public static void consultarSaldo(double saldo) {
        System.out.println("***CONSULTAR SALDO***");
        System.out.println("Saldo atual de: R$" + saldo);
        System.out.println("****************FIM OPERACAO****************\n\n");
    }

    public static double receberValor(double valorOperacao, double saldo) {
        System.out.println("***RECEBER VALOR***");
        saldo += valorOperacao;
        System.out.println("Voce depositara: R$" + valorOperacao);
        System.out.println("Saldo atualizado: R$" + saldo);
        System.out.println("****************FIM OPERACAO****************\n\n");
        return  saldo;
    }

    public static double transferirValor(double valorOperacao, double saldo) {
        String contaTransferencia;
        Scanner inputConta = new Scanner(System.in);

        System.out.println("***TRANSFERIR VALOR***");
        saldo -= valorOperacao;
        System.out.println("Informe a conta que ira Transferir: ");
        contaTransferencia = inputConta.nextLine();
        System.out.println("Voce ira transferir: R$" + valorOperacao);
        System.out.println("Saldo atualizado: R$" + saldo);
        System.out.println("Voce transferiu R$" + valorOperacao + " para a conta: " + contaTransferencia);
        System.out.println("****************FIM OPERACAO****************\n\n");

        return saldo;
    }
}
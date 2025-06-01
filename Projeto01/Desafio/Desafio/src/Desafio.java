import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
        String nome = "Peter Parker";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("Salto atual: " + saldo);
        System.out.println("\n************************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new  Scanner(System.in);
        while (opcao !=4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("o saldo é " + saldo);
            } else if (opcao ==2) {
                System.out.println("Qual valor para trasnferencia");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("não ha saldo");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }

            } else if (opcao ==3) {
                System.out.println("Valor Recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo" + saldo);

            }else if (opcao!=4 ){
                System.out.println("opçao invalida");
            }

        }


       /* for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
    }
}
import java.util.Scanner;

public class SimuladorContaBancaria {
    public static void main(String[] args) {

        String nome2 = "Matheus Bessado";
        String TipodeConta = "Corrente";
        int opcao = 0;
        double SaldodacontaCorrente = 2500.00;
        Double valor;

        System.out.println("\nNome do cliente: " + nome2);  // \n para quebrar a linha
        System.out.println("Tipo de conta: " + TipodeConta);
        System.out.println("Saldo da conta Corrente: " + SaldodacontaCorrente);

        String menu = """
                Digite a opção de sua escolha:
                1- Consultar saldo
                2- Pix
                3- Depositar
                4- Sair
                """;
        System.out.printf(menu);

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {  // Continua enquanto a opção não for 4 (sair)
            System.out.println("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nO saldo atualizado é: " + SaldodacontaCorrente);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?:");
                valor = leitura.nextDouble();

                if (valor > SaldodacontaCorrente) {
                    System.out.println("Saldo insuficiente");
                } else {
                    SaldodacontaCorrente -= valor;
                    System.out.println("Novo Saldo: " + SaldodacontaCorrente);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                valor = leitura.nextDouble();

                SaldodacontaCorrente += valor;
                System.out.println("Novo Saldo: " + SaldodacontaCorrente);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }

        leitura.close();  // Fecha o Scanner ao final
    }
}
















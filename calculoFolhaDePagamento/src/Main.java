import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicialização dos buffers de entrada, é instanciado um scanner somente para a string
        //para evitar quebras de linhas desnecessárias.
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        Pagamento pagamento = new Pagamento();


        System.out.print("Digite o nome: ");

        funcionario.setNome(scannerString.nextLine());

        System.out.print("Digite o sobrenome: ");

        funcionario.setSobrenome(scannerString.nextLine());

        System.out.print("Digite a data de admissão (dd/mm/yyyy): ");

        funcionario.setAdmissao(new Date(scanner.nextLine()));

        System.out.print("Digite a profissão: ");

        funcionario.setProfissao(scannerString.nextLine());

        System.out.print("Digite o salário do funcionário: ");

        double salario = scanner.nextDouble();
        pagamento.setSalarioBruto(salario);
        pagamento.setSalarioLiquido(salario);

        //Descontos obrigatórios

        pagamento.descontoFGTS(pagamento.getSalarioBruto());

        pagamento.descontoINSS(pagamento.getSalarioBruto());

        pagamento.descontoIRRF(pagamento.getSalarioBruto());

        pagamento.setDataEmissaoPagamento(LocalDate.now());

        //Adicionais previstos por lei

        System.out.print("Funcionário recebe adicional de insalubridade ? (s/n): ");
        char opcao = scannerString.next().charAt(0);

        if (opcao == 's') {
            pagamento.adicionaInsalubridade(pagamento.getSalarioBruto());
        }

        System.out.print("Funcionário recebe adicional de periculosidade ? (s/n): ");
        opcao = scannerString.next().charAt(0);

        if (opcao == 's') {
            pagamento.adicionaPericulosidade(pagamento.getSalarioBruto());
        }

        //Descontos VR e VA

        System.out.print("Funcionário tem descontado Vale refeição ? (s/n): ");
        opcao = scannerString.next().charAt(0);

        if (opcao == 's') {
            pagamento.descontaValeRefeicao(pagamento.getSalarioBruto());
        }

        System.out.print("Funcionário tem descontado Vale transporte ? (s/n): ");
        opcao = scannerString.next().charAt(0);

        if (opcao == 's') {
            pagamento.descontaValeTransporte(pagamento.getSalarioBruto());
        }

        //Fim das entradas

        pagamento.calculaSalarioHora(pagamento.getSalarioBruto());

        System.out.println(" ");

        //Método que imprime todos os atributos da classe funcionário: Nome, sobrenome, admissão e profissão.
        funcionario.imprimir();

        System.out.println(" ");

        //Método que imprime todos os atributos da classe pagamentos: Descontos, adicionais obrigatórios e opcionais.
        pagamento.imprimir();

        ContrachequeDAO contrachequeDAO = new ContrachequeDAO();

        System.out.print("\nGostaria de cadastrar o funcionário no banco de dados da empresa ? \n1 - Sim \n2 - Não \nDigite sua resposta: ");
        opcao = scanner.next().charAt(0);

        if (opcao == '1'){
            contrachequeDAO.save(funcionario);
            contrachequeDAO.save(pagamento);
        }

        scanner.close();
        scannerString.close();
    }
}
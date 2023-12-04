import java.time.LocalDate;
import java.util.Scanner;

public class Pagamento {

    private double salarioBruto;

    private double salarioLiquido;

    private double salarioHora;

    private LocalDate dataEmissaoPagamento;
    private double valorFGTS;
    private double valorINSS;
    private double valorIRRF;

    private double valorInsalubridade;

    private double valorPericulosidade;

    private double valorValeAlimentacao;

    private double valorValeRefeicao;


    public Pagamento(){

    }

    public Pagamento(double salario) {
        this.salarioBruto = salario;
    }

    public Pagamento(double salarioBruto, double salarioLiquido, double salarioHora) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.salarioHora = salarioHora;
    }

    public Pagamento(double salarioBruto, double salarioLiquido, double salarioHora, LocalDate dataEmissaoPagamento) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.salarioHora = salarioHora;
        this.dataEmissaoPagamento = dataEmissaoPagamento;
    }

    public Pagamento(double salarioBruto, double salarioLiquido, double salarioHora, LocalDate dataEmissaoPagamento, double valorFGTS, double valorINSS, double valorIRRF) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.salarioHora = salarioHora;
        this.dataEmissaoPagamento = dataEmissaoPagamento;
        this.valorFGTS = valorFGTS;
        this.valorINSS = valorINSS;
        this.valorIRRF = valorIRRF;
    }

    public Pagamento(double salarioBruto, double salarioLiquido, double salarioHora, LocalDate dataEmissaoPagamento, double valorFGTS, double valorINSS, double valorIRRF, double valorInsalubridade, double valorPericulosidade, double valorValeAlimentacao, double valorValeRefeicao) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.salarioHora = salarioHora;
        this.dataEmissaoPagamento = dataEmissaoPagamento;
        this.valorFGTS = valorFGTS;
        this.valorINSS = valorINSS;
        this.valorIRRF = valorIRRF;
        this.valorInsalubridade = valorInsalubridade;
        this.valorPericulosidade = valorPericulosidade;
        this.valorValeAlimentacao = valorValeAlimentacao;
        this.valorValeRefeicao = valorValeRefeicao;
    }

    //Getters e setters
    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salario) {
        this.salarioBruto = salario;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public LocalDate getDataEmissaoPagamento() {
        return dataEmissaoPagamento;
    }

    public void setDataEmissaoPagamento(LocalDate dataEmissaoPagamento) {
        this.dataEmissaoPagamento = dataEmissaoPagamento;
    }

    public double getValorFGTS() {
        return valorFGTS;
    }

    public void setValorFGTS(double valorFGTS) {
        this.valorFGTS = valorFGTS;
    }

    public double getValorINSS() {
        return valorINSS;
    }

    public void setValorINSS(double valorINSS) {
        this.valorINSS = valorINSS;
    }

    public double getValorIRRF() {
        return valorIRRF;
    }

    public void setValorIRRF(double valorIRFF) {
        this.valorIRRF = valorIRFF;
    }

    public double getValorInsalubridade() {
        return valorInsalubridade;
    }

    public void setValorInsalubridade(double valorInsalubridade) {
        this.valorInsalubridade = valorInsalubridade;
    }

    public double getValorPericulosidade() {
        return valorPericulosidade;
    }

    public void setValorPericulosidade(double valorPericulosidade) {
        this.valorPericulosidade = valorPericulosidade;
    }

    public double getValorValeAlimentacao() {
        return valorValeAlimentacao;
    }

    public void setValorValeAlimentacao(double valorValeAlimentacao) {
        this.valorValeAlimentacao = valorValeAlimentacao;
    }

    public double getValorValeRefeicao() {
        return valorValeRefeicao;
    }

    public void setValorValeRefeicao(double valorValeRefeicao) {
        this.valorValeRefeicao = valorValeRefeicao;
    }

    //Descontos obrigatórios

    void descontoFGTS(double salarioBruto){
        this.salarioLiquido -= (this.salarioBruto * 8 / 100);
        this.valorFGTS += (this.salarioBruto - this.salarioLiquido);
    }

    void descontoINSS(double salarioBruto){
        if (salarioBruto <= 1302.00) {
            this.salarioLiquido -= (this.salarioBruto * 7.5 / 100);
        }
        else if (salarioBruto > 1302.00 && salarioBruto <= 2571.29){
            this.salarioLiquido -= (this.salarioBruto * 9 / 100);
        }
        else if (salarioBruto >= 2571.30 && salarioBruto <= 3856.94){
            this.salarioLiquido -= (this.salarioBruto * 12 / 100);
        }
        else {
            this.salarioLiquido -= (this.salarioBruto * 14 / 100);
        }
        this.valorINSS += (this.salarioBruto - (this.salarioLiquido + valorFGTS));
    }

    void descontoIRRF(double salarioLiquido){
        if (this.salarioLiquido <= 1903.98) {
            this.salarioLiquido -= 0;
            this.valorIRRF = 0;

        }
        else if (this.salarioLiquido >= 1903.98 && this.salarioLiquido <= 2826.65) {
            this.salarioLiquido -= 142.80;
            this.valorIRRF = 142.80;

        }
        else if (this.salarioLiquido >= 2826.66 && salarioLiquido <= 3751.05) {
            this.salarioLiquido -= 354.80;
            this.valorIRRF = 354.80;
        }
        else if (this.salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            this.salarioLiquido -= 636.13;
            this.valorIRRF = 636.13;
        }
        else {
            this.salarioLiquido -= 869.36;
            this.valorIRRF = 869.36;

        }
    }

    //Adicionais obrigatórios

    void adicionaPericulosidade(double salarioLiquido){
        this.salarioLiquido += (this.salarioBruto * 30 / 100);
        this.valorPericulosidade += salarioBruto * 30 / 100;
    }
    void adicionaInsalubridade(double salarioLiquido) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Grau de risco: \n1 - Baixo \n2 - Média \n3 - Alto \nDigite o grau de risco (1, 2 ou 3): ");
        char opcao = scanner.next().charAt(0);

        if (opcao == '1'){
            this.salarioLiquido += (this.salarioBruto * 10 / 100);
            this.valorInsalubridade += salarioBruto * 10 / 100;
        }

        if (opcao == '2'){
            this.salarioLiquido += (this.salarioBruto * 20 / 100);
            this.valorInsalubridade += salarioBruto * 20 / 100;
        }

        if (opcao == '3'){
            this.salarioLiquido += (this.salarioBruto * 40 / 100);
            this.valorInsalubridade += salarioBruto * 40 / 100;
        }

    }

    //Descontos opcionais
    void descontaValeRefeicao(double salarioBruto) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem de desconto do vale Refeição (Máximo permitido é 20%): ");
        double porcentagemVR = scanner.nextDouble();

        this.salarioLiquido -= (this.salarioBruto * porcentagemVR / 100);
    }
    void descontaValeTransporte(double salarioBruto) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem de desconto do vale Transporte (Máximo permitido é 6%): ");
        double porcentagemValeTransporte = scanner.nextDouble();

        this.salarioLiquido -= (this.salarioBruto * porcentagemValeTransporte / 100);
    }

    //Metodo para calcular salário hora
    void calculaSalarioHora(double salarioBruto){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas pelo funcionário: ");
        double horasTrabalhadas = scanner.nextDouble();

        this.salarioHora += this.salarioBruto / horasTrabalhadas;
    }

    //Metodo para a impressão de todos os atributos
    public void imprimir(){
        System.out.println("Dados do Pagamento: " + "\n" + "\nData da emissão: " + LocalDate.now() + "\nSalario bruto: " + salarioBruto +
                "\nSalário liquido: " + salarioLiquido + "\nSalário hora: " + salarioHora + "\nFGTS: " +
                valorFGTS + "\nINSS: " + valorINSS + "\nIRRF: " + valorIRRF + "\nValor periculosidade: " + valorPericulosidade + "\nValor insalubridade: " + valorInsalubridade);
    }

}

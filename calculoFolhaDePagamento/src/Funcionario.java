import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
public class Funcionario {

    private String nome;

    private String sobrenome;

    private Date admissao;

    private String profissao;


    public Funcionario(){

    }

    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Funcionario(String nome, String sobrenome, Date admissao, String profissao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.admissao = admissao;
        this.profissao = profissao;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    //Método para a impressão de todos os atributos
    public void imprimir(){
        System.out.println("Dados do Funcionário: " + "\n" + "\n" + "Nome: " + nome + "\nSobrenome: "+ sobrenome + "\nAdmissão: " + admissao + "\nProfissão: " + profissao);
    }
}

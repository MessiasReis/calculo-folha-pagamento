import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class ContrachequeDAO {

    /*
     * CRUD
     * C : create - INSERT
     * r : read - SELECT
     * u : update - UPDATE
     * d : delete - DELETE
     */


    public void save(Funcionario funcionario){

        String sql = "INSERT INTO funcionario(nome, sobrenome, admissao, profissao) VALUES(?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar uma conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //PreparedStatement para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            //Valores que são esperados pela query
            pstm.setString(1, funcionario.getNome());
            pstm.setString(2, funcionario.getSobrenome());
            pstm.setDate(3, new Date(funcionario.getAdmissao().getTime()));
            pstm.setString(4, funcionario.getProfissao());

            //Executar a query
            pstm.execute();

            System.out.println("Funcionário cadastrado no banco de dados");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //Fechar as conexões
            try{
                if (pstm!=null){
                    pstm.close();
                }

                if (conn!=null){
                    conn.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void save(Pagamento pagamento){

        String sql = "INSERT INTO pagamento(salarioBruto, salarioLiquido, salarioHora, dataEmissaoPagamento, valorFGTS, valorINSS, valorIRRF, valorInsalubridade, valorPericulosidade, valorValeAlimentacao, valorValeRefeicao) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar uma conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //PreparedStatement para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            //Valores que são esperados pela query
            pstm.setDouble(1, pagamento.getSalarioBruto());
            pstm.setDouble(2, pagamento.getSalarioLiquido());
            pstm.setDouble(3, pagamento.getSalarioHora());
            pstm.setDate(4, Date.valueOf(pagamento.getDataEmissaoPagamento()));
            pstm.setDouble(5, pagamento.getValorFGTS());
            pstm.setDouble(6, pagamento.getValorINSS());
            pstm.setDouble(7, pagamento.getValorIRRF());
            pstm.setDouble(8, pagamento.getValorInsalubridade());
            pstm.setDouble(9, pagamento.getValorPericulosidade());
            pstm.setDouble(10, pagamento.getValorValeAlimentacao());
            pstm.setDouble(11, pagamento.getValorValeRefeicao());

            //Executar a query
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //Fechar as conexões
            try{
                if (pstm!=null){
                    pstm.close();
                }

                if (conn!=null){
                    conn.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }



}

package bd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Banco {
    private Connection conexao = null;
    private Statement declaracao = null;
    private ResultSet resultados = null;   
            
    
    public void conectar(){
        String servidor = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";
        String senha = "";
        String driver = "com.mysql.jdbc.Driver";
    
        try{
            Class.forName(driver);
            this.conexao = (Connection)DriverManager.getConnection(servidor,usuario, senha);
            this.declaracao = (Statement) this.conexao.createStatement();
        }catch(Exception e){
            System.out.println("Erro : " + e.getMessage());
        }
    
    
    }
    
    public boolean estaConectado(){
        if (conexao == null){
            return false;
        }else {
            return true;
        }
    }
    
    public void insereAluno(Aluno aluno){
        try{
            String sql = "INSERT INTO ALUNOS (NOME,IDADE) VALUES ('" + aluno.getNome()+"',"+aluno.getIdade()+");";
            this.declaracao.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Erro :" + e.getMessage());
        }
    }
    
    public ArrayList<Aluno> listaAlunos(){
        ArrayList<Aluno> alunos = new ArrayList<>();
        try{
            String sql = "SELECT * FROM ALUNOS";
            this.resultados =this.declaracao.executeQuery(sql);
            while(this.resultados.next()){
                Aluno a1 = new Aluno();
                a1.setId(this.resultados.getInt("idalunos"));
                a1.setNome(this.resultados.getString("nome"));
                a1.setIdade(this.resultados.getInt("idade"));
                alunos.add(a1);
            }
        }catch(Exception e){
            System.out.println("Erro :" + e.getMessage());
        }
        return alunos;
    }
    
    public void excluiAluno(Aluno aluno){
        try{
            String sql = "DELETE FROM ALUNOS WHERE IDALUNOS = " + aluno.getId()+";";
            this.declaracao.executeUpdate(sql);
        }catch(Exception e){
            System.out.println("Erro : " + e.getMessage());
        }
    }
    
}

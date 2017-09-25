
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConexaoBanco;
import model.Diretor;
import model.Funcionario;
import model.VendedorAuxiliar;
import model.VendedorComissionado;

public class FuncionarioDAO {
    ConexaoBanco conectar;
    
    public void conectar(){
        conectar = new ConexaoBanco();
        
    }
    
    public void inserirFuncionario(int cpf,String nome,double salario,String cargo,int tempo){
        try{
           String codigoSQL = "INSERT INTO FUNCIONARIOS(CPF,NOME,SALARIO,CARGO) VALUES (?,?,?,?,?);";
           Connection con = conectar.getConnection();
           PreparedStatement stmt = con.prepareStatement(codigoSQL);
           stmt.setInt(1, cpf);
           stmt.setString(2, nome);
           stmt.setDouble(3, salario);
           stmt.setString(4, cargo);
           stmt.setInt(5, tempo);
           
        }catch(SQLException e){
            System.out.println("Erro : "+ e.getMessage());
        }
    }
    
    public ArrayList listaFuncionarios(){
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Funcionario funcionario;
        try{
            String codigoSQL = "SELECT * FROM FUNCIONARIOS;";
            Connection con = conectar.getConnection();
            PreparedStatement stmt = con.prepareStatement(codigoSQL);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                funcionario = new Funcionario();
                funcionario.setCpf(rs.getInt("cpf"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setTempo(rs.getInt("tempo"));
                listaFuncionario.add(funcionario);
            }
            
        }catch(SQLException e){
            System.out.println("Erro : "+ e.getMessage());
        }return listaFuncionario;
        
        
    }
    
    
    
    
}


package bd;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BD {

 
    public static void main(String[] args) {
        Banco b1 = new Banco();
        
        b1.conectar();
        
        if (b1.estaConectado() == true){
            System.out.println("Tá conectado");
        }else{
            System.out.println("Não tá conectado");
        }
    
    
        Aluno aluno = new Aluno();
        aluno.setNome(JOptionPane.showInputDialog("Informe o nome :"));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade :")));
    
        b1.insereAluno(aluno);
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos = b1.listaAlunos();
        
        for (int i = 0 ;i < alunos.size();i++){
            System.out.println("ID : " + alunos.get(i).getId());
            System.out.println("Nome : " + alunos.get(i).getNome());
            System.out.println("Idade : " + alunos.get(i).getIdade());
        }
    
    
        //b1.excluiAluno(alunos.get(3));
    
    
    
    
    
    }
    
}

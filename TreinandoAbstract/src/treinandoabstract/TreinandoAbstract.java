
package treinandoabstract;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TreinandoAbstract {

   
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<> ();
        int laco = 0,idade;
        String nome,posicao;
        
        
        while (laco == 0 ){
            //Obtendo os parâmetros
            nome = JOptionPane.showInputDialog("Informe o nome do jogador : ");
            posicao = JOptionPane.showInputDialog("Informe a posição do jogador : ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador : "));
            //Criando o objeto
            Jogador x = new Jogador(nome,posicao,idade);
            //Adicionando o objeto na lista
            jogadores.add(x);
            //Renovando (ou não) o laço
            laco = JOptionPane.showConfirmDialog(null,"Deseja adicionar mais um jogador ? ");
        }
        
        Time y = new Time("Vitória",jogadores);
        
        
        for (int i = 0;i < jogadores.size();i++){
            JOptionPane.showMessageDialog(null,"Jogadores do time:  " + y.getNome() + "\n" + "Jogador " + (i+1) + ":\n" + y.getJogadores().get(i).getNome() + "\n" + y.getJogadores().get(i).getPosicao() + "\n" + y.getJogadores().get(i).getIdade());   
        }
        
        
        
        
        
        
        
        
    }
    
}

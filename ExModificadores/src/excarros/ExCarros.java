
package excarros;
import javax.swing.JOptionPane;
public class ExCarros {

  
    public static void main(String[] args) {
       Carro meucarro = new Carro();
       
       
       
       
       if (meucarro.liga() ==  true){
           
           
           
           JOptionPane.showMessageDialog(null,"Carro ligado.");
           JOptionPane.showMessageDialog(null,"A velocidade atual do carro é de : " + meucarro.getVelocidadeAtual()+ " KM/h.");
           if (meucarro.acelera(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da aceleração : "))) == true ){
               JOptionPane.showMessageDialog(null,"A velocidade atual do carro é de : " + meucarro.getVelocidadeAtual()+ " KM/h.");
               JOptionPane.showMessageDialog(null,"Atualmente, o seu carro está na " + meucarro.pegaMarcha() + "º marcha." );
           }else{
               JOptionPane.showMessageDialog(null,"Limite de velocidade do carro atingido, a velocidade atual do carro é de : " + meucarro.getVelocidadeAtual() + " KM/h.");
               JOptionPane.showMessageDialog(null,"Atualmente, o seu carro está na " + meucarro.pegaMarcha() + "º marcha." );
           }
           
           
       }
        
        
        
    }
    
}


package gabrielpbl;


import javax.swing.JOptionPane;
import java.util.Calendar;


public class GabrielPBL {

   
    public static void main(String[] args) {
        
        HeartRates PBL = new HeartRates(JOptionPane.showInputDialog("Informe seu ano de nascimento : "));
        
        int idade = PBL.mudaData();
        double frequenciaMaxima = PBL.frequenciaMaxima(idade);
        double alvoMinimo = PBL.alvoMinimo(frequenciaMaxima);
        double alvoMaximo = PBL.alvoMaximo(frequenciaMaxima);
        
        
        
        JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos.");
        JOptionPane.showMessageDialog(null,"Sua frequência cardíaca máxima é de " + frequenciaMaxima + " por minuto.");
        JOptionPane.showMessageDialog(null,"Sua frequência cardíaca alvo está entre :  " + alvoMinimo + " e " + alvoMaximo + " por minuto.");

    }
}        
        
        
        
        
        
        
   

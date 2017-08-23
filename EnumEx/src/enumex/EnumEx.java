
package enumex;

import javax.swing.JOptionPane;

public class EnumEx {

    public static void main(String[] args) {
        
        double precoComum = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço da ração comum"));
        double precoPremium = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço da ração premium"));
        double precoSPremium = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço da ração super premium"));
        
        Comum racaoComum = new Comum(precoComum);
        Premium racaoPremium = new Premium(precoPremium); 
        SuperPremium racaoSPremium = new SuperPremium(precoSPremium);
        
        int porteCao = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o porte do seu cão:\n\n1-Grande\n2-Médio\n3-Pequeno"));
        
        switch(porteCao){
            case 1:
                JOptionPane.showMessageDialog(null,"Grande porte pode escolher rações : " + Cao.GRANDE.getTipoRacao());
                int selecaoRacao = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o tipo de ração:\n\n1-Premium\n2-Super premium"));
                
                break;
        }
        
        
    }
    
}

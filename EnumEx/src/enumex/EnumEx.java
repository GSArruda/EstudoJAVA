
package enumex;

import javax.swing.JOptionPane;

public class EnumEx {

    public static void main(String[] args) {
        
        double precoComum = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço da ração comum"));
        Comum racaoComum = new Comum(precoComum);
        
        double precoRacaoComum = racaoComum.getValor();
        
         
        SuperPremium racaoSPremium = new SuperPremium();
        
        int porteCao = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o porte do seu cão:\n\n1-Grande\n2-Médio\n3-Pequeno"));
        
        switch(porteCao){
            case 1:
                JOptionPane.showMessageDialog(null,"Grande porte pode escolher rações : " + Cao.GRANDE.getTipoRacao());
                int selecaoRacao = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o tipo de ração:\n\n1-Premium\n2-Super premium"));
                if (selecaoRacao == 1){
                    Premium racaoPremium = new Premium();
                    racaoPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração premium custa " + racaoPremium.getValor() + " deseja comprar?");
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoPremium.valorFinal(quilosRacao) + " reais.");
                    }else{}
                
                }
                break;
        }
        
        
    }
    
}

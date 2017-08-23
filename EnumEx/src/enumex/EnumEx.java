
package enumex;

import javax.swing.JOptionPane;

public class EnumEx {

    public static void main(String[] args) {
        
        double precoComum = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o preço da ração comum"));
        Comum racaoComum = new Comum(precoComum);
        
        double precoRacaoComum = racaoComum.getValor();   
        
        int porteCao = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o porte do seu cão:\n\n1-Grande\n2-Médio\n3-Pequeno"));
        
        switch(porteCao){
            case 1:
                JOptionPane.showMessageDialog(null,"Grande porte pode escolher rações : " + Cao.GRANDE.getTipoRacao());
                int selecaoRacaoGrande = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o tipo de ração:\n\n1-Premium\n2-Super premium"));
                if (selecaoRacaoGrande == 1){
                    Premium racaoPremium = new Premium();
                    racaoPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração premium custa " + racaoPremium.getValor() + " deseja comprar?");
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoPremium.valorFinal(quilosRacao) + " reais.");
                    }else{}
                
                }else if (selecaoRacaoGrande == 2){
                    SuperPremium racaoSPremium = new SuperPremium();
                    racaoSPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração super premium custa " + racaoSPremium.getValor() + " deseja comprar?"); 
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoSPremium.valorFinal(quilosRacao) + " reais.");
                    }
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Médio porte pode escolher rações : " + Cao.MEDIO.getTipoRacao());
                int selecaoRacaoMedio = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o tipo de ração:\n\n1-Comum\n2-Premium\n3-Super premium"));
                if (selecaoRacaoMedio == 1){
                    int compra = JOptionPane.showConfirmDialog(null, "A ração comum custa " + racaoComum.getValor() + " deseja comprar?");
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoComum.valorFinal(quilosRacao) + " reais.");
                    }else{}
                }else if(selecaoRacaoMedio == 2){
                    Premium racaoPremium = new Premium();
                    racaoPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração premium custa " + racaoPremium.getValor() + " deseja comprar?");
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoPremium.valorFinal(quilosRacao) + " reais.");
                    }else{}
                
                }else if (selecaoRacaoMedio == 2){
                    SuperPremium racaoSPremium = new SuperPremium();
                    racaoSPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração super premium custa " + racaoSPremium.getValor() + " deseja comprar?"); 
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoSPremium.valorFinal(quilosRacao) + " reais.");
                    }
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Pequeno porte pode escolher rações : " + Cao.MEDIO.getTipoRacao());
                int selecaoRacaoPequeno = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione o tipo de ração:\n\n1-Comum\n2-Premium\n3-Super premium"));
                if (selecaoRacaoPequeno == 1){
                    int compra = JOptionPane.showConfirmDialog(null, "A ração comum custa " + racaoComum.getValor() + " deseja comprar?");
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoComum.valorFinal(quilosRacao) + " reais.");
                    }else{}
                }else if(selecaoRacaoPequeno == 2){
                    Premium racaoPremium = new Premium();
                    racaoPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração premium custa " + racaoPremium.getValor() + " deseja comprar?");
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoPremium.valorFinal(quilosRacao) + " reais.");
                    }else{}
                
                }else if (selecaoRacaoPequeno == 2){
                    SuperPremium racaoSPremium = new SuperPremium();
                    racaoSPremium.setValor(precoComum);
                    int compra = JOptionPane.showConfirmDialog(null, "A ração super premium custa " + racaoSPremium.getValor() + " deseja comprar?"); 
                    if (compra == 0){
                        int quilosRacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos quilos de ração você pegou "));
                        JOptionPane.showMessageDialog(null,"O preço final do produto é de : " + racaoSPremium.valorFinal(quilosRacao) + " reais.");
                    }
                }    
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
                break;     
        }   
    }    
}

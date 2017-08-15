
package exabstract;

import javax.swing.JOptionPane;


public class ExAbstract {

    
    public static void main(String[] args) {
        
        int selecionar = Integer.parseInt(JOptionPane.showInputDialog("Selecione o dispositivo : "));
        double CalculoParagrafo,CalculoLink,CalculoLista;
        
        
        switch (selecionar){
            case 1://DESKTOP
                Paragrafo paragrafoDesktop = new Paragrafo(30,"vermelho");
                Link linkDesktop = new Link(50,"azul");
                Lista listaDesktop = new Lista(80,"preto");
                Desktop d1 = new Desktop(paragrafoDesktop,linkDesktop,listaDesktop);
                CalculoParagrafo = d1.CalculaProporcao(paragrafoDesktop.getTamanho()); 
                CalculoLink = d1.CalculaProporcao(linkDesktop.getTamanho());
                CalculoLista = d1.CalculaProporcao(listaDesktop.getTamanho());
                
                JOptionPane.showMessageDialog(null,"Tamanhos remodelados do parágrafo , link e lista respectivamente : \n" +CalculoParagrafo+"\n"+CalculoLink+"\n"+CalculoLista);
                break;
            case 2://TABLET
                 Paragrafo p1 = new Paragrafo(30,"vermelho");
                 Link link1 = new Link(50,"azul");
                 Lista lista1 = new Lista(80,"preto");
                 Tablet t1 = new Tablet(p1,link1,lista1);
                 CalculoParagrafo = d1.CalculaProporcao(p1.getTamanho()); 
                 CalculoLink = d1.CalculaProporcao(link1.getTamanho());
                 CalculoLista = d1.CalculaProporcao(lista1.getTamanho());
                
                JOptionPane.showMessageDialog(null,"Tamanhos remodelados do parágrafo , link e lista respectivamente : \n" +CalculoParagrafo+"\n"+CalculoLink+"\n"+CalculoLista);
                break;
            case 3://NOTEBOOK
                
                break;
            case 4://CELULAR
                
                break;    
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

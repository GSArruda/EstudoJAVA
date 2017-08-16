
package exabstract;

import javax.swing.JOptionPane;


public class ExAbstract {

    
    public static void main(String[] args) {
        
        int selecionar = Integer.parseInt(JOptionPane.showInputDialog("Selecione o dispositivo : \n1 - Desktop\n2 - Tablet\n3 - Notebook\n4 - Celular"));
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
                Paragrafo paragrafoTablet = new Paragrafo(20,"vermelho");
                Link linkTablet = new Link(10,"azul");
                Lista listaTablet = new Lista(90,"preto");
                Tablet t1 = new Tablet(paragrafoTablet,linkTablet,listaTablet);
                CalculoParagrafo = t1.CalculaProporcao(paragrafoTablet.getTamanho()); 
                CalculoLink = t1.CalculaProporcao(linkTablet.getTamanho());
                CalculoLista = t1.CalculaProporcao(listaTablet.getTamanho());
                
                JOptionPane.showMessageDialog(null,"Tamanhos remodelados do parágrafo , link e lista respectivamente : \n" +CalculoParagrafo+"\n"+CalculoLink+"\n"+CalculoLista);
                break;
            case 3://NOTEBOOK
                Paragrafo paragrafoNotebook = new Paragrafo(45,"vermelho");
                Link linkNotebook = new Link(18,"azul");
                Lista listaNotebook = new Lista(28,"preto");
                Notebook n1 = new Notebook(paragrafoNotebook,linkNotebook,listaNotebook);
                CalculoParagrafo = n1.CalculaProporcao(paragrafoNotebook.getTamanho()); 
                CalculoLink = n1.CalculaProporcao(linkNotebook.getTamanho());
                CalculoLista = n1.CalculaProporcao(listaNotebook.getTamanho());
                
                JOptionPane.showMessageDialog(null,"Tamanhos remodelados do parágrafo , link e lista respectivamente : \n" +CalculoParagrafo+"\n"+CalculoLink+"\n"+CalculoLista);
                break;
            case 4://CELULAR
                Paragrafo paragrafoCelular = new Paragrafo(60,"vermelho");
                Link linkCelular = new Link(9,"azul");
                Lista listaCelular = new Lista(100,"preto");
                Celular c1 = new Celular(paragrafoCelular,linkCelular,listaCelular);
                //JOptionPane.showMessageDialog(null,paragrafoCelular.getTamanho()); 
                CalculoParagrafo = c1.CalculaProporcao(paragrafoCelular.getTamanho()); 
                CalculoLink = c1.CalculaProporcao(linkCelular.getTamanho());
                CalculoLista = c1.CalculaProporcao(listaCelular.getTamanho());
                
                JOptionPane.showMessageDialog(null,"Tamanhos remodelados do parágrafo , link e lista respectivamente : \n" +CalculoParagrafo+"\n"+CalculoLink+"\n"+CalculoLista);
                break;    
            default:
                JOptionPane.showMessageDialog(null,"Comando inválido.");
        }       
    }   
}

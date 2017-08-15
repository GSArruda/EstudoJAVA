
package exabstract;


public class Tablet extends Dispositivos {
    
    public Tablet(Paragrafo paragrafo,Link link,Lista lista){
        this.paragrafo = paragrafo;
        this.link = link;
        this.lista = lista;
    }
    
    public double CalculaProporcao(int tamanho){
        return tamanho;
        
    }
}

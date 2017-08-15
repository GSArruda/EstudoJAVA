
package exabstract;


public class Desktop extends Dispositivos {
    
    public Desktop(Paragrafo paragrafo,Link link,Lista lista){
        this.paragrafo = paragrafo;
        this.link = link;
        this.lista = lista;
    }
    
    public double CalculaProporcao(int tamanho){
        return ((150.0/100.0) * tamanho);
        
    }
    
}

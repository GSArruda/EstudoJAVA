
package exabstract;


public class Celular extends Dispositivos{
    public Celular(Paragrafo paragrafo,Link link,Lista lista){
        this.paragrafo = paragrafo;
        this.link = link;
        this.lista = lista;
    }
    
    public double CalculaProporcao(int tamanho){
        return tamanho - ((30.0/100.0) * tamanho);
        
    }
}

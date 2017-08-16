
package exabstract;


public class Notebook extends Dispositivos{
    public Notebook(Paragrafo paragrafo,Link link,Lista lista){
        this.paragrafo = paragrafo;
        this.link = link;
        this.lista = lista;
    }
    
    public double CalculaProporcao(int tamanho){
        return tamanho*2;
        
    }
}

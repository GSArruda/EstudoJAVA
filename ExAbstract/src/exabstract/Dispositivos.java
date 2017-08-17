
package exabstract;
import java.util.ArrayList;

abstract class Dispositivos {
    protected ArrayList<Paragrafo> paragrafo  = new ArrayList <>();
    protected ArrayList<Link> link = new ArrayList <> ();
    protected ArrayList<Lista> lista = new ArrayList <> ();
    
    
    
    abstract double CalculaProporcao(int tamanho);
        
    
    
}

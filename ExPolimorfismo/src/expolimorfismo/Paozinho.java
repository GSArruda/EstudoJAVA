
package expolimorfismo;

public class Paozinho extends Produto{
    private boolean doce;
    
     public Paozinho(double preco,int quantidade,boolean doce){
         super(preco,quantidade);
        this.doce = doce;
    }
    
    public boolean getDoce(){
        return this.doce;
    }
}

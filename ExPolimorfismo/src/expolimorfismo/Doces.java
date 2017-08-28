
package expolimorfismo;

public class Doces extends Produto{
    private boolean diet;
    
    public Doces(double preco,int quantidade,boolean diet){
        super(preco,quantidade);
        this.diet = diet;
    }
    
    public boolean getDiet(){
        return this.diet;
    }
}

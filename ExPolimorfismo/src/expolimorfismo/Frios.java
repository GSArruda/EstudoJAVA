
package expolimorfismo;

public class Frios extends Produto{
    private String descricao;

    public Frios(double preco,int quantidade,String descricao){
        super(preco,quantidade);
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}

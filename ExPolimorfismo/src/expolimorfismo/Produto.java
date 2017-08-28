
package expolimorfismo;

public class Produto {
    protected double preco;
    protected int quantidade;
    
    public Produto(double preco,int quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

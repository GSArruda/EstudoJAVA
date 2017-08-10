
package vendaeletro;


public class Produtos {
    protected String marca;
    protected double preco;
    protected int voltagem;
    
    public Produtos(String marca,int voltagem){
        this.marca = marca;
        this.voltagem = voltagem;
    }
    
    public Produtos(String marca,int voltagem,double preco){
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
    }
    
    public double CalculaPreco(int desconto,double preco){
        //verificar se tem que por desconto no tipo double.
        this.preco = preco - ((desconto/100.0) * preco);
        return this.preco;
    }
    
    public boolean validaVoltagem(int voltagem){
        if (voltagem == 110 || voltagem == 220 ){
            return true;
        }else
            return false;
    }
    
    
    
    
    
    
    
    
    
}

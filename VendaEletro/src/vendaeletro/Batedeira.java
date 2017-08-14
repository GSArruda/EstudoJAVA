
package vendaeletro;


public class Batedeira extends Produtos {
    
    private int qtdHelices;
    
    public Batedeira(String marca,int voltagem){
       super(marca,voltagem);
    } 
    
    public Batedeira(String marca,int voltagem,double preco){
        super(marca,voltagem,preco);
    }
    
    public void setHelices(int helices){
        this.qtdHelices = helices;
    }
    
    public int getHelices(){
        return this.qtdHelices;
    }
    
    public boolean verificaMes(String mes){
        
         if (mes.equals("Dezembro") || mes.equals("dezembro")){
            return true;
        }else
        return false;
        
    }
    
    public @Override double CalculaPreco(double preco){
        double novoValor = preco - ((20.0/100.0) * preco);
        return novoValor;
    }

    public double calculaQuantidade(double quantidadeProduto,double capacidadeProduto,int quantidadeHelices){
        double resultado = (quantidadeProduto/(capacidadeProduto * quantidadeHelices));
        return resultado;
    }

    
    
    
    
    
    
    
    
    
    
}

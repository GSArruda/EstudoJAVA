
package vendaeletro;


public class Liquidificador extends Produtos {
    private Tampa tampa;
    
    
    public Liquidificador(String marca,int voltagem){
       super(marca,voltagem);
    } 
    
    public Liquidificador(String marca,int voltagem,double preco){
        super(marca,voltagem,preco);
    }
    
     public boolean verificaMes(String mes){
         if (mes.equals("Agosto") || mes.equals("agosto")){
            return true;
        }else{
            return false;
         }
    }
    
     
    public void setTampa(Tampa novaTampa){
        this.tampa = novaTampa;
    }
    
    public @Override double CalculaPreco(double preco){
        double novoValor = preco - ((10.0/100.0) * preco);
        return novoValor;
    }
    
    
    public double calculaQuantidade(double quantidadeProduto,double capacidadeProduto){
        double resultado = quantidadeProduto/capacidadeProduto;
        return resultado;
    }
    
    
    
    
    
    
}

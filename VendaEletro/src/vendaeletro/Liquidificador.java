
package vendaeletro;


public class Liquidificador extends Produtos {
    private String tampaCor,tampaDesc;
    
    
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
    
    
    public double mudaValor(double preco){
        double novoValor = preco - ((10.0/100.0) * preco);
        return novoValor;
    }
    
    
    public double calculaQuantidade(double quantidadeProduto,double capacidadeProduto){
        double resultado = quantidadeProduto/capacidadeProduto;
        return resultado;
    }
    
    
    
    
    
    
}

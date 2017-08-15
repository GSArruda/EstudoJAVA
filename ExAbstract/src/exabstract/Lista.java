
package exabstract;


public class Lista extends HTML{
    public Lista(int tamanho,String cor){
        this.tamanho = tamanho;
        this.cor = cor;
    }
    
     public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
}


package exabstract;


public class Paragrafo extends HTML{
    
    public Paragrafo(int tamanho,String cor){
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

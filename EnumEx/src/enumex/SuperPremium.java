
package enumex;

public class SuperPremium extends Racao{
    
    public SuperPremium(double valor){
        this.valor = valor;
    }
    
    @Override public void setValor(double valor){
        this.valor = valor + (0.2 * valor);
    }
    
    @Override public double getValor(){
        return this.valor;
    }
    
    @Override public double valorFinal(int totalPeso){    
        if (totalPeso >=1 && totalPeso <= 3 ){
            return this.valor * totalPeso;
        }else if (totalPeso >=4 && totalPeso<=10){
            return (this.valor * totalPeso) - (this.valor - (0.15 * this.valor));
        }else if (totalPeso >=11 && totalPeso <= 50){
            return (this.valor * totalPeso) - (this.valor - (0.2 * this.valor));
        }else if (totalPeso > 50){
            return (this.valor * totalPeso) - (this.valor - (0.3 * this.valor));
        }else
            return 0;
    }




}

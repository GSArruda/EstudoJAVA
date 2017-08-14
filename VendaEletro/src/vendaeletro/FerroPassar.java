
package vendaeletro;


public class FerroPassar extends Produtos{
    public FerroPassar(String marca,int voltagem){
       super(marca,voltagem);
    } 
    
    public FerroPassar(String marca,int voltagem,double preco){
        super(marca,voltagem,preco);
    }


    public boolean verificaMes(String mes){
         if (mes.equals("Maio") || mes.equals("maio")){
            return true;
        }else
        return false;
        
    }
    
    
    public @Override double CalculaPreco(double preco){
        double novoValor = preco - ((15.0/100.0) * preco);
        return novoValor;
    }

    //TESTAR ESSE MÉTODO
    public @Override boolean validaVoltagem(int voltagem){
        if (super.validaVoltagem(voltagem) == false){
            if (voltagem == 5){
                return true;
            }else
                return false;
        }
        return true;
    }







}

package model;

import model.Funcionario;

public class VendedorComissionado extends Funcionario{
    

  
    public double calculaComissao(double valorVenda) {
        double comissao  = 0.15 * valorVenda;
        return comissao;
    }
    
   
    public void adicionarBonificacao(){
        if (this.getTempo() >= 12){
            this.setSalario(this.salario + 0.05 * this.getSalario());
        }
    }

    public int getTempo() {
        return this.tempo;
    }

    
}

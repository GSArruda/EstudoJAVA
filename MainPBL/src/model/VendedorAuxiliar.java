
package model;

import model.Funcionario;

public class VendedorAuxiliar extends Funcionario{
    
    

    public double calculaComissao(double valorVenda) {
       double comissao;
       if (valorVenda >= 200){           
           comissao = 0.05 * valorVenda;
       }else{
           comissao = 0.02 * valorVenda;
       }
       return comissao;
    }
    
 
    public void adicionarBonificacao(){
        if (this.getTempo() >= 12){
            this.setSalario(this.salario + 0.02 * this.getSalario());
        }
    }

   
    
    
}

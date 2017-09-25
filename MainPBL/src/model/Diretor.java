
package model;

import model.Funcionario;

public class Diretor extends Funcionario{
    
    
   
    public double calculaComissao(double valorVenda) {
        double comissao = 0.05 + valorVenda;
        return comissao;
    }
    

    public void adicionarBonificacao(){
        this.setSalario(this.salario + (0.10 * this.getSalario()));
    }

    public int getTempo() {
        return this.tempo;
    }

    
}


package atividadeheranca;


public class Medico {
    protected String CRM,nome;
    protected double salario;
    protected int idade;
    
    public String getCRM(){
        return this.CRM;
    }
    
    public void setCRM(String crm){
        this.CRM = crm;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public boolean medicoAposentado(int idade){
        if (idade >= 55){
            return true;
        }else 
            return false;
        
    }
    
    public double valorAposentadoria(double salario){
        double salarioAposentadoria = (80.0/100.0) * salario;
        return salarioAposentadoria;
    }
    
    
  
    
    
}

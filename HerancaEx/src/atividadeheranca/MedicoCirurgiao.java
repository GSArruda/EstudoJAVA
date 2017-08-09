
package atividadeheranca;


public class MedicoCirurgiao extends Medico{
    public @Override boolean medicoAposentado(int idade){
        if (idade >= 50){
            return true;
        }else 
            return false;
    }
    
    public @Override double valorAposentadoria(double salario){
        double NovaAposentadoria = super.valorAposentadoria(salario) + 800.0;
        return NovaAposentadoria;
    }
}

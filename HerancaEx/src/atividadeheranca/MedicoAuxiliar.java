
package atividadeheranca;


public class MedicoAuxiliar extends Medico{
    public @Override boolean medicoAposentado(int idade){
        if (idade >= 60){
            return true;
        }else 
            return false;
    }
}

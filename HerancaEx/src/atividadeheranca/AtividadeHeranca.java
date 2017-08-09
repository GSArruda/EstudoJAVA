
package atividadeheranca;

import javax.swing.JOptionPane;


public class AtividadeHeranca {

    
    public static void main(String[] args) {
        
        
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("1 - Médico Cirurgião\n2 - Médico Auxiliar"));
        
       
        //MedicoCirurgiao
        
        if (tipo == 1){
            MedicoCirurgiao contente = new MedicoCirurgiao();
            
            contente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade : ")));
            
            if (contente.medicoAposentado(contente.getIdade()) == true){
                JOptionPane.showMessageDialog(null,"Vocé é aposentado.");
                contente.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário anterior  : ")));
                double aposentadoriaCirurgiao = contente.valorAposentadoria(contente.getSalario());
                JOptionPane.showMessageDialog(null,"Sua aposentadoria é de : " + aposentadoriaCirurgiao + " reais.");
            }else{
                JOptionPane.showMessageDialog(null,"Vocé não é aposentado.");
            }

           
        }
        //Médico Auxiliar
        else if (tipo == 2 ){
            MedicoAuxiliar triste = new MedicoAuxiliar();
            
            triste.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade : ")));

            if (triste.medicoAposentado(triste.getIdade()) == true){
                JOptionPane.showMessageDialog(null,"Vocé é aposentado.");
                triste.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário anterior  : ")));
                double aposentadoriaAuxiliar = triste.valorAposentadoria(triste.getSalario());
                JOptionPane.showMessageDialog(null,"Sua aposentadoria é de : " + aposentadoriaAuxiliar + " reais.");
            }else{
                JOptionPane.showMessageDialog(null,"Vocé não é aposentado.");
            }

            
        }else{
            JOptionPane.showMessageDialog(null,"Resposta Inválida.");
        }
    
    
    
    
    
    
    
    
    
    }
    
}

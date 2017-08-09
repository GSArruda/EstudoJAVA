package gabrielpbl;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class HeartRates {
    private String nome,sobrenome,nascimento;
    
    public HeartRates(String nascimento){
        this.nome = "Gabriel";
        this.sobrenome = "Arruda";
        this.nascimento = nascimento;
                
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getNascimento(){
        return this.nascimento;
    }
    
    public void setNascimento(String nascimento){
        this.nascimento = nascimento;
    }
  
    public int mudaData(){
        String [] separar = this.getNascimento().split("/",3);
        
        int convertMes = Integer.parseInt(separar[1]);
        int convertAno = Integer.parseInt(separar[2]);
        int convertDia = Integer.parseInt(separar[0]);
        return CalculaIdade(convertDia,convertMes,convertAno);
    }
    
    public int pegaDiaAtual(){
        Calendar dataAtual = Calendar.getInstance();
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        return diaAtual;
        
    }
    
    public int pegaMesAtual(){
        Calendar dataAtual = Calendar.getInstance();
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
        return mesAtual;
    }
    
    public int pegAnoAtual(){
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        return anoAtual;
    }
    
    public int CalculaIdade(int meuDia,int meuMes,int meuAno){
        int diaAtual=pegaDiaAtual();
        int mesAtual=pegaMesAtual();
        int anoAtual=pegAnoAtual();
        int idade=0;
        
        if (meuMes < mesAtual){
             idade = anoAtual - meuAno;
        }else if (meuMes == mesAtual){
             if (meuDia <= diaAtual){
                 idade = anoAtual - meuAno;
             }else{
                 idade = anoAtual - meuAno -1;
             }
        }else if (meuMes > mesAtual){
             idade = anoAtual - meuAno -1;
        }      
        return idade;
    }
    
  
    public double frequenciaMaxima(int idade){
       
            double frequencia = 220.0 - idade;
            return frequencia;
    }


    public double alvoMinimo(double frequenciaMaxima){
        double minimo = ((50.0/100.0) * frequenciaMaxima);
        return minimo;
    }
    
    public double alvoMaximo(double frequenciaMaxima){
        double maximo = ((85.0/100.0) * frequenciaMaxima);
        return maximo;
    }


}

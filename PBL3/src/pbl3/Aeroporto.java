
package pbl3;

import java.util.ArrayList;


public class Aeroporto {
    private String codigo,nome;
    private boolean status;
    private ArrayList<Voo> saidaVoos = new ArrayList<>();
    private ArrayList<Voo> entradaVoos = new ArrayList<>();
    private static ArrayList<Aviao> avioesPatio = new ArrayList<>();
    private static ArrayList<Aeroporto> aeroportos = new ArrayList<>();
    
    public Aeroporto(String codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public  String getCodigo() {
        return this.codigo;
    }
    
    public  String getNome(){
        return this.nome;
    }

    
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        if (status == 0){
            this.status = true;
        }else
            this.status=false;
    }
    
    public static boolean adicionarAviaoPatio(Aviao aviao){
        if (avioesPatio.size() <= 100){
                avioesPatio.add(aviao);
                return true;
        }else
            return false;
    }
    
    public static ArrayList getAvioesPatio(){
        return avioesPatio;
    }
    
    public static Aviao getAviaoPatio(int i){
        return avioesPatio.get(i);
    }
    
    public void setSaidaVoo(Voo voo){
        this.saidaVoos.add(voo);
    }
    
    public ArrayList getSaidaVoos(){
        return this.saidaVoos;
    }
    
    public Voo getSaidaVoo(int i){
        return this.saidaVoos.get(i);
    }
    
    public ArrayList getChegadaVoos(){
        return this.entradaVoos;
    }
    
    public Voo getChegadaVoo(int i){
        return this.entradaVoos.get(i);
    }
    
    public void setEntradaVoo(Voo voo){
        this.entradaVoos.add(voo);
    }
    
    public ArrayList getEntradaVoos(){
        return this.entradaVoos;
    }
    
    public boolean verificaAeroportos(Aeroporto codigo1,Aeroporto codigo2){
        if (codigo1.equals(codigo2)){
            return true;
        }
        return false;
    }

    public boolean verificaAviao(Aviao prefixo){
        for(int i = 0; i < avioesPatio.size();i++){
            if (avioesPatio.get(i).getPrefixo().equals(prefixo)){
                return true;
            }
        }
        return false;       
    }
    
    public boolean possuiRota(Aeroporto aeroporto){
        for (int i = 0 ; i < saidaVoos.size(); i++){    
            if (this.saidaVoos.get(i).getDestino().equals(aeroporto)){
                return true;
            }
        }
        return false;
    }  
    
    public static ArrayList getListaAeroportos(){
        //for (int i = 0 ; i < aeroportos.size(); i++)
        return aeroportos;  
    }
    
    public static Aeroporto getAeroporto(int  i){
        return aeroportos.get(i);
    }
    
    public void setAeroportos(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }
    
    public boolean comparaAeroporto(String codigo){
        if (this.codigo.equals(codigo)){
            return true;
        }return false;
    } 
    
    public static void removerAviaoPatio(Aviao aviao){
        avioesPatio.remove(aviao);
    }
    
    
}

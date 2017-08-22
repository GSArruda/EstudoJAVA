
package pbl3;

import java.util.ArrayList;

public class Aviao {
    private String prefixo,nome,modelo,fabricante;
    private int assentosTotal;
    private static int assentosOcupados = 0;
    private static ArrayList<Aviao> avioes = new ArrayList<>();
    
    
    public Aviao(String prefixo,String nome,String modelo,String fabricante,int assentosTotal){
        this.prefixo = prefixo;
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.assentosTotal = assentosTotal;
    }
    
    
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAssentosTotal() {
        return assentosTotal;
    }

    public void setAssentosTotal(int assentosTotal) {
        this.assentosTotal = assentosTotal;
    }

    public int getAssentosOcupados() {
        return assentosOcupados;
    }

    public void setAssentosOcupados(int assentosOcupados) {
        this.assentosOcupados = assentosOcupados;
    }
    
    public static ArrayList getListaAvioes(){
        return avioes;
    }
    
    public static void setAviao(Aviao aviao){
        avioes.add(aviao);
    }

    public static Aviao getAviao(int i ){
        return avioes.get(i);
    }




}


package enumex;

public enum Cao {
    PEQUENO("Comum,Premium e Super premium") , MEDIO("Comum,Premium e Super premium") , GRANDE("Premium e Super premium");
    
    private final String tipoRacao;
    
    Cao(String tipoRacao){
        this.tipoRacao = tipoRacao;
    }
    
    public String getTipoRacao(){
        return this.tipoRacao;
    }
    
}

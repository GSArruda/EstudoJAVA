
package pbl3;

public class Voo {
    
    private Aeroporto saida,destino;
    private Aviao aviao;
    
    
    public Voo(Aviao aviao,Aeroporto aeroportoSaida,Aeroporto aeroportoDestino){
        this.aviao = aviao;
        this.saida = aeroportoSaida;
        this.destino = aeroportoDestino;
    };
    
    public Aeroporto getSaida(){
        return this.saida;
    }
    
    public Aeroporto getDestino(){
        return this.destino;
    }
    
    public Aviao getAviao(){
        return this.aviao;
    }
    
    
    
}

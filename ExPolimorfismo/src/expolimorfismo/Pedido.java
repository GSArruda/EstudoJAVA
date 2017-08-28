
package expolimorfismo;

import java.util.ArrayList;

public class Pedido {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    
    static void setProduto(Produto produto){
        produtos.add(produto);
    }
    
    static Produto getProduto(int i){
        return produtos.get(i);
    }
    
    static ArrayList getProdutos(){
        return produtos;
    }
    
    static Produto getFrio(int i){
        if (produtos.get(i) instanceof Frios)
            return produtos.get(i);
        else
            return null;      
    }
    
    static Produto getPaozinhos(){
       return null; 
    }
    
    static Produto getDoces(){
        return null;
    }


}
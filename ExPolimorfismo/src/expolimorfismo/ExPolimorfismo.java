
package expolimorfismo;


public class ExPolimorfismo {

    public static void main(String[] args) {
        
        Produto produto1 = new Frios(20.0,100,"Salmão");
        Produto produto2 = new Paozinho(2.0,200,true);
        Produto produto3 = new Doces(5.0,50,false);
        Produto produto4 = new Frios(50.0,150,"Lagosta");
        
        Pedido.setProduto(produto1);
        Pedido.setProduto(produto2);
        Pedido.setProduto(produto3);
        Pedido.setProduto(produto4);
        
        for (int i = 0;i < Pedido.getProdutos().size() ; i++){
            System.out.println(Pedido.getFrio(i).getPreco() + " " + Pedido.getFrio(i).getQuantidade());
        }
        
    }
    
}

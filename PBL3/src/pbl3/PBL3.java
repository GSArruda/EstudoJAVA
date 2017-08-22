
package pbl3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PBL3 {
    
    public static void main(String[] args) {
        
        
        int opcaoPrincipal; 
        
        do{
            opcaoPrincipal = Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n1-Cadastrar Avião\n2-Cadastrar Aeroporto\n3-Selecionar Aeroporto"));
            int lacoAviao=0,lacoAeroporto=0;
            switch(opcaoPrincipal){
                case 0:
                    break;
                case 1:
                    while(lacoAviao == 0){
                        String prefixoAviao = JOptionPane.showInputDialog("Informe o prefixo do avião");
                        String nomeAviao = JOptionPane.showInputDialog("Informe o nome do avião");
                        String modeloAviao = JOptionPane.showInputDialog("Informe o modelo do avião");
                        String fabricanteAviao = JOptionPane.showInputDialog("Informe o fabricante do avião");
                        int assentosTotal = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de assentos do avião"));
                        Aviao novoAviao = new Aviao(prefixoAviao,nomeAviao,modeloAviao,fabricanteAviao,assentosTotal);
                        Aviao.setAviao(novoAviao);
                        lacoAviao = JOptionPane.showConfirmDialog(null,"Deseja adicionar um novo avião?");
                    }
                    break;
                case 2:
                    while (lacoAeroporto == 0){
                        String codigoAeroporto = JOptionPane.showInputDialog("Informe o código do aeroporto"); 
                        String nomeAeroporto = JOptionPane.showInputDialog("Informe o nome do aeroporto");
                        Aeroporto novoAeroporto = new Aeroporto(codigoAeroporto,nomeAeroporto);
                        int internacional = JOptionPane.showConfirmDialog(null,"O aeroporto "+ novoAeroporto.getNome()+ " é internacional?");
                        novoAeroporto.setStatus(internacional);
                        novoAeroporto.setAeroportos(novoAeroporto);
                        lacoAeroporto = JOptionPane.showConfirmDialog(null,"Deseja adicionar um novo aeroporto?");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Lista de aeroportos : ");
                    for (int i = 0;i < Aeroporto.getListaAeroportos().size();i++){
                        System.out.println(i+" - "+Aeroporto.getAeroporto(i).getCodigo() + ":"+Aeroporto.getAeroporto(i).getNome());                      
                    }
                    int selecaoAeroporto = Integer.parseInt(JOptionPane.showInputDialog("Selecione o aeroporto"));
                    int opcaoAeroporto;
                    System.out.println("Aeroporto escolhido : " + Aeroporto.getAeroporto(selecaoAeroporto).getNome());
                    do{
                        int lacoVoo=0;
                        opcaoAeroporto = Integer.parseInt(JOptionPane.showInputDialog("0-Sair\n1-Verificar Internacionalidade\n2-Adicionar Avião ao pátio\n3-Adicionar Vôo\n4-Comparar Aeroportos\n5-Verificar Aviões no pátio\n6-Verificar vôos partindo\n7-Verificar vôos chegando"));
                        switch(opcaoAeroporto){
                            case 0:
                                break;
                            case 1:
                                if (Aeroporto.getAeroporto(selecaoAeroporto).getStatus() == true){
                                    JOptionPane.showMessageDialog(null,"O Aeroporto " + Aeroporto.getAeroporto(selecaoAeroporto).getNome() +  " é internacional.");
                                }else
                                    JOptionPane.showMessageDialog(null,"O Aeroporto " + Aeroporto.getAeroporto(selecaoAeroporto).getNome() +  " não é internacional.");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,"Lista de aviôes");
                                for (int i = 0 ;i < Aviao.getListaAvioes().size();i++){
                                    System.out.println(i+" - "+ Aviao.getAviao(i).getPrefixo() +  " " + Aviao.getAviao(i).getNome());
                                }
                                int selecaoAviao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o avião desejado"));
                                Aeroporto.getAeroporto(selecaoAeroporto).adicionarAviaoPatio(Aviao.getAviao(selecaoAviao));
                                JOptionPane.showMessageDialog(null,"Avião adicionado ao pátio.");
                                break;
                            case 3:                                
                                while (lacoVoo == 0){        
                                    JOptionPane.showMessageDialog(null,"Lista de aviôes no pátio");
                                    for (int i = 0 ;i < Aeroporto.getAeroporto(selecaoAeroporto).getAvioesPatio().size();i++){
                                        System.out.println(i+" - "+ Aeroporto.getAviaoPatio(i).getPrefixo() +  " " + Aeroporto.getAviaoPatio(i).getNome());
                                    }
                                    int selecaoAviaoPatio = Integer.parseInt(JOptionPane.showInputDialog("Selecione o avião para a viagem"));
                                    Aviao aviao = Aeroporto.getAeroporto(selecaoAeroporto).getAviaoPatio(selecaoAviaoPatio);
                                    System.out.println("Avião escolhido : " + Aeroporto.getAeroporto(selecaoAeroporto).getAviaoPatio(selecaoAviaoPatio).getNome());
                                    Aeroporto aeroportoSaida = Aeroporto.getAeroporto(selecaoAeroporto);
                                    JOptionPane.showMessageDialog(null,"Lista de aeroportos : ");
                                    for (int i = 0;i < Aeroporto.getListaAeroportos().size();i++){
                                        System.out.println(i+" - "+Aeroporto.getAeroporto(i).getCodigo() + ":"+Aeroporto.getAeroporto(i).getNome());                      
                                    }
                                    int selecaoAeroportoDestino = Integer.parseInt(JOptionPane.showInputDialog("Selecione o aeroporto de destino (Que não seja o que você está)"));
                                    Aeroporto aeroportoDestino = Aeroporto.getAeroporto(selecaoAeroportoDestino);
                                    System.out.println("Destino escolhido : " + Aeroporto.getAeroporto(selecaoAeroportoDestino).getNome());
                                    Voo novoVoo = new Voo(aviao,aeroportoSaida,aeroportoDestino);
                                    JOptionPane.showMessageDialog(null,"Vôo criado com sucesso.");
                                    Aeroporto.getAeroporto(selecaoAeroporto).setSaidaVoo(novoVoo);
                                    lacoVoo = JOptionPane.showConfirmDialog(null,"Deseja criar mais um vôo?");
                                }
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                for (int i = 0 ;i < Aeroporto.getAeroporto(selecaoAeroporto).getSaidaVoos().size();i++){
                                    System.out.println("Avião : " + Aeroporto.getAeroporto(selecaoAeroporto).getSaidaVoo(i).getAviao().getNome());
                                    System.out.println("Destino : " + Aeroporto.getAeroporto(selecaoAeroporto).getSaidaVoo(i).getDestino().getNome());
                                }
                        
                        
                        
                        
                        
                        }
                    
                    
                    
                    }while (opcaoAeroporto != 0);
                    break;
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
            
            
            
            
            
            
            
            
            
            
            
        }while (opcaoPrincipal != 0);
        
        
        
    }
    
}

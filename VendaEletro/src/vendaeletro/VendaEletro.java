
package vendaeletro;

import javax.swing.JOptionPane;


public class VendaEletro {

 
    public static void main(String[] args) {
        
        
        String MarcaCliente,MarcaFabrica,mesCompra;
        int VoltagemCliente,VoltagemFabrica,verificaQuantidade;
        double precoCliente,quantidadeProduto,capacidadeProduto,resultadoMedia;
        boolean verificaVoltagem,verificaMes;
        
        
        
        //SELECIONAR USUÁRIO
        
        int tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("1 - Cliente \n2 - Fábrica"));
        
        if (tipoUsuario == 1){
            //CLIENTE
            int selecionar= Integer.parseInt(JOptionPane.showInputDialog("Lista de produtos : \n1 - Liquidificador\n2 - Batedeira\n3 - Ferro de passar"));

            switch (selecionar){
                case 1://LIQUIDIFICADOR
                    MarcaCliente = JOptionPane.showInputDialog("Informe a marca do produto : ");
                    VoltagemCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem do produto : "));
                    precoCliente = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto : "));
                    Liquidificador novoLiquidificador = new Liquidificador(MarcaCliente,VoltagemCliente,precoCliente);
                    verificaVoltagem = novoLiquidificador.validaVoltagem(VoltagemCliente);
                    while (verificaVoltagem == false){
                        VoltagemCliente = Integer.parseInt(JOptionPane.showInputDialog("A voltagem do produto está inválida, por favor coloque a voltagem correta: "));
                        verificaVoltagem = novoLiquidificador.validaVoltagem(VoltagemCliente);
                    }
                    mesCompra =  JOptionPane.showInputDialog("Informe o mês da compra : ");
                    verificaMes = novoLiquidificador.verificaMes(mesCompra);
                    if (verificaMes == true ){
                        precoCliente = novoLiquidificador.mudaValor(precoCliente);
                        JOptionPane.showMessageDialog(null,"Desconto de 10% do dia dos pais, novo valor do produto : " + precoCliente + " reais.");
                    }
                    //CÁLCULO DÁ MÉDIA DE LITROS
                    verificaQuantidade  = JOptionPane.showConfirmDialog(null,"Deseja calcular a quantidade média de litros que podem ser batidos ?");
                    if (verificaQuantidade == 0 ){
                        quantidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em litros : "));
                        capacidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a capacidade em litros por segundo: "));
                        resultadoMedia = novoLiquidificador.calculaQuantidade(quantidadeProduto,capacidadeProduto);
                        JOptionPane.showMessageDialog(null,"A quantidade média de litros é  : " + resultadoMedia + " litros por segundo.");
                    }
                    
                    break;

                case 2://BATEDEIRA 
                    MarcaCliente = JOptionPane.showInputDialog("Informe a marca do produto : ");
                    VoltagemCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem do produto : "));
                    precoCliente = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto : "));
                    Batedeira novoBatedeira = new Batedeira(MarcaCliente,VoltagemCliente,precoCliente);
                    verificaVoltagem = novoBatedeira.validaVoltagem(VoltagemCliente);
                    while (verificaVoltagem == false){
                        VoltagemCliente = Integer.parseInt(JOptionPane.showInputDialog("A voltagem do produto está inválida, por favor coloque a voltagem correta: "));
                        verificaVoltagem = novoBatedeira.validaVoltagem(VoltagemCliente);
                    }
                    mesCompra =  JOptionPane.showInputDialog("Informe o mês da compra : ");
                    verificaMes = novoBatedeira.verificaMes(mesCompra);
                    if (verificaMes == true ){
                        double novoValor = novoBatedeira.mudaValor(precoCliente);
                        JOptionPane.showMessageDialog(null,"Desconto de 20% do natal, novo valor do produto : " + novoValor + " reais.");
                    }
                    
                    //CÁLCULO DA MÉDIA DE LITROS
                    verificaQuantidade  = JOptionPane.showConfirmDialog(null,"Deseja calcular a quantidade média de litros que podem ser batidos ?");
                    if (verificaQuantidade == 0 ){
                        quantidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em litros : "));
                        capacidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a capacidade em litros por segundo: "));
                        novoBatedeira.setHelices(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de helices: ")));
                        int qtdHelices = novoBatedeira.getHelices();
                        resultadoMedia = novoBatedeira.calculaQuantidade(quantidadeProduto,capacidadeProduto,qtdHelices);
                        JOptionPane.showMessageDialog(null,"A quantidade média de litros é  : " + resultadoMedia + " litros por segundo.");
                    }
                    
                    break;

                case 3://FERRO DE PASSAR
                    MarcaCliente = JOptionPane.showInputDialog("Informe a marca do produto : ");
                    VoltagemCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem do produto : "));
                    precoCliente = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto : "));
                    FerroPassar novoFerro = new FerroPassar(MarcaCliente,VoltagemCliente,precoCliente);
                    verificaVoltagem = novoFerro.validaVoltagem(VoltagemCliente);
                    while (verificaVoltagem == false){
                        VoltagemCliente = Integer.parseInt(JOptionPane.showInputDialog("A voltagem do produto está inválida, por favor coloque a voltagem correta: "));
                        verificaVoltagem = novoFerro.validaVoltagem(VoltagemCliente);
                    }
                    mesCompra =  JOptionPane.showInputDialog("Informe o mês da compra : ");
                    verificaMes = novoFerro.verificaMes(mesCompra);
                    if (verificaMes == true ){
                        double novoValor = novoFerro.mudaValor(precoCliente);
                        JOptionPane.showMessageDialog(null,"Desconto de 15% do dia das mães, novo valor do produto : " + novoValor + " reais.");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Número inválido.");
        }
        }else if (tipoUsuario == 2){
            //FÁBRICA
            int selecionar= Integer.parseInt(JOptionPane.showInputDialog("Lista de produtos : \n1 - Liquidificador\n2 - Batedeira\n3 - Ferro de passar"));

                switch (selecionar){
                    case 1://LIQUIDIFICADOR
                        MarcaFabrica = JOptionPane.showInputDialog("Informe a marca do produto : ");
                        VoltagemFabrica = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem do produto : "));
                        Liquidificador novoLiquidificador = new Liquidificador(MarcaFabrica,VoltagemFabrica);
                        verificaVoltagem = novoLiquidificador.validaVoltagem(VoltagemFabrica);
                        while (verificaVoltagem == false){
                            VoltagemFabrica = Integer.parseInt(JOptionPane.showInputDialog("A voltagem do produto está inválida, por favor coloque a voltagem correta: "));
                            verificaVoltagem = novoLiquidificador.validaVoltagem(VoltagemFabrica);
                        }
                        //CÁLCULO DÁ MÉDIA DE LITROS
                        verificaQuantidade  = JOptionPane.showConfirmDialog(null,"Deseja calcular a quantidade média de litros que podem ser batidos ?");
                        if (verificaQuantidade == 0 ){ 
                            quantidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em litros : "));
                            capacidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a capacidade em litros por segundo: "));
                            resultadoMedia = novoLiquidificador.calculaQuantidade(quantidadeProduto,capacidadeProduto);
                            JOptionPane.showMessageDialog(null,"A quantidade média de litros é  : " + resultadoMedia + " litros por segundo.");
                        }

                        break;

                    case 2://BATEDEIRA 
                        MarcaFabrica = JOptionPane.showInputDialog("Informe a marca do produto : ");
                        VoltagemFabrica = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem do produto : "));
                        Batedeira novoBatedeira = new Batedeira(MarcaFabrica,VoltagemFabrica);
                        verificaVoltagem = novoBatedeira.validaVoltagem(VoltagemFabrica);
                        while (verificaVoltagem == false){
                            VoltagemFabrica = Integer.parseInt(JOptionPane.showInputDialog("A voltagem do produto está inválida, por favor coloque a voltagem correta: "));
                            verificaVoltagem = novoBatedeira.validaVoltagem(VoltagemFabrica);
                        }
                        //CÁLCULO DA MÉDIA DE LITROS
                        verificaQuantidade  = JOptionPane.showConfirmDialog(null,"Deseja calcular a quantidade média de litros que podem ser batidos ?");
                        if (verificaQuantidade == 0 ){
                            quantidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade em litros : "));
                            capacidadeProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a capacidade em litros por segundo: "));
                            novoBatedeira.setHelices(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de helices: ")));
                            int qtdHelices = novoBatedeira.getHelices();
                            resultadoMedia = novoBatedeira.calculaQuantidade(quantidadeProduto,capacidadeProduto,qtdHelices);
                            JOptionPane.showMessageDialog(null,"A quantidade média de litros é  : " + resultadoMedia + " litros por segundo.");
                        }

                        break;

                    case 3://FERRO DE PASSAR
                        MarcaFabrica = JOptionPane.showInputDialog("Informe a marca do produto : ");
                        VoltagemFabrica = Integer.parseInt(JOptionPane.showInputDialog("Informe a voltagem do produto : "));
                        FerroPassar novoFerro = new FerroPassar(MarcaFabrica,VoltagemFabrica);
                        verificaVoltagem = novoFerro.validaVoltagem(VoltagemFabrica);
                        while (verificaVoltagem == false){
                            VoltagemFabrica = Integer.parseInt(JOptionPane.showInputDialog("A voltagem do produto está inválida, por favor coloque a voltagem correta: "));
                            verificaVoltagem = novoFerro.validaVoltagem(VoltagemFabrica);
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"Número inválido.");
            }
                
                
        }else{
            JOptionPane.showMessageDialog(null,"Número inválido.");
        } 
    }
}
    


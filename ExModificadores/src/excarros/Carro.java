/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excarros;

/**
 *
 * @author Gabriel
 */
public class Carro {
    private String cor,modelo;
    private double velocidadeAtual=0,velocidadeMaxima=200;
    
    public boolean  liga(){
        return true;
    }
    
    boolean acelera (double velocidade){
        if (this.velocidadeAtual + velocidade <= this.velocidadeMaxima){
            this.velocidadeAtual+=velocidade;
            return true;
        }else
            this.velocidadeAtual=this.velocidadeMaxima;
            return false;
    }
    
    public int pegaMarcha(){
        if (this.velocidadeAtual >=0 && this.velocidadeAtual<=20){
            return 1;
        }else if (this.velocidadeAtual > 20 && this.velocidadeAtual<=40){
            return 2;
        }else if (this.velocidadeAtual > 40 && this.velocidadeAtual<=70){
            return 3;
        }else if (this.velocidadeAtual > 70 && this.velocidadeAtual <=100){
            return 4;
        }else if (this.velocidadeAtual > 100){
            return 5;
        }else
            return 0;
    }
    
    
    public void setVelocidadeMaxima(int velocidade){
        this.velocidadeMaxima=velocidade;
    }
    
    public double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
}

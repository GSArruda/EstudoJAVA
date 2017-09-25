
package model;

public class Funcionario {
    protected String nome;
    protected String cargo;
    protected int cpf;
    protected int tempo;
    protected double salario;
    

    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getCargo() {
        return this.cargo;
    }
   
    public int getTempo() {
        return this.tempo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

package ex3;

import java.util.Set;

public class Funcionario {
    protected String nome;
    protected int rg;
    protected double totalVendas;

    public Funcionario (String nome, int rg, double totalVendas){
        this.nome = nome;
        this.rg = rg;
        this.totalVendas = totalVendas;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRg(int rg){
        this.rg = rg;
    }
    public void setTotalVendas(int totalVendas){
        this.totalVendas = totalVendas;
    }
    public String getNome(){
        return nome;
    }
    public int getRg(){
        return rg;
    }
    public double getTotalVendas(){
        return totalVendas;
    }

}

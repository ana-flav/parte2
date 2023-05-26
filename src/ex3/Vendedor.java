package ex3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, int rg, double totalVendas) {
        super(nome, rg, totalVendas);
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    public double getComissao(){
        return comissao;
    }
    private void valor_comissao(){
        double total_comissao = getTotalVendas()*0.05;
        setComissao(total_comissao);
    }
    public String toString(){
        valor_comissao();
        return "o valor da comissao da "+getNome()+" rg: " + getRg() + " a comissao é " + getComissao();
    }
}

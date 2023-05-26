package ex2;

public class Cliente {
    private String nome;
    private int totalDespesas;

    public Cliente(String nome, int totalDespesas){
        this.nome = nome;
        this.totalDespesas = totalDespesas;
    }

    public void setNome(String Nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTotalDespesas(int totalDespesas){
        this.totalDespesas = totalDespesas;
    }
    public int getTotalDespesas(){
        return totalDespesas;
    }

    private double gorjeta(){
        return (getTotalDespesas()*0.10)+getTotalDespesas();
    }

    public String toString(){
        return "o cliente " + getNome() + " deverá pagar de imposto de renda " + gorjeta();
    }
}

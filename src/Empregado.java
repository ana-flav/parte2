public class Empregado {
    private String nome;
    private int salario;

    public Empregado(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String Nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return salario;
    }

    public double imposto_de_renda(){
        return (getSalario()*0.05);
    }

    public String toString(){
        return "o funcionario " + getNome() + " deverá pagar de imposto de renda " + imposto_de_renda();
    }
}

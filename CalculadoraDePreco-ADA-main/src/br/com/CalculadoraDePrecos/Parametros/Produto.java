package br.com.CalculadoraDePrecos.Parametros;

public class Produto {

    private static int numId;

    private int id;
    private String nome;
    private double valor;

    private int proximoNumero(){
        return ++numId;
    }

    public Produto(String nome, double valor) {
        this.id = proximoNumero();
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

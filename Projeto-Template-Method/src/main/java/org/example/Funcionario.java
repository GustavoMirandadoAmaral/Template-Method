package org.example;

public abstract class Funcionario {

    private int id;
    private String nome;
    private float salarioBase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalarioHorasExtras() {
        return salarioHorasExtras;
    }

    public void setSalarioHorasExtras(float salarioHorasExtras) {
        this.salarioHorasExtras = salarioHorasExtras;
    }

    private float salarioHorasExtras;

    public float calcularSalarioTotal() {
        return this.salarioBase + this.salarioHorasExtras;
    }

    public abstract String calcularBonus();

    public String getTipo() {
        return "Funcionário";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "matrícula: " + this.id +
                ", nome: '" + this.nome + '\'' +
                ", resultado: " + this.calcularBonus() +
                '}';
    }
}

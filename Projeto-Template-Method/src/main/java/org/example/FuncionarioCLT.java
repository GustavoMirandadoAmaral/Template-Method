package org.example;

public class FuncionarioCLT extends Funcionario{

    public String calcularBonus() {
        float bonus = this.getSalarioBase() * 0.10f;
        if (bonus >= 500.0f) {
            return "Elegível - Bônus: R$ " + String.format("%.2f", bonus);
        }
        return "Não elegível - Bônus: R$ " + String.format("%.2f", bonus);
    }
}

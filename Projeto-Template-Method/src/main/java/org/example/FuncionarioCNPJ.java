package org.example;

public class FuncionarioCNPJ extends Funcionario{

    public String calcularBonus() {
        float bonus = this.calcularSalarioTotal() * 0.20f;
        if (bonus >= 1000.0f) {
            return "Elegível - Bônus: R$ " + String.format("%.2f", bonus);
        }
        return "Não elegível - Bônus: R$ " + String.format("%.2f", bonus);
    }
}

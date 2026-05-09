package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCNPJTest {

    @Test
    void deveRetornarElegivel() {
        FuncionarioCNPJ funcionario = new FuncionarioCNPJ();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setSalarioHorasExtras(0.0f);
        assertEquals("Elegível - Bônus: R$ 1000,00", funcionario.calcularBonus());
    }

    @Test
    void deveRetornarNaoElegivel() {
        FuncionarioCNPJ funcionario = new FuncionarioCNPJ();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setSalarioHorasExtras(0.0f);
        assertEquals("Não elegível - Bônus: R$ 600,00", funcionario.calcularBonus());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioCNPJ funcionario = new FuncionarioCNPJ();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setSalarioHorasExtras(0.0f);
        funcionario.setNome("Funcionário 1");
        funcionario.setId(2);
        assertEquals("Funcionário{matrícula: 2, nome: 'Funcionário 1', resultado: Elegível - Bônus: R$ 1000,00}", funcionario.getInfo());
    }
}
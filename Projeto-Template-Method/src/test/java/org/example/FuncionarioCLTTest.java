package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioCLTTest {

    @Test
    void deveRetornarElegivel() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(5000.0f);
        funcionario.setSalarioHorasExtras(0.0f);
        assertEquals("Elegível - Bônus: R$ 500,00", funcionario.calcularBonus());
    }

    @Test
    void deveRetornarNaoElegivel() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setSalarioHorasExtras(0.0f);
        assertEquals("Não elegível - Bônus: R$ 300,00", funcionario.calcularBonus());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioCLT funcionario = new FuncionarioCLT();
        funcionario.setSalarioBase(3000.0f);
        funcionario.setSalarioHorasExtras(0.0f);
        funcionario.setNome("Funcionário 1");
        funcionario.setId(1);
        assertEquals("Funcionário{matrícula: 1, nome: 'Funcionário 1', resultado: Não elegível - Bônus: R$ 300,00}", funcionario.getInfo());
    }
}
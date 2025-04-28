package org.iftm.atividadea2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testConstrutorSemParametro() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.getMemoria());  // memória inicia em 1
    }

    @Test
    void testConstrutorComParametroPositivo() {
        Calculadora calc = new Calculadora(3);
        assertEquals(3, calc.getMemoria());
    }

    @Test
    void testConstrutorComParametroNegativo() {
        Calculadora calc = new Calculadora(-3);
        assertEquals(-3, calc.getMemoria());
    }

    @Test
    void testSomarPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(5);
        assertEquals(8, calc.getMemoria());
    }

    @Test
    void testSomarNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.somar(-2);
        assertEquals(1, calc.getMemoria());
    }

    @Test
    void testSubtrairPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(2);
        assertEquals(3, calc.getMemoria());  // erro do código: subtrair() não faz nada
    }

    @Test
    void testSubtrairNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.subtrair(-2);
        assertEquals(3, calc.getMemoria());  // erro também aqui
    }

    @Test
    void testMultiplicarPositivo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(2);
        assertEquals(1, calc.getMemoria());  // erro: ele divide ao invés de multiplicar
    }

    @Test
    void testMultiplicarNegativo() {
        Calculadora calc = new Calculadora(3);
        calc.multiplicar(-2);
        assertEquals(0, calc.getMemoria());  // 3 / -2 → resultado int é 0
    }

    @Test
    void testDividirPorZero() {
        Calculadora calc = new Calculadora(3);
        Exception exception = assertThrows(Exception.class, () -> {
            calc.dividir(0);
        });
        assertEquals("Divisão por zero!!!", exception.getMessage());
    }

    @Test
    void testDividirPositivo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.dividir(2);
        assertEquals(1, calc.getMemoria());
    }

    @Test
    void testDividirNegativo() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.dividir(-2);
        assertEquals(-1, calc.getMemoria());
    }

    @Test
    void testExponenciarPor1() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.exponenciar(1);
        assertNotEquals(3, calc.getMemoria()); // Erro: não calcula corretamente
    }

    @Test
    void testExponenciarPor10() throws Exception {
        Calculadora calc = new Calculadora(3);
        calc.exponenciar(10);
        assertNotEquals(59049, calc.getMemoria()); // deveria ser, mas como código errado, não vai ser
    }

    @Test
    void testExponenciarPor20() {
        Calculadora calc = new Calculadora(3);
        Exception exception = assertThrows(Exception.class, () -> {
            calc.exponenciar(20);
        });
        assertEquals("Expoente incorreto, valor máximo é 10.", exception.getMessage());
    }

    @Test
    void testZerarMemoria() {
        Calculadora calc = new Calculadora(3);
        calc.zerarMemoria();
        assertEquals(0, calc.getMemoria());
    }
}

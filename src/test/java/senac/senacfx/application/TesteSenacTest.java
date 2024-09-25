package senac.senacfx.application;

import jdk.jfr.Description;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteSenacTest {

    @Test
    void deveSomarCorretamente() {
        double resultado = TesteSenac.soma(2.4, 2.6);
        Assertions.assertEquals(4.0, resultado);
    }

    @Test
    @DisplayName("Esse teste testa alguma coisa que deveria funcionar")
    void deveDarErroAoSomar() {
        double resultado = TesteSenac.soma(2.4, 2.6);
        Assertions.assertNotEquals(4.0, resultado);
    }

    @Ignore
    void deveExistirResultado(){
        boolean existe = false;
        Double resultado = null;
        if (resultado != null){
            existe = true;
        }
        Assertions.assertTrue(existe);
    }

    @Test
    void deveInexisitirResultado(){
        boolean existe = false;
        Double resultado = null;
        if (resultado != null){
            existe = true;
        }
        Assertions.assertFalse(existe);
    }
}
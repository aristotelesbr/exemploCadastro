package com.aristoteles;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PrimeiroTeste {

  @Test
  public void deveSomarDoisNumeros() {
    // 1-Cenário
    int numero1 = 10, numero2 = 5;

    // 2-Execução
    int resultado = numero1 + numero2;

    // 3-Veriricações
    Assertions.assertThat(resultado).isEqualTo(15);
  }
}

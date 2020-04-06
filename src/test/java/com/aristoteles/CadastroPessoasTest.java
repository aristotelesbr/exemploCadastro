package com.aristoteles;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoasTest {
  @Test
  public void DeveRetornarOCadastroDePessoa() {
    // CadastroPessoas cadastro = new CadastroPessoas();
    CadastroPessoas cadastro = new CadastroPessoas();

    Assertions.assertThat(cadastro.getPessoas()).isEmpty();
  }

  @Test
  public void DeveAdicionarUmaPessoa() {
    CadastroPessoas cadastroPessoas = new CadastroPessoas();
    Pessoa pessoa = new Pessoa();
    pessoa.setName("Wilson");
    cadastroPessoas.adicionar(pessoa);


    Assertions
      .assertThat(cadastroPessoas.getPessoas())
      .isNotEmpty()
      .hasSize(1)
      .contains(pessoa);
  }

  @Test(expected = PessoaSemNomeException.class)
  public void naoDeveAdicionarPessoaComNomeVazio() {
    CadastroPessoas cadastroPessoas = new CadastroPessoas();
    Pessoa pessoa = new Pessoa();

    cadastroPessoas.adicionar(pessoa);
  }

  @Test
  public void deveRemoverUmaPessoa() {
    CadastroPessoas cadastroPessoas = new CadastroPessoas();
    Pessoa pessoa = new Pessoa();
    pessoa.setName("Wilson");

    cadastroPessoas.adicionar(pessoa);
    cadastroPessoas.remover(pessoa);

    Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
  }

  @Test(expected = CadastroVazioException.class)
  public void deveRetornarErroAotentarRemoverPessoaInexistente() {
    CadastroPessoas cadastroPessoas = new CadastroPessoas();
    Pessoa pessoa = new Pessoa();

    cadastroPessoas.remover(pessoa);

  }
}

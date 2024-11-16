package models;

import contracts.Identificavel;

/**
 * Classe que representa um piloto no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código único do piloto, nome e data de admissão.
 */
public class Piloto implements Identificavel {
  private int codigo;
  private String nome;
  private String dataAdmissao;

  public Piloto(int codigo, String nome, String dataAdmissao) {
    this.codigo = codigo;
    this.nome = nome;
    this.dataAdmissao = dataAdmissao;
  }

  @Override
  public int getCodigo() {
    return codigo;
  }

  // Métodos getters e setters para os atributos
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataAdmissao() {
    return dataAdmissao;
  }

  public void setDataAdmissao(String dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
  }

  @Override
  public String toString() {
    return "Piloto: " + nome + ", Data de Admissão: " + dataAdmissao;
  }
}
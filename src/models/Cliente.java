package models;

import abstracts.Pessoa;

/**
 * Classe que representa um cliente no sistema.
 * Extende a classe Pessoa, herdando atributos e métodos comuns.
 * Além dos atributos herdados, possui um código único e um endereço.
 */
public class Cliente extends Pessoa {
  private int codigo;
  private String endereco;

  public Cliente(int codigo, String nome, String cpf, String endereco) {
    super(nome, cpf); // Chama o construtor da superclasse com nome e CPF
    this.codigo = codigo;
    this.endereco = endereco;
  }

  @Override
  public int getCodigo() {
    return codigo; // Implementação do método abstrato getCodigo()
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return super.toString() + ", Endereço: " + endereco;
  }
}
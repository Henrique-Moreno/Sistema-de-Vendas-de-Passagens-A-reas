package models;

import contracts.Identificavel;

/**
 * Classe que representa uma empresa aérea no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código e o nome da empresa.
 */
public class Empresa implements Identificavel {
  private int codigo;
  private String nome;

  public Empresa(int codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
  }

  @Override
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Empresa: " + nome;
  }
}
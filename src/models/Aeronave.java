package models;

import contracts.Identificavel;

/**
 * Classe que representa uma aeronave no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código, nome, capacidade e a empresa proprietária da aeronave.
 */
public class Aeronave implements Identificavel {
  private int codigo;
  private String nome;
  private int capacidade;
  private Empresa empresa;

  public Aeronave(int codigo, String nome, int capacidade, Empresa empresa) {
    this.codigo = codigo;
    this.nome = nome;
    this.capacidade = capacidade;
    this.empresa = empresa;
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

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  @Override
  public String toString() {
    return "Aeronave: " + nome + ", Capacidade: " + capacidade; // Representação em string da aeronave
  }
}
package models;

import contracts.Identificavel;

/**
 * Classe que representa uma passagem aérea no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código da passagem, assento reservado,
 * CPF e nome do passageiro, preço da passagem e voo associado.
 */
public class Passagem implements Identificavel {
  private int codigo;
  private String assento;
  private String cpfPassageiro;
  private String nomePassageiro;
  private double preco;
  private Voo voo;

  public Passagem(int codigo, String assento, String cpfPassageiro, String nomePassageiro, double preco, Voo voo) {
    this.codigo = codigo;
    this.assento = assento;
    this.cpfPassageiro = cpfPassageiro;
    this.nomePassageiro = nomePassageiro;
    this.preco = preco;
    this.voo = voo;
  }

  @Override
  public int getCodigo() {
    return codigo;
  }

  // Métodos getters e setters para os atributos
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getAssento() {
    return assento;
  }

  public void setAssento(String assento) {
    this.assento = assento;
  }

  public String getCpfPassageiro() {
    return cpfPassageiro;
  }

  public void setCpfPassageiro(String cpfPassageiro) {
    this.cpfPassageiro = cpfPassageiro;
  }

  public String getNomePassageiro() {
    return nomePassageiro;
  }

  public void setNomePassageiro(String nomePassageiro) {
    this.nomePassageiro = nomePassageiro;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Voo getVoo() {
    return voo;
  }

  public void setVoo(Voo voo) {
    this.voo = voo;
  }

  @Override
  public String toString() {
    return "Passagem: " + codigo + ", Assento: " + assento + ", Nome: " + nomePassageiro + ", Preço: R$" + preco;
  }
}
package models;

import contracts.Identificavel;

/**
 * Classe que representa um aeroporto no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código, nome, cidade, estado e país do aeroporto.
 */
public class Aeroporto implements Identificavel {
  private int codigo;
  private String nome;
  private String cidade;
  private String estado;
  private String pais;

  public Aeroporto(int codigo, String nome, String cidade, String estado, String pais) {
    this.codigo = codigo;
    this.nome = nome;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
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

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public String toString() {
    return "Aeroporto: " + nome + ", Cidade: " + cidade + ", Estado: " + estado + ", País: " + pais; // Representação em string do aeroporto
  }
}
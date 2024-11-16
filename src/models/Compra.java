package models;

import contracts.Identificavel;

/**
 * Classe que representa uma compra de passagem no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código da compra, a passagem adquirida,
 * o cliente que realizou a compra, o método de pagamento e o valor total da compra.
 */
public class Compra implements Identificavel {
  private int codigo;
  private Passagem passagem;
  private Cliente cliente;
  private String pagamento;
  private double valorTotal;

  public Compra(int codigo, Passagem passagem, Cliente cliente, String pagamento) {
    this.codigo = codigo;
    this.passagem = passagem;
    this.cliente = cliente;
    this.pagamento = pagamento;
    this.valorTotal = passagem.getPreco();
  }

  @Override
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public Passagem getPassagem() {
    return passagem;
  }

  public void setPassagem(Passagem passagem) {
    this.passagem = passagem;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public String getPagamento() {
    return pagamento;
  }

  public void setPagamento(String pagamento) {
    this.pagamento = pagamento;
  }

  public double getValorTotal() {
    return valorTotal; // Retorna o valor total da compra
  }

  @Override
  public String toString() {
    return "Compra: " + codigo + ", Cliente: " + cliente.getNome() + ", Valor Total: R$" + valorTotal; // Representação em string da compra
  }
}
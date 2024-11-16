package models;

import contracts.Identificavel;

/**
 * Classe que representa um voo no sistema de vendas de passagens aéreas.
 * Implementa a interface Identificavel, que exige a implementação do método getCodigo().
 * A classe contém informações sobre o código do voo, data/hora,
 * aeroportos de origem e destino, piloto e aeronave associada ao voo.
 */
public class Voo implements Identificavel {
  private int codigo;
  private String dataHora;
  private Aeroporto origem;
  private Aeroporto destino;
  private Piloto piloto;
  private Aeronave aeronave;

  public Voo(int codigo, String dataHora, Aeroporto origem, Aeroporto destino, Piloto piloto, Aeronave aeronave) {
    this.codigo = codigo;
    this.dataHora = dataHora;
    this.origem = origem;
    this.destino = destino;
    this.piloto = piloto;
    this.aeronave = aeronave;
  }

  @Override
  public int getCodigo() {
    return codigo;
  }

  // Métodos getters e setters para os atributos
  public void setCodigo(int codigo) {
    this.codigo = codigo;}

  public String getDataHora() {
    return dataHora;}

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;}

  public Aeroporto getOrigem() {
    return origem;}

  public void setOrigem(Aeroporto origem) {
    this.origem = origem;}

  public Aeroporto getDestino() {
    return destino;}

  public void setDestino(Aeroporto destino) {
    this.destino= destino;}

  public Piloto getPiloto() {
    return piloto;}

  public void setPiloto(Piloto piloto) {
    this.piloto= piloto;}

  public Aeronave getAeronave() {
    return aeronave;}

  public void setAeronave(Aeronave aeronave) {
    this.aeronave= aeronave;}

  @Override
  public String toString() {
    return "Voo: " +codigo+ ", Data/Hora: "+dataHora+ ", Origem: "+origem.getNome()+", Destino: "+destino.getNome();
  }
}
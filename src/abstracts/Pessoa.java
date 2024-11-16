package abstracts;

/**
 * Classe abstrata que representa uma pessoa no sistema.
 * Esta classe serve como base para outras classes que representam tipos específicos de pessoas,
 * como Cliente e Piloto. Contém atributos comuns, como nome e CPF, e um método abstrato
 * para obter o código da pessoa.
 */
public abstract class Pessoa {
  protected String nome;
  protected String cpf;  // CPF da pessoa (agora protegido para acesso nas subclasses)

  public Pessoa(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public abstract int getCodigo();

  @Override
  public String toString() {
    return "Nome: " + nome + ", CPF: " + cpf;
  }
}
package contracts;

/**
 * Esta interface define um contrato para classes que precisam fornecer um código único.
 * Qualquer classe que implementar esta interface deve fornecer uma implementação do método
 * getCodigo(), que retorna um valor inteiro representando o código da entidade,
 * para garantir que diferentes tipos de objetos, como Cliente,
 * Piloto, Aeronave, etc., possam ser tratados de maneira uniforme quando se trata de
 * identificação única dentro do sistema de vendas de passagens aéreas.
 */
public interface Identificavel {
  int getCodigo();
}
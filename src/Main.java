import models.*;

/**
 * Classe Main que serve como ponto de entrada para o sistema de vendas de passagens aéreas.
 * Este programa cria instâncias de várias entidades do sistema, como Aeroporto, Empresa,
 * Aeronave, Piloto, Voo, Passagem, Cliente e Compra. Ele exibe as informações dessas
 * entidades no console para verificar se foram criadas corretamente.
 *
 * O bloco try-catch é utilizado para capturar e tratar exceções que podem ocorrer durante
 * a execução do código. Se algum erro acontecer (por exemplo, ao criar objetos Aeroporto ou acessar
 * atributos), a exceção será capturada e uma mensagem de erro será exibida no console,
 * evitando que o programa falhe.
 */

public class Main {
  public static void main(String[] args) {
    try {
      // Criando um objeto Aeroporto representando um aeroporto em São Paulo
      Aeroporto aeroporto1 = new Aeroporto(1, "Aeroporto Internacional", "São Paulo", "SP", "Brasil");
      System.out.println(aeroporto1.toString());

      // Criando um objeto Aeroporto representando um aeroporto no Rio de Janeiro
      Aeroporto aeroporto2 = new Aeroporto(2, "Aeroporto Nacional", "Rio de Janeiro", "RJ", "Brasil");
      System.out.println(aeroporto2.toString());

      // Criando uma empresa aérea
      Empresa empresa1 = new Empresa(1, "Companhia Aérea Gol");
      System.out.println(empresa1.toString());

      // Criando uma aeronave associada à empresa criada
      Aeronave aeronave1 = new Aeronave(1, "Boeing 737", 180, empresa1);
      System.out.println(aeronave1.toString());

      // Criando um piloto com nome e data de admissão
      Piloto piloto1 = new Piloto(1, "João Silva", "2020-01-15");
      System.out.println(piloto1.toString());

      // Criando um voo com informações sobre origem, destino, piloto e aeronave
      Voo voo1 = new Voo(1, "2024-11-20T10:00", aeroporto1, aeroporto2, piloto1, aeronave1);
      System.out.println(voo1.toString());

      // Criando uma passagem para um passageiro específico (Maria Oliveira)
      Passagem passagem1 = new Passagem(1, "12A", "12345678901", "Maria Oliveira", 500.00, voo1);
      System.out.println(passagem1.toString());

      // Criando um cliente com informações pessoais
      Cliente cliente1 = new Cliente(1,"Carlos Pereira", "98765432100", "Rua das Flores");
      System.out.println(cliente1.toString());

      // Criando uma compra associando a passagem e o cliente com o método de pagamento
      Compra compra1 = new Compra(1, passagem1, cliente1,"Cartão de Crédito");

      // Exibindo as informações da compra
      System.out.println(compra1);

    } catch (Exception e) {
      System.out.println("Ocorreu um erro: " + e.getMessage());
    }
  }
}
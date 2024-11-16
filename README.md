# Sistema de Vendas de Passagens Aéreas 🛬

Este projeto é um sistema de vendas de passagens aéreas que permite gerenciar informações sobre aeroportos, voos, aeronaves, 
pilotos, clientes e compras. O sistema foi desenvolvido em Java e utiliza conceitos da Programação Orientada a Objetos.

## Conceitos Aplicados

### Classe Abstrata

- **Classe Pessoa**: Criamos uma classe abstrata chamada `Pessoa`, que serve como base para outras classes, como `Cliente` e `Piloto`. Essa classe contém atributos comuns, como `nome` e `cpf`, e um método abstrato `getCodigo()`, que deve ser implementado pelas subclasses. Isso garante que todas as subclasses tenham um código único.

### Interface

- **Interface Identificavel**: Implementamos uma interface chamada `Identificavel`, que define um contrato para classes que precisam fornecer um código único. Qualquer classe que implementar essa interface deve fornecer uma implementação do método `getCodigo()`. Isso permite tratar diferentes tipos de objetos de forma uniforme.

### Herança

- **Subclasses Cliente e Piloto**: As classes `Cliente` e `Piloto` herdam da classe abstrata `Pessoa`. Isso significa que elas reutilizam os atributos e métodos definidos na classe base, evitando duplicação de código. Cada subclasse pode adicionar seus próprios atributos específicos, como `endereco` em `Cliente` e `dataAdmissao` em `Piloto`.

### Métodos: Construtor e toString

- **Construtores**: Cada classe possui um construtor que inicializa seus atributos. Por exemplo, a classe `Aeronave` possui um construtor que aceita parâmetros para o código, nome, capacidade e empresa associada.
  
- **Método toString()**: Implementamos o método `toString()` em várias classes para fornecer uma representação em string dos objetos. Isso facilita a visualização das informações no console. Por exemplo, ao exibir informações sobre um cliente ou uma compra.

### Tratamento de Exceção (Try | Catch)

- **Bloco Try-Catch**: Utilizamos um bloco try-catch na classe principal (`Main`) para capturar e tratar exceções que podem ocorrer durante a execução do programa. Isso é importante para garantir que o sistema não falhe em caso de erros, como problemas ao criar objetos ou acessar dados. Se ocorrer um erro, uma mensagem será exibida no console.

## Como Executar o Projeto

1. Certifique-se de ter o Java instalado em sua máquina.
2. Clone este repositório ou faça o download dos arquivos.
3. Compile as classes Java usando um terminal ou IDE.
4. Execute a classe `Main` para iniciar o sistema.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

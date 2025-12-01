# ☕ Exercícios de Programação Orientada a Objetos em Java

Uma coleção de 20 exercícios progressivos para praticar os conceitos fundamentais de POO em Java, desde classes básicas até composição e polimorfismo.

## 🟢 Nível 1: Classes, Objetos e Atributos Básicos
*Foco: Criação de classes, instanciar objetos e métodos simples.*

- [ ] **1. Classe Pessoa:** Crie uma classe `Pessoa` com atributos `nome`, `idade` e `altura`. Crie um método que imprime uma apresentação (ex: "Olá, sou Carlos e tenho 25 anos").
- [ ] **2. Conta Bancária Simples:** Crie uma classe `ContaBancaria` com atributos `numeroConta` e `saldo`. Implemente métodos `depositar(valor)` e `sacar(valor)`. Não permita saques se o saldo for insuficiente.
- [ ] **3. Calculadora:** Crie uma classe `Calculadora` com métodos para somar, subtrair, multiplicar e dividir dois números.
- [ ] **4. Estoque de Produto:** Crie uma classe `Produto` com `nome`, `preco` e `quantidade`. Adicione métodos para `adicionarEstoque()` e `removerEstoque()`. Exiba o valor total do estoque desse produto.
- [ ] **5. Retângulo:** Crie uma classe `Retangulo` com atributos `largura` e `altura`. Crie métodos para calcular a área e o perímetro.

## 🟡 Nível 2: Encapsulamento e Construtores
*Foco: Modificadores de acesso (private), Getters/Setters e Construtores.*

- [ ] **6. Carro com Validação:** Crie uma classe `Carro` com atributos privados `marca`, `modelo` e `ano`. Crie um construtor para inicializar esses valores. No setter do ano, não permita valores menores que 1886.
- [ ] **7. Aluno e Notas:** Crie uma classe `Aluno` com `nome` e um array (ou lista) de notas. Use getters e setters. Crie um método privado `calcularMedia()` que é chamado por um método público `verificarAprovacao()` (aprovado se média >= 7).
- [ ] **8. Relógio Digital:** Crie uma classe `Relogio` com atributos `hora` e `minuto`. Os setters devem garantir que a hora seja 0-23 e minuto 0-59. Crie um método `tick()` que avança o tempo em um minuto.
- [ ] **9. Agenda Simples:** Crie uma classe `Contato` (nome, telefone). Crie uma classe `Agenda` que armazena 10 contatos (encapsulados) e permite adicionar e buscar por nome.

## 🟠 Nível 3: Herança e Polimorfismo
*Foco: `extends`, `super`, sobrescrita de métodos (`@Override`).*

- [ ] **10. Animais e Sons:** Crie uma superclasse `Animal` com método `emitirSom()`. Crie subclasses `Cachorro` ("Au Au") e `Gato` ("Miau"). Instancie ambos como `Animal` e chame o método.
- [ ] **11. Funcionários e Cargos:** Crie uma classe `Funcionario` com método `calcularSalario()`. Crie subclasses `Gerente` (salário + bônus) e `Estagiario` (salário base).
- [ ] **12. Formas Geométricas:** Crie uma classe `Forma` com método `calcularArea()`. Crie subclasses `Circulo` e `Quadrado` que sobrescrevem o método retornando a área correta.
- [ ] **13. Sistema de Pagamento:** Crie uma classe `Pagamento` com método `processar()`. Subclasses `PagamentoCartao` e `PagamentoBoleto` devem ter lógicas diferentes de processamento.
- [ ] **14. Veículos:** Crie uma classe `Veiculo` (marca, modelo). Subclasses `Moto` e `Carro`. A `Moto` tem um atributo extra `cilindradas` e o `Carro` tem `numeroDePortas`. Imprima os detalhes de cada um.

## 🔴 Nível 4: Abstração e Interfaces
*Foco: Classes abstratas (`abstract`) e Interfaces (`interface`).*

- [ ] **15. Sistema de Login (Interface):** Crie uma interface `Autenticavel` com o método `login(senha)`. Implemente-a nas classes `Usuario` e `Administrador` com lógicas de validação diferentes.
- [ ] **16. Dispositivos Eletrônicos:** Crie uma classe abstrata `Eletronico` com método abstrato `ligar()`. Implemente em `Televisao` e `Computador`.
- [ ] **17. Clube de Futebol:** Interface `Atleta` com métodos `aquecer()` e `jogar()`. Classes `JogadorFutebol` e `Nadador` implementam a interface.
- [ ] **18. Tributação (Interface):** Crie interface `Tributavel` com método `calcularImposto()`. Classes `Produto` e `Servico` implementam impostos diferentes (ICMS vs ISS).

## ⚫ Nível 5: Composição e Desafios
*Foco: Objetos dentro de objetos e lógica mais complexa.*

- [ ] **19. Pedido e Itens (Composição):** Crie classes `Produto`, `ItemPedido` (tem um Produto e quantidade) e `Pedido` (tem uma lista de ItemPedido). O `Pedido` deve calcular o valor total da nota fiscal.
- [ ] **20. Jogo de RPG Simplificado:**
  - Classes: `Personagem` (vida, ataque), `Arma` (dano).
  - O `Personagem` *tem uma* `Arma`.
  - Método `atacar(Personagem alvo)`: Subtrai a vida do alvo baseado no dano da arma + força do atacante.

---

### 🚀 Como contribuir
Sinta-se à vontade para fazer um fork deste repositório e submeter suas soluções!
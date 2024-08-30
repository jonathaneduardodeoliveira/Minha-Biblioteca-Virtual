
# Minha Biblioteca Virtual

## Descrição

O **Minha Biblioteca Virtual** é uma aplicação de gestão de biblioteca projetada para organizar, catalogar e gerenciar itens de uma coleção de livros, revistas e manuscritos. Este projeto é construído em Java e implementa conceitos de Programação Orientada a Objetos (POO) para fornecer uma estrutura flexível e extensível.

## Estrutura do Projeto

O projeto está dividido em várias camadas para separar as responsabilidades:

- **Modelos (`model`)**: Contém as classes que representam os itens do catálogo, como livros, revistas e manuscritos.
- **Serviços (`service`)**: Implementa a lógica de negócio da biblioteca, incluindo as operações de cadastro, consulta, reserva, aluguel e devolução de itens.
- **Repositório (`repository`)**: Responsável por armazenar e gerenciar os itens cadastrados na biblioteca.

## Classes Principais

### 1. `ItemCatalogo`
Classe abstrata que representa um item genérico no catálogo da biblioteca, contendo atributos como código, título e estado de reserva.

### 2. `Livro`, `Revista` e `Manuscrito`
Classes que estendem `ItemCatalogo` e representam tipos específicos de itens no catálogo.

### 3. `BibliotecaService`
Interface que define as operações básicas da biblioteca, como cadastrar, consultar, alugar e devolver itens.

### 4. `BibliotecaServiceFisica` e `BibliotecaServiceVirtual`
Interfaces que estendem `BibliotecaService`, separando as funcionalidades para bibliotecas físicas e virtuais, respectivamente.

### 5. `BibliotecaServiceImpl`
Classe abstrata que implementa a interface `BibliotecaService`, fornecendo uma base comum para as implementações físicas e virtuais.

### 6. `BibliotecaServiceFisicaImpl` e `BibliotecaServiceVirtualImpl`
Implementações concretas das interfaces de serviço para bibliotecas físicas e virtuais. Elas herdam a lógica comum de `BibliotecaServiceImpl` e adicionam funcionalidades específicas.

### 7. `BibliotecaRepositorio`
Interface para o repositório que gerencia os itens cadastrados.

### 8. `BibliotecaRepositorioListImpl`
Implementação do repositório utilizando uma lista para armazenar os itens.

### 9. `Main`
Classe principal que serve como ponto de entrada da aplicação. Aqui, você pode cadastrar novos itens no catálogo e consultar o estado atual da biblioteca.

## Funcionalidades

- **Cadastro de Itens**: Registre livros, revistas e manuscritos na biblioteca.
- **Consulta de Itens**: Pesquise itens cadastrados pelo título.
- **Aluguel e Devolução de Itens**: Realize o aluguel e a devolução de itens da biblioteca.
- **Reserva de Itens**: Reserve itens para futuros empréstimos.
- **Favoritar e Avaliar Itens**: (Em desenvolvimento) Funções adicionais para gerenciar itens favoritos e avaliações.

## Como Usar

1. Clone este repositório para o seu ambiente de desenvolvimento:
    git clone https://github.com/seu-usuario/minha-biblioteca-virtual.git
    ```

2. Importe o projeto no IntelliJ IDEA ou em outra IDE de sua preferência.

3. Compile e execute a aplicação a partir da classe `Main`.

4. Acompanhe as saídas no console para verificar o estado do catálogo da biblioteca após as operações de cadastro e consulta.
## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

---


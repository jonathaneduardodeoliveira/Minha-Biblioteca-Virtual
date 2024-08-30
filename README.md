
# Minha Biblioteca Virtual

## Descri��o

O **Minha Biblioteca Virtual** � uma aplica��o de gest�o de biblioteca projetada para organizar, catalogar e gerenciar itens de uma cole��o de livros, revistas e manuscritos. Este projeto � constru�do em Java e implementa conceitos de Programa��o Orientada a Objetos (POO) para fornecer uma estrutura flex�vel e extens�vel.

## Estrutura do Projeto

O projeto est� dividido em v�rias camadas para separar as responsabilidades:

- **Modelos (`model`)**: Cont�m as classes que representam os itens do cat�logo, como livros, revistas e manuscritos.
- **Servi�os (`service`)**: Implementa a l�gica de neg�cio da biblioteca, incluindo as opera��es de cadastro, consulta, reserva, aluguel e devolu��o de itens.
- **Reposit�rio (`repository`)**: Respons�vel por armazenar e gerenciar os itens cadastrados na biblioteca.

## Classes Principais

### 1. `ItemCatalogo`
Classe abstrata que representa um item gen�rico no cat�logo da biblioteca, contendo atributos como c�digo, t�tulo e estado de reserva.

### 2. `Livro`, `Revista` e `Manuscrito`
Classes que estendem `ItemCatalogo` e representam tipos espec�ficos de itens no cat�logo.

### 3. `BibliotecaService`
Interface que define as opera��es b�sicas da biblioteca, como cadastrar, consultar, alugar e devolver itens.

### 4. `BibliotecaServiceFisica` e `BibliotecaServiceVirtual`
Interfaces que estendem `BibliotecaService`, separando as funcionalidades para bibliotecas f�sicas e virtuais, respectivamente.

### 5. `BibliotecaServiceImpl`
Classe abstrata que implementa a interface `BibliotecaService`, fornecendo uma base comum para as implementa��es f�sicas e virtuais.

### 6. `BibliotecaServiceFisicaImpl` e `BibliotecaServiceVirtualImpl`
Implementa��es concretas das interfaces de servi�o para bibliotecas f�sicas e virtuais. Elas herdam a l�gica comum de `BibliotecaServiceImpl` e adicionam funcionalidades espec�ficas.

### 7. `BibliotecaRepositorio`
Interface para o reposit�rio que gerencia os itens cadastrados.

### 8. `BibliotecaRepositorioListImpl`
Implementa��o do reposit�rio utilizando uma lista para armazenar os itens.

### 9. `Main`
Classe principal que serve como ponto de entrada da aplica��o. Aqui, voc� pode cadastrar novos itens no cat�logo e consultar o estado atual da biblioteca.

## Funcionalidades

- **Cadastro de Itens**: Registre livros, revistas e manuscritos na biblioteca.
- **Consulta de Itens**: Pesquise itens cadastrados pelo t�tulo.
- **Aluguel e Devolu��o de Itens**: Realize o aluguel e a devolu��o de itens da biblioteca.
- **Reserva de Itens**: Reserve itens para futuros empr�stimos.
- **Favoritar e Avaliar Itens**: (Em desenvolvimento) Fun��es adicionais para gerenciar itens favoritos e avalia��es.

## Como Usar

1. Clone este reposit�rio para o seu ambiente de desenvolvimento:
    git clone https://github.com/seu-usuario/minha-biblioteca-virtual.git
    ```

2. Importe o projeto no IntelliJ IDEA ou em outra IDE de sua prefer�ncia.

3. Compile e execute a aplica��o a partir da classe `Main`.

4. Acompanhe as sa�das no console para verificar o estado do cat�logo da biblioteca ap�s as opera��es de cadastro e consulta.
## Licen�a

Este projeto � licenciado sob a [MIT License](LICENSE).

---


# Livraria-Simples 📚

Simula um sistema simples de livraria no terminal usando Java.

[![Stars](https://img.shields.io/github/stars/Nicolas-End/Livraria-Simples?style=social)](https://github.com/Nicolas-End/Livraria-Simples)\
[![Forks](https://img.shields.io/github/forks/Nicolas-End/Livraria-Simples?style=social)](https://github.com/Nicolas-End/Livraria-Simples)

## Table of Contents

-   [Descrição](#descrição)
-   [Funcionalidades](#funcionalidades)
-   [Tecnologias](#tecnologias)
-   [Como Usar](#como-usar)
-   [Estrutura do Projeto](#estrutura-do-projeto)
-   [Licença](#licença)
-   [Links Importantes](#links-importantes)
-   [Rodapé](#rodapé)

## Descrição 📖

Este projeto simula um sistema básico de gerenciamento de livraria
diretamente no terminal.\
Ele foi desenvolvido em Java e oferece funcionalidades para gerenciar
usuários e livros.\
Você pode adicionar usuários, visualizar detalhes e, em futuras versões,
gerenciar empréstimos e devoluções de livros.

## Funcionalidades ✨

Principais funcionalidades incluídas:

-   **Gerenciamento de Usuários**: Adicionar, visualizar e deletar
    usuários do sistema.
-   **Detalhes do Usuário**: Ver informações específicas como ID e nome.
-   **Empréstimo de Livros (Parcial)**: Funcionalidade existente para
    mostrar livros emprestados por um usuário.
-   **Interface por Menu**: Navegação simples e intuitiva feita pelo
    terminal.

## Tecnologias 💻

-   **Linguagem**: Java

## Como Usar 🚀

1.  **Pré-requisitos**

    -   Ter o Java Development Kit (JDK) instalado no seu sistema.

2.  **Compilação**

    -   Navegue até o diretório `src`.

    -   Compile os arquivos Java usando:

            javac Main.java Library/User.java Library/Book.java Library/LibraryProcesses.java

3.  **Execução**

    -   Execute a classe principal usando:

            java Main

4.  **Usando a aplicação**

    -   O terminal exibirá as seguintes opções:
        -   `1 - Usuários`: Gerenciar usuários.\
        -   `2 - Livros`: (Ainda não implementado).\
        -   `3 - Emprestar ou Devolver Livros`: (Ainda não
            implementado).\
        -   `4 - Sair`: Fechar o programa.\
    -   Siga as instruções exibidas no terminal.

## Estrutura do Projeto 📂

    Livraria-Simples/
    ├── .idea/                           # Arquivos do IntelliJ IDEA
    ├── src/                             # Código-fonte
    │   ├── Library/                     # Classes relacionadas à livraria
    │   │   ├── Book.java                # Classe Livro
    │   │   ├── LibraryProcesses.java    # Classe de gerenciamento da livraria
    │   │   └── User.java                # Classe Usuário
    │   └── Main.java                    # Classe principal
    ├── Biblioteca-Simples.iml           # Arquivo de módulo do IntelliJ
    └── README.md                        # Documentação do projeto


## Licença 📜

Este projeto não possui uma licença definida.

## Links Importantes 🔗

-   **Repositório**: https://github.com/Nicolas-End/Livraria-Simples

## Rodapé 📌

Feito com ❤️ por [Nicolas-End](https://github.com/Nicolas-End).
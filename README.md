# Sistema de Delivery de Padaria - Backend

Este é o backend do sistema de delivery de padaria Paddocca, desenvolvido com Spring Boot. Ele é responsável por gerenciar a lógica de negócios, comunicação com o banco de dados e a exposição de endpoints REST para a aplicação frontend.

## Funcionalidades

- Cadastro de novos produtos
- Atualização de produtos
- Deleção de produtos
- Paginação de produtos
- Cadastro de usuários
- Login de usuários

## Tecnologias Utilizadas

- **Java**: Linguagem de programação
- **Spring Boot**: Framework para construção de aplicações Java
- **Spring Data JPA**: Para persistência de dados
- **Spring Data Security**: Para criptografia de senha
- **Postgre Database**: Banco de dados para testes e desenvolvimento
- **Maven**: Gerenciamento de dependências e build

## Estrutura do Projeto

- **src/main/java/com/fatec/paddocca**: Contém os arquivos de código fonte
  - **controller**: Controladores REST
  - **model**: Modelos de entidade
  - **repository**: Repositórios
  - **service**: Serviços de negócios
- **src/main/resources**: Arquivos de configuração e recursos estáticos

## Requisitos

- **Java 17** ou superior
- **Maven** 3.6.3 ou superior

## Instalação e Execução

1. **Clone o repositório**

   ```bash
   git clone https://github.com/MoisesG01/Paddocca-api.git

2. **Importe a aplicação para a sua IDE**
- Importe como um projeto Maven existente
- Execute a aplicação

3. **Acesse a aplicação**
- A aplicação estará disponível em http://localhost:8080
  

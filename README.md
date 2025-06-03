# 📚 Book Service - Spring Boot CRUD API

Este projeto é uma aplicação backend RESTful desenvolvida em **Java 17** com **Spring Boot**, que oferece operações CRUD (Create, Read, Update, Delete) e atualização de status para um sistema de gerenciamento de livros.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5.0
- Spring Web
- Spring Data JPA
- Banco de dados em memória H2
- Maven

---

## Funcionalidades

- Criar livros
- Listar todos os livros
- Buscar livro por ID
- Atualizar dados do livro
- Excluir livro
- Atualizar o **status** do livro (por exemplo: "DISPONÍVEL", "EMPRESTADO")

---

## Como Executar o Projeto

### Pré-requisitos

- Java 17 ou superior
- Maven instalado e configurado no `PATH`

### Clonando o Projeto

```bash
git clone https://github.com/GustavoZanardi15/book-service.git
cd book-service


Compilando e rodando
mvn clean install
mvn spring-boot:run


Acessos úteis
Swagger (se configurado): http://localhost:8080/swagger-ui.html
Console H2: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Usuário: sa
Senha: (deixe em branco)


📂 Estrutura de Diretórios
src
├── main
│   ├── java
│   │   └── com.bookservice.book_service
│   │       ├── BookServiceApplication.java
│   │       ├── controller
│   │       │   └── BookController.java
│   │       ├── service
│   │       │   └── BookService.java
│   │       └── repository
│   │           └── BookRepository.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com.bookservice.book_service
            └── BookServiceApplicationTests.java



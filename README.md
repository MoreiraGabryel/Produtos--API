# 📦 Products API

API RESTful de gerenciamento de produtos desenvolvida com **Spring Boot**, criada com fins educacionais para praticar os fundamentos de uma aplicação backend com operações CRUD completas.

---

## 🚀 Tecnologias Utilizadas

- **Java** — Linguagem principal
- **Spring Boot** — Framework para criação da aplicação
- **Spring Web** — Para construção dos endpoints REST
- **Spring Data JPA** — Para abstração e acesso ao banco de dados
- **H2 / MySQL** — Banco de dados (rodando em ambiente local)
- **Postman** — Ferramenta utilizada para testes dos endpoints

---

## 📋 Funcionalidades

- ✅ Listar todos os produtos
- ✅ Buscar produto por ID
- ✅ Criar novo produto
- ✅ Atualizar produto existente
- ✅ Deletar produto

---

## 🔗 Endpoints

Base URL: `http://localhost:8080`

| Método | Rota | Descrição |
|--------|------|-----------|
| `GET` | `/products` | Retorna todos os produtos |
| `GET` | `/products/{id}` | Retorna um produto pelo ID |
| `POST` | `/products` | Cria um novo produto |
| `PUT` | `/products/{id}` | Atualiza um produto existente |
| `DELETE` | `/products/{id}` | Remove um produto |

---

## 🗂️ Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/Moreira.produtos
            ├── controller/
            │   └── ProdutoController.java
            ├── model/
            │   └── Produto.java
            ├── repository/
            │   └── ProdutoRepository.java
            └── ProductsApplication.java
```

---

## ⚙️ Como Executar Localmente

**Pré-requisitos:** Java 17+ e Maven instalados.

```bash
# Clone o repositório
git clone https://github.com/MoreiraGabryel/Produtos--API.git

# Acesse a pasta do projeto
cd seu-repositorio

# Execute a aplicação
./mvnw spring-boot:run
```

A aplicação ficará disponível em: `http://localhost:8080`

---

## 🧪 Testes

Todos os endpoints foram testados manualmente via **Postman**, validando os cenários de sucesso e as respostas HTTP esperadas (`200 OK`, `201 Created`, `204 No Content`, `404 Not Found`).

---

## 🔭 Próximos Passos

Este projeto foi desenvolvido como base de estudos. Melhorias planejadas para versões futuras (em branch separada):

- [ ] Validações com Bean Validation (`@NotNull`, `@NotBlank`, etc.)
- [ ] Tratamento global de exceções com `@ControllerAdvice`
- [ ] Paginação e ordenação nos resultados
- [ ] Integração com banco de dados relacional (MySQL/PostgreSQL)
- [ ] Documentação automática com Swagger / OpenAPI
- [ ] Testes unitários e de integração com JUnit e Mockito

---

## 👨‍💻 Autor: MoreiraGabryel

Desenvolvido para fins de estudo e aprendizado em desenvolvimento backend com Spring Boot.

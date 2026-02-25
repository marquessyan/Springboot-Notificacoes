# Springboot Notificações
API Springboot Sistema de Notificações Multi-Canal que utiliza de padrões de projeto Strategy e Factory, 

---
# Notification Strategy API 🚀

Este projeto é uma API de notificações multi-canal desenvolvida em **Java 17** com **Spring Boot 4.0.3**. O objetivo principal é demonstrar a implementação prática de padrões de projeto (**Design Patterns**) para criar um sistema extensível, de baixo acoplamento e fácil manutenção.

## 🛠️ Tecnologias e Conceitos

* **Java 17** (Uso de Records e Sealed Classes)
* **Spring Boot 4.0.3**
* **Spring Data JPA** (Persistência de histórico)
* **H2 Database** (Banco em memória para testes rápidos)
* **Maven** (Gerenciador de dependências)

## 🏗️ Padrões de Projeto Implementados

### 1. Strategy Pattern

Utilizado para desacoplar a lógica de envio de cada canal (Email, SMS, Push). Cada canal possui sua própria implementação da interface `NotificationStrategy`, permitindo que o sistema cresça sem a necessidade de múltiplos blocos `if/else`.

### 2. Factory Pattern (Spring-Managed)

A `NotificationFactory` utiliza a injeção de dependências do Spring para mapear automaticamente todas as estratégias disponíveis. Isso torna a adição de um novo canal tão simples quanto criar uma nova classe anotada com `@Component`.

### 3. Data Transfer Object (DTO) com Lombok

Implementação de contratos de entrada utilizando **Lombok**, garantindo validação de dados no momento da construção do objeto.

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/marquessyan/Springboot-Notificacoes.git

```


2. **Execute a aplicação:**
```bash
./mvnw spring-boot:run

```


3. **Acesse o Console do Banco de Dados (H2):**
   URL: `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:notifdb`
* **User:** `sa`
* **Password:** `123`



---

## 📑 Documentação da API

### Enviar Notificação

**Endpoint:** `POST /notifications/send`

**Exemplo de Payload:**

```json
{
    "destination": "dev@exemplo.com",
    "message": "Sua conta foi ativada com sucesso!",
    "type": "EMAIL"
}

```

**Respostas:**

* `200 OK`: Notificação processada com sucesso.
* `400 Bad Request`: Dados inválidos ou tipo de notificação não suportado.

---

## 📈 Evoluções Futuras

* [ ] Implementar **Spring Events (Observer Pattern)** para processamento assíncrono.
* [ ] Adicionar **Resilience4j** para Retry em caso de falha nos provedores externos.
* [ ] Integração real com APIs de terceiros (Twilio para SMS, SendGrid para Email).

---

## 👨‍💻 Autor

Desenvolvido por **Yan Marques** – [LinkedIn](https://www.linkedin.com/in/yan-marques-soares-1b4127334/)


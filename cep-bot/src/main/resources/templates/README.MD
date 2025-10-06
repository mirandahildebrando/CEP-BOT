# 🏙️ Bot de Consulta de CEPs

Aplicação em **Java 17 + Spring Boot + H2 Database** que automatiza a leitura de CEPs de um arquivo `.txt`, consulta a **API ViaCEP** e armazena as informações completas no banco de dados em memória.

---

## 🚀 Tecnologias

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* H2 Database
* Swagger (Springdoc OpenAPI)

---

## ⚙️ Funcionalidades

* Lê automaticamente os CEPs listados em `src/main/resources/ceps.txt`
* Consulta cada CEP na API pública [ViaCEP](https://viacep.com.br)
* Salva os dados (logradouro, bairro, cidade, UF) no banco H2
* Permite visualizar e testar o endpoint via **Swagger UI**

---

## 🧩 Endpoints

| Método | Endpoint          | Descrição                                              |
| ------ | ----------------- | ------------------------------------------------------ |
| GET    | `/consultar-ceps` | Lê os CEPs do arquivo, consulta a API e salva no banco |

---

## 🗂️ Estrutura do projeto

```
src/
 ├─ main/java/com/hildebrando/cepbot/
 │   ├─ CepBotApplication.java
 │   ├─ controller/CepController.java
 │   ├─ service/CepService.java
 │   ├─ model/CepInfo.java
 │   ├─ model/CepResponse.java
 │   └─ repository/CepRepository.java
 └─ main/resources/
     ├─ ceps.txt
     └─ application.properties
```

---

## 🧠 Como executar

1. Clone o repositório

   ```bash
   git clone https://github.com/seuusuario/cep-bot.git
   cd cep-bot
   ```

2. Execute com Maven

   ```bash
   mvn spring-boot:run
   ```

3. Acesse no navegador:

   ```
   http://localhost:8080/consultar-ceps
   ```

4. Para ver a documentação interativa:

   ```
   http://localhost:8080/swagger-ui.html
   ```

---

## 💾 Banco de dados H2

Para acessar o console H2:

```
http://localhost:8080/h2-console
```

**JDBC URL:** jdbc:h2:mem:testdb
**Usuário:** sa
**Senha:** *(deixe em branco)*

---

## 👨‍💻 Autor

**Hildebrando Vanique Miranda**
Desenvolvedor Java Backend
[LinkedIn](https://linkedin.com/in/hildebrando-vanique-miranda-12359b12b) · [GitHub](https://github.com/mirandahildebrando)

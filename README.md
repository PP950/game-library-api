# 🎮 Game Library API

API REST para gerenciar uma biblioteca de jogos, permitindo cadastro, listagem e filtragem por status.

---

## 🚀 Tecnologias

* Java 21
* Spring Boot
* Spring Data JPA
* H2 Database
* Docker

---

## 📌 Funcionalidades

* ✅ Criar jogo
* ✅ Listar todos os jogos
* ✅ Filtrar jogos por status (BACKLOG, JOGANDO, ZERADO, PLATINADO)

---

## 📦 Estrutura do Projeto

* **Controller** → expõe os endpoints
* **Service** → regras de negócio
* **Repository** → acesso ao banco
* **Model** → entidades e enums

---

## ▶️ Como rodar (sem Docker)

```bash
# build
./mvnw.cmd clean package

# executar
java -jar target/game-library-0.0.1-SNAPSHOT.jar
```

Acesse:

```
http://localhost:8080/games
```

---

## 🐳 Como rodar com Docker

```bash
# build da imagem
docker build -t game-library .

# rodar container
docker run -p 8080:8080 game-library
```

Acesse:

```
http://localhost:8080/games
```

---

## 🔎 Exemplos de uso

### Criar jogo (POST)

```
POST /games
```

```json
{
  "titulo": "The Witcher 3",
  "genero": "RPG",
  "status": "JOGANDO",
  "nota": 10
}
```

---

### Listar todos (GET)

```
GET /games
```

---

### Filtrar por status

```
GET /games/status/JOGANDO
```

---

## 🧠 Melhorias futuras

* [ ] Banco de dados real (MySQL/PostgreSQL)
* [ ] Docker Compose
* [ ] Deploy em cloud
* [ ] Validação de dados
* [ ] CRUD completo (update/delete)

---

## 👨‍💻 Autor

Projeto desenvolvido para aprendizado e evolução em backend com Java e Docker.

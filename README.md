# DSList

O **DSList** é um projeto desenvolvido em Java com Spring Boot que permite gerenciar uma lista de jogos digitais. O sistema fornece funcionalidades para listar, buscar, organizar e detalhar jogos, permitindo que usuários acompanhem seus games favoritos de forma prática.

---

## 🔹 Funcionalidades
- Listagem de jogos com informações detalhadas
- Busca e filtragem de jogos
- Ordenação por diferentes critérios
- Exibição de detalhes de cada jogo
- Backend estruturado com boas práticas de desenvolvimento

---

## 🛠 Tecnologias Utilizadas
- **Java 17** – Linguagem de programação principal
- **Spring Boot** – Framework para desenvolvimento web e APIs
- **Spring Data JPA** – Para integração com banco de dados
- **H2 Database** – Banco de dados em memória para testes
- **Maven** – Gerenciamento de dependências
- **Git e GitHub** – Controle de versão

---

## 📂 Estrutura do Projeto
- `src/main/java` → Contém todos os pacotes e classes do backend
  - `controller/` → Classes que gerenciam rotas e endpoints
  - `model/` → Classes de domínio (representação de entidades)
  - `repository/` → Interfaces para comunicação com o banco de dados
  - `service/` → Lógica de negócio e regras do sistema
- `src/main/resources` → Configurações, arquivos SQL e dados iniciais
- `application.properties` → Configuração do Spring Boot e banco de dados

---

## ▶ Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/GabrielMuraro04/DSList.git

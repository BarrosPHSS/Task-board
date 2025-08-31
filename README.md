# Task Board em Java

Este projeto é um **board de tarefas simples** feito em Java puro, para gerenciamento básico de tarefas no estilo Kanban, rodando no console.

---

## Funcionalidades

- Criar tarefas com título e descrição.
- Atribuir status às tarefas: `TODO`, `IN_PROGRESS`, `DONE`.
- Mover tarefas entre os status.
- Listar todas as tarefas organizadas por status.

---

## Estrutura do projeto

task-board/
├── pom.xml
└── src/
└── main/
└── java/
└── com/
└── seuusuario/
└── taskboard/
├── Main.java
├── Task.java
├── TaskBoard.java
└── TaskStatus.java


---

## Como rodar

### Pré-requisitos

- Java 17 instalado
- Maven instalado

### Passos

1. Clone ou baixe este repositório.

2. No terminal, navegue até a raiz do projeto (onde está o `pom.xml`).

3. Compile o projeto:

```bash
mvn clean compile
 
mvn exec:java

Uso

 - Ao rodar, você verá um menu simples no console para:

 - Adicionar tarefa

 - Mover tarefa entre status

 - Mostrar o board com as tarefas organizadas

 - Sair do programa

------

Sobre o projeto

Este é um exemplo prático para aprender a organizar código Java com pacotes, usar enums, listas e interação via console.

-------

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

-------

Autor

Seu BarrosPHSS - https://github.com/BarrosPHSS
## Iniciando os estudos em Java

Este repositório documenta meu processo de aprendizado da linguagem **Java**, com base no livro  
**“Java: Como Programar” – Deitel (8ª edição)**.

Os exemplos aqui presentes representam a evolução prática dos conceitos estudados, com commits frequentes para registrar o progresso e praticar boas práticas com **Git e GitHub**.

---

### Módulo 3 – Classes, Objetos e Arrays Multidimensionais

Este projeto implementa a classe `GradeBook`, responsável por gerenciar e analisar **notas de alunos**, agora utilizando **arrays multidimensionais**, conforme apresentado no livro (aprox. página 238).

Cada aluno possui **mais de uma nota**, permitindo o cálculo de estatísticas individuais e gerais da turma.

---

### Estrutura do Projeto

- `GradeBook.java`  
  Classe de domínio que encapsula:
  - o nome do curso
  - as notas dos alunos em um **array bidimensional**
  - a lógica de processamento e exibição dos dados

- `GradeBookTest.java`  
  Classe de teste responsável por instanciar o objeto `GradeBook` e executar o processamento.

---

### Funcionalidades Implementadas

- Armazenamento do **nome do curso**
- Armazenamento das **notas dos alunos em um array bidimensional (`int[][]`)**
- Exibição das notas organizadas por **aluno e prova**
- Cálculo da **média individual de cada aluno**
- Identificação da **menor nota da turma**
- Identificação da **maior nota da turma**
- Geração de um **gráfico de barras em texto** (distribuição das notas)
- Separação clara entre **classe de domínio** e **classe de teste**

---

### Conceitos Praticados até o Momento

- Criação de **classes e objetos**
- Uso de **construtores com múltiplos parâmetros**
- **Encapsulamento** (`private`, getters e setters)
- Uso de **arrays unidimensionais e multidimensionais**
- Laços de repetição:
  - `for`
  - `for-each`
- Processamento de estruturas bidimensionais
- Cálculo de médias individuais
- Cálculo de valores **mínimo e máximo**
- Formatação de saída com `System.out.printf`
- Geração de relatórios tabulares no console
- Introdução à **visualização de dados em modo texto** (histograma)

---

📌 Este repositório continuará sendo atualizado conforme o avanço no livro e a introdução de novos conceitos da linguagem Java.

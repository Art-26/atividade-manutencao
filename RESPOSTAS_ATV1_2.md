# ATIVIDADE 1

## LISTAR 10 PROBLEMAS (5 RESOLVIDOS):

1. Método startCli (RESOLVIDO).
    - O método apresentava muitos If's e Else's, o que acaba dificultando a leitura e a manutenção futura do código. Code Smell: (Mixed Responsibilities).

2. Método handleRegisterBook (RESOLVIDO).
    - O método apresentava uma duplicação das regras que já estavam apresentadas lá na classe do BookManager. Code Smell: (Duplicated Code).

3. 

4. 

5. 

6. Método handleDebugArea
    - O método apresenta o mesmo problema visto no startCli, com uma grande presença de If's e Else's que dificultam a leitura para outros desenvolvedores.

7. 

8. 

9. 

10. 

---
# ATIVIDADE 2
1. Bug 1
2. Bug 2
3. Bug 3
4. Implementado a funcionalidade de exibir histórico de empréstimos por um usuário específico


### impactos e riscos conhecidos
- Um dos riscos desse sistema, é que sem a refatoração e sem o concerto necessário para os bugs, podemos ter um impacto direto na performance do sistema como um todo, no caso, no momento estamos lidando com cerca de uns 5 usuários, uns 3 livros e tudo mais, mas e como será o impacto no sistema se tivermos 100.000 usuários? 500.000 livros? Ainda mais que temos o LegacyDatabase, que não é um banco de dados bem simples e temporário, logo, todos esses pontos influenciam em como será a vida útil do sistema como um todo. 

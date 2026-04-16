# ATIVIDADE 1

## LISTAR 10 PROBLEMAS (5 RESOLVIDOS):

1. Método startCli (RESOLVIDO).
    - O método apresentava muitos If's e Else's, o que acaba dificultando a leitura e a manutenção futura do código. Code Smell: (Mixed Responsibilities).

2. Método handleRegisterBook (RESOLVIDO).
    - O método apresentava uma duplicação das regras que já estavam apresentadas lá na classe do BookManager. Code Smell: (Duplicated Code).

3. Método borrowBook (RESOLVIDO).
    - O método apresentava múltiplos ifs encadeados para validações e assinaturas com 8 parâmetros primitivos aumentando o risco de chamadas incorretas e dificultava a leitura. Code Smell: (Deep Nesting) (Long Parameter List).

4. Método registerBook (RESOLVIDO).
    - O código foi refatorado para separar a validação em um método próprio, melhorar a legibilidade usando variáveis finais e operador ternário, e evitar alterar os parâmetros originais. Também corrigiu um bug onde título vazio era salvo e melhorou o tratamento de erros mantendo a causa da exceção. No geral, ficou mais limpo, seguro e fácil de manter. Code Smell:(Long Method).

5. Método registerUser (RESOLVIDO).
    - O código apresentava uma sequência grande de If's e Else's, além disso, o code smell presente no trecho era o Long Parameter Method, a resolução foi a criação de um parameter object de nome UserDTO, sendo organizada internamente com Extract Method, de modo à separar as responsabilidades presentes no código.

6. Gets na classe LibrarySystem
    - Os gets presentes na classe do LibrarySystem estão quebrando o encapsulamento de maneira intencional, sendo necessário refatoração futura.

7. Método handleDebugArea
    - O método apresenta o mesmo problema visto no startCli, com uma grande presença de If's e Else's que dificultam a leitura para outros desenvolvedores.

8. Métodos borrowFromConsole e returnFromConsole
    - A classe, que deveria ser responsável apenas pela lógica de negócio de empréstimos, contém métodos que lidam diretamente com a entrada de dados do usuário via console (Scanner e System.out). Code Smell: (Mixed Concerns).


9. Método  generateSimpleReport
    - O método generateSimpleReport acaba combinando a formatação, o acesso aos dados e também as regras de negócio, tudo em um método só, indicando refatoração futura.

10. Método datePlusDaysApprox
    - O método datePlusDaysApprox não realiza nenhum cálculo matemático ou lógico de data, e em vez disso, ele apenas concatena as Strings, sendo um método meio inútil, sendo necessário refatoração futura.

---
# ATIVIDADE 2
1. Bug 1 (RESOLVIDO).
    - Na linha 105 do LoanManager.java, o código tem um sinal de menos (-) que subtrai a multa do usuário ao invés de somar. Code Smell: (Inconsistent State Update).

2. Bug 2 no método registerBook (title blank) (RESOLVIDO).
    - Após a realização dos testes, constatou-se que a versão anterior do código permitia a continuidade das operações mesmo na ausência de preenchimento de campos obrigatórios, como o título, realizando o salvamento de forma indevida. Com a devida refatoração e correção do bug, o sistema passou a validar corretamente esses dados, retornando erro quando o título não é informado, garantindo maior integridade e consistência das informações.

3. Bug 3 no método countOpenLoansByBook (RESOLVIDO)
    - No método countOpenLoansByBook foi corrigido o bug trocando o campo de comparação de 'userId' para 'bookId', pois antes ele verificava incorretamente o userId contra o bookId recebido.

4. Implementado a funcionalidade de exibir histórico de empréstimos por um usuário específico


### impactos e riscos conhecidos
- Um dos riscos desse sistema, é que sem a refatoração e sem o concerto necessário para os bugs, podemos ter um impacto direto na performance do sistema como um todo, no caso, no momento estamos lidando com cerca de uns 5 usuários, uns 3 livros e tudo mais, mas e como será o impacto no sistema se tivermos 100.000 usuários? 500.000 livros? Ainda mais que temos o LegacyDatabase, que não é um banco de dados bem simples e temporário, logo, todos esses pontos influenciam em como será a vida útil do sistema como um todo. 

### Link para o vídeo



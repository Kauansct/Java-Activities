# Java-Activities

## Objetivo
Este projeto contém várias implementações de funcionalidades simples em Java, incluindo:
- Calculadora básica
- Verificação de palíndromos
- Geração de sequência de Fibonacci
- Inversão de números inteiros
- Verificação de anagramas
- Contador de palavras em uma frase

O objetivo principal é consolidar conhecimentos básicos em Java, utilizando estruturas como `Scanner`, coleções (`ArrayList`, `HashMap`) e laços de repetição.

---

## Funcionalidades
1. **Calculadora**: Realiza operações básicas (+, -, *, /) entre dois números fornecidos pelo usuário.
2. **Palíndromo**: Verifica se uma palavra é um palíndromo (ou seja, se ela é igual ao seu reverso).
3. **Fibonacci**: Gera e exibe os primeiros números da sequência de Fibonacci.
4. **Inversão de Números**: Inverte os dígitos de um número inteiro fornecido pelo usuário.
5. **Anagramas**: Verifica se duas palavras são anagramas.
6. **Contador de Palavras**: Conta o número de palavras em uma frase fornecida pelo usuário.

---

## Como Rodar o Programa

### Pré-requisitos
- Java Development Kit (JDK) instalado na máquina (versão 8 ou superior).
- Um editor de texto ou IDE (como VS Code, IntelliJ IDEA ou Eclipse).

### Passos para executar
1. **Clone o repositório ou copie o código para um arquivo `.java`**:
   - Salve o arquivo como `Main.java`.

2. **Compile o programa**:
   Abra o terminal na pasta onde está o arquivo e execute o comando:
   ```bash
   javac Main.java
   ```

3. **Execute o programa**:
   Após a compilação, execute o seguinte comando no terminal:
   ```bash
   java Main
   ```

4. **Escolha a funcionalidade desejada**:
   Por padrão, o programa está configurado para executar o método `wordCounter`. Para testar outra funcionalidade, altere a chamada no método `main` no arquivo `Main.java`. Por exemplo:
   ```java
   public static void main(String[] args) {
       palindrome(); // Chama a funcionalidade de verificação de palíndromo
   }
   ```

5. **Repita ou finalize**:
   Cada funcionalidade oferece opções para repetir a execução ou finalizar o programa.

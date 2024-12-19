import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    // Metodo para implementar uma calculadora simples
    static void calculator() {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        do {
            // Entrada dos números e do operador
            System.out.print("Digite o primeiro número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            System.out.print("Digite um operador aritmético (+, -, *, /): ");
            String option1 = sc.next();

            // Executa a operação baseada no operador informado
            switch (option1.trim()) {
                case "+":
                    System.out.println("A soma dos números " + num1 + " e " + num2 + " é " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("A subtração dos números " + num1 + " e " + num2 + " é " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("A multiplicação dos números " + num1 + " e " + num2 + " é " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) { // Verifica divisão por zero
                        System.out.println("A divisão dos números " + num1 + " e " + num2 + " é " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operador inválido. Tente novamente.");
                    continue;
            }

            // Opção para reiniciar ou finalizar o sistema
            System.out.print("Deseja realizar outro cálculo? (s/n): ");
            String option2 = sc.next().trim();

            if (option2.equalsIgnoreCase("s")) {
                System.out.println("Reiniciando cálculo...");
            } else if (option2.equalsIgnoreCase("n")) {
                System.out.println("Finalizando sistema...");
                isRunning = false;
            } else {
                System.out.println("Entrada inválida. Finalizando sistema por segurança...");
                isRunning = false;
            }
        } while (isRunning);
    }

    // Metodo para verificar se uma palavra é um palíndromo
    static void palindrome() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> reverseLetters = new ArrayList<>();
        boolean isRunning = true;

        do {
            // Entrada da palavra
            System.out.print("Digite uma palavra: ");
            String word = sc.next().toLowerCase().trim();

            // Preenche a lista com os caracteres da palavra
            for (int i = 0; i < word.length(); i++) {
                letters.add(word.charAt(i));
            }

            // Preenche outra lista com os caracteres e os inverte
            for (int i = 0; i < word.length(); i++) {
                reverseLetters.add(word.charAt(i));
            }
            Collections.reverse(reverseLetters);

            // Compara a palavra original com sua versão invertida
            if (letters.equals(reverseLetters)) {
                System.out.println("A palavra " + word + " é um palíndromo");
            } else {
                System.out.println("A palavra " + word + " não é um palíndromo");
            }

            // Opção para repetir ou finalizar
            System.out.print("Deseja analisar outra palavra? (s/n): ");
            String option = sc.next();

            if (option.equalsIgnoreCase("s")) {
                System.out.println("Reiniciando sistema...");
                System.out.println("");
                System.out.println("");
            } else if (option.equalsIgnoreCase("n")) {
                System.out.println("Finalizando sistema...");
                isRunning = false;
            } else {
                System.out.println("Entrada inválida. Finalizando sistema por segurança...");
                isRunning = false;
            }

            // Limpa as listas para a próxima iteração
            letters.clear();
            reverseLetters.clear();

        } while (isRunning);
    }

    // Metodo para gerar e exibir a sequência de Fibonacci
    static void fibonacci() {
        int nNums = 14; // Número de elementos da sequência
        int nextNum = 1; // Próximo número da sequência
        int prevNum = 0; // Número anterior da sequência

        System.out.println(prevNum);
        System.out.println(nextNum);

        // Gera a sequência usando um laço for
        for (int i = 0; i < nNums; i++) {
            int sum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = sum;
            System.out.println(nextNum);
        }
    }

    // Metodo para inverter os dígitos de um número inteiro
    static void invertedNums() {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        do {
            int invertedNum = 0;

            // Entrada do número
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            // Inversão dos dígitos do número
            while (num != 0) {
                int digito = num % 10;
                invertedNum = invertedNum * 10 + digito;
                num = num / 10;
            }

            System.out.println("Número invertido: " + invertedNum);

            // Opção para reiniciar ou finalizar
            System.out.print("Deseja inverter outro número? (s/n): ");
            String option = sc.next();

            if (option.equalsIgnoreCase("s")) {
                System.out.println("Reiniciando sistema...");
            } else if (option.equalsIgnoreCase("n")) {
                System.out.println("Finalizando sistema...");
                isRunning = false;
            } else {
                System.out.println("Entrada inválida. Finalizando sistema por segurança...");
                isRunning = false;
            }
        } while (isRunning);
    }

    // Metodo para verificar se duas palavras são anagramas
    static void anagram() {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        do {
            HashMap<Character, Integer> letters = new HashMap<>();
            boolean isAnAnagram = true;

            // Entrada das palavras
            System.out.print("Digite a primeira palavra: ");
            String word1 = sc.next().toLowerCase().trim();

            System.out.print("Digite a segunda palavra: ");
            String word2 = sc.next().toLowerCase().trim();

            // Contagem das letras da primeira palavra
            for (char i : word1.toCharArray()) {
                letters.put(i, letters.getOrDefault(i, 0) + 1);
            }

            // Verifica se as letras da segunda palavra correspondem
            for (char i : word2.toCharArray()) {
                if (!letters.containsKey(i)) {
                    isAnAnagram = false;
                }
                letters.put(i, letters.get(i) - 1);
            }

            // Verifica se todas as contagens ficaram zeradas
            for (int valor : letters.values()) {
                if (valor != 0) {
                    isAnAnagram = false;
                }
            }

            // Exibe o resultado
            if (isAnAnagram) {
                System.out.println("A palavra " + word1 + " é um anagrama de " + word2);
            } else {
                System.out.println("A palavra " + word1 + " não é um anagrama de " + word2);
            }

            // Opção para reiniciar ou finalizar
            System.out.print("Deseja analisar outra palavra? (s/n): ");
            String option = sc.next();

            if (option.equalsIgnoreCase("s")) {
                System.out.println("Reiniciando sistema...");
            } else if (option.equalsIgnoreCase("n")) {
                System.out.println("Finalizando sistema...");
                isRunning = false;
            } else {
                System.out.println("Entrada inválida. Finalizando sistema por segurança...");
                isRunning = false;
            }
        } while (isRunning);
    }

    // Metodo para contar palavras em uma frase
    static void wordCounter() {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        do {
            int count = 0;

            // Entrada da frase
            System.out.print("Escreva uma frase: ");
            String phrase = sc.nextLine();

            // Remove pontuação e separa as palavras
            phrase = phrase.replaceAll("[,.?!]", "");
            String[] words = phrase.split(" ");

            // Conta o número de palavras
            for (int i = 1; i <= words.length; i++) {
                count++;
            }

            System.out.println("Há " + count + " palavras nessa frase");

            // Opção para reiniciar ou finalizar
            System.out.print("Deseja analisar outra frase? (s/n): ");
            String option = sc.next();
            sc.nextLine();

            if (option.equalsIgnoreCase("s")) {
                System.out.println("Reiniciando sistema...");
            } else if (option.equalsIgnoreCase("n")) {
                System.out.println("Finalizando sistema...");
                isRunning = false;
            } else {
                System.out.println("Entrada inválida. Finalizando sistema por segurança...");
                isRunning = false;
            }
        } while (isRunning);
    }

    // Metodo principal que inicia o programa
    public static void main(String[] args) {
        wordCounter();
    }
}
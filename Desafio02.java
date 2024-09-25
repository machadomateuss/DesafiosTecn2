import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavra ou frase para verificar a ocorrência da letra 'a' na mesma: ");
        String input = scanner.nextLine();

        int countA = countLetterA(input);

        if (countA > 0) {
            System.out.println("A letra 'a' aparece " + countA + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }

    public static int countLetterA(String input) {
        int countA = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                countA++;
            }
        }

        return countA;
    }
}

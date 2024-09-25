import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int number = scanner.nextInt();

            if (isFibonacci(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
            }

            System.out.print("Deseja verificar outro número? (s|n): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("s")); 

        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        return false;
    }
}

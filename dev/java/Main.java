import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> fibonacci(int n) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            sequence.add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }

        return sequence;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many Fibonacci numbers? ");

            try {
                int n = Integer.parseInt(scanner.nextLine().trim());
                if (n < 0) {
                    throw new IllegalArgumentException("Number must be non-negative.");
                }

                List<Integer> fibSeq = fibonacci(n);
                System.out.println("Fibonacci sequence:");
                System.out.println(String.join(", ", fibSeq.stream().map(String::valueOf).toArray(String[]::new)));

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter an integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }
}

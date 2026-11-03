import java.util.ArrayList;
import java.util.Scanner;

public class Labsheet8Q11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 5);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNum = scanner.nextInt();

        if (numbers.contains(searchNum)) {
            System.out.println("Number exists in the list.");
        } else {
            System.out.println("Number does not exist in the list.");
        }
        scanner.close();
    }
}

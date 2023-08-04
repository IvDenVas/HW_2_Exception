import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.nextLine().equals("")) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }
}

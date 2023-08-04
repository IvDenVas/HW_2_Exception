import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float x = getFloatNumber();
        System.out.println(x);
    }
    static float getFloatNumber() {
        boolean temp = true;
        System.out.println("Введите дробное число (типа float): ");
        while (temp) {
            Scanner scanner = new Scanner(System.in);
            try {
                float res = scanner.nextFloat();
                if(res == (int) res) {
                    throw  new RuntimeException();
                } else {
                    temp = false;
                    return res;
                }
            } catch (RuntimeException e) {
                System.out.println("Неверный ввод! Попробуйте еще: ");
            }
        }
        return -1;
    }
}
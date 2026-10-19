package semester1.practice03;

import java.util.Scanner;

public class Task_19 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть чисельник: ");
            double numerator = scan.nextDouble();

            double denominator;

            do {
                System.out.print("Введіть знаменник (не 0): ");
                denominator = scan.nextDouble();

                if (denominator == 0) {
                    System.out.println("На нуль ділити не можна!");
                }

            } while (denominator == 0);

            double result = numerator / denominator;

            System.out.println("Результат: " + result);
        }
}

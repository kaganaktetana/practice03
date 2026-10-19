package semester1.practice03;

import java.util.Scanner;

public class Task_17 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char answer;

            do {
                System.out.print("Введіть перше число: ");
                double a = scan.nextDouble();

                System.out.print("Введіть друге число: ");
                double b = scan.nextDouble();

                System.out.println("Сума: " + (a + b));

                System.out.print("Бажаєте продовжити? (y/n): ");
                answer = scan.next().charAt(0);

            } while (answer == 'y');

            System.out.println("Програму завершено.");
        }
}

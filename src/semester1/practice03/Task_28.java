package semester1.practice03;

import java.util.Scanner;

public class Task_28 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть перший член a1: ");
            int a1 = scan.nextInt();

            System.out.print("Введіть різницю d: ");
            int d = scan.nextInt();

            System.out.print("Введіть кількість членів n: ");
            int n = scan.nextInt();

            int sum = 0;

            for (int i = 0; i < n; i++) {
                int a = a1 + i * d;

                System.out.print(a + " ");
                sum += a;
            }

            System.out.println("\nСума = " + sum);
        }
}

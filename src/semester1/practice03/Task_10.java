package semester1.practice03;

import java.util.Scanner;

public class Task_10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть число: ");
            int num = scan.nextInt();

            int reverse = 0;

            while (num > 0) {
                int num2 = num % 10;

                reverse = reverse * 10 + num2;

                num = num / 10;
            }

            System.out.println("Реверс числа: " + reverse);
        }
}

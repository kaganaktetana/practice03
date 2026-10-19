package semester1.practice03;

import java.util.Scanner;

public class Task_09 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть N: ");
            int N = scan.nextInt();

            int count = 0;
            int sum = 0;

            while (N > 0) {
                int num = N % 10;

                sum = sum + num ;
                count++;

                N = N / 10;
            }

            System.out.println("Кількість цифр: " + count);
            System.out.println("Сума цифр: " + sum);
        }
    }


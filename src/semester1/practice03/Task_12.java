package semester1.practice03;

import java.util.Scanner;

public class Task_12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть N > 1: ");
            int num = scan.nextInt();

            int divisor = 2;

            while (num % divisor != 0) {
                divisor++;
            }

            System.out.println("Найменший дільник: " + divisor);
        }
    }


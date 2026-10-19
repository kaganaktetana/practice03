package semester1.practice03;

import java.util.Scanner;

public class Task_07 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int sum = 0;
            int number = 1;

            while (number != 0) {
                System.out.print("Введіть число: ");
                number = scan.nextInt();

                if (number != 0) {
                    sum = sum + number;
                }
            }

            System.out.println("Сума: " + sum);
        }
    }


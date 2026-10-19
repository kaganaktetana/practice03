package semester1.practice03;

import java.util.Scanner;

public class Task_16 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int correctPin = 1234;
            int pin;
            int attempts = 0;

            do {
                System.out.print("Введіть PIN-код: ");
                pin = scan.nextInt();

                attempts++;

                if (pin == correctPin) {
                    System.out.println("Доступ надано");
                    break;
                }

                System.out.println("Неправильний PIN!");

            } while (attempts < 3);

            if (pin != correctPin) {
                System.out.println("Карту заблоковано!");
            }
        }
}

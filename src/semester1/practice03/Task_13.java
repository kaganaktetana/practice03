package semester1.practice03;

import java.util.Scanner;

public class Task_13 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int secret = (int) (Math.random() * 100) + 1;
            int guess = 0;
            int attempts = 0;

            while (guess != secret) {
                System.out.print("Вгадайте число: ");
                guess = scan.nextInt();
                attempts++;

                if (guess < secret) {
                    System.out.println("Більше!");
                } else if (guess > secret) {
                    System.out.println("Менше!");
                } else {
                    System.out.println("Правильно!");
                }
            }

            System.out.println("Кількість спроб: " + attempts);
            // імбово можна побавитися :)
        }
    }


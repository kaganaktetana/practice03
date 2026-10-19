package semester1.practice03;

import java.util.Scanner;

public class Task_20 {//поки 20 класів створювала вже їсти захотіла ,достворюю піду>-<//>
    // стільки часу пройшло після того, як я це писала ,боже поможи ,тільки тапками не бийте лєнь було - це робить
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int score;
            int sum = 0;
            int count = 0;

            do {
                System.out.print("Введіть бал (0-100, від'ємне число — стоп): ");
                score = sc.nextInt();

                if (score >= 0 && score <= 100) {
                    sum += score;
                    count++;
                } else if (score > 100) {
                    System.out.println("Некоректний бал! Введіть від 0 до 100.");
                }

            } while (score >= 0);

            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Середній бал: " + average);
            } else {
                System.out.println("Оцінок не введено.");
            }
        }
}

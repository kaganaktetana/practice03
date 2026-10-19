package semester1.practice03;

import java.util.Scanner;

public class Task_15 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int age;

            do {
                System.out.print("Введіть свій вік: ");
                age = scan.nextInt();

                if (age < 1 || age > 120) {
                    System.out.println("Некоректний вік. Спробуйте ще раз.");
                }

            } while (age < 1 || age > 120);

            System.out.println("Вік підтверджено: " + age);
        }
}

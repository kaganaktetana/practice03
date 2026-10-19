package semester1.practice03;

import java.util.Scanner;

public class Task_14 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int choice;

            do {
                System.out.println("1. Розпочати нову гру");
                System.out.println("2. Завантажити збереження");
                System.out.println("3. Налаштування");
                System.out.println("0. Вихід");
                System.out.print("Ваш вибір: ");

                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Розпочинаємо нову гру!");
                        break;
                    case 2:
                        System.out.println("Завантаження збереження...");
                        break;
                    case 3:
                        System.out.println("Відкрито налаштування.");
                        break;
                    case 0:
                        System.out.println("Вихід із програми.");
                        break;
                    default:
                        System.out.println("Невірний вибір.");
                }

            } while (choice != 0);
        }
}

package semester1.practice03;

import java.util.Scanner;

public class Task_21 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть A: ");
            int A = scan.nextInt();

            System.out.print("Введіть B: ");
            int B = scan.nextInt();

            for (int i = A; i <= B; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
}

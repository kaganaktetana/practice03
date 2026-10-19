package semester1.practice03;

import java.util.Scanner;

public class Task_27 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть N: ");
            int N = scan.nextInt();

            int sum = 0;

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    sum -= i;
                } else {
                    sum += i;
                }
            }

            System.out.println("Сума = " + sum);
        }
}

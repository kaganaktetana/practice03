package semester1.practice03;

import java.util.Scanner;

public class Task_40 {//перемога буде , а я їсти//
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть розмір N: ");
            int N = scan.nextInt();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("# ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();
            }
        }
}

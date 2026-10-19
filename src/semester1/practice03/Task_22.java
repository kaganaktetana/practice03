package semester1.practice03;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть N: ");
        int N = scan.nextInt();

        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }

        System.out.println("Факторіал = " + factorial);
    }
}

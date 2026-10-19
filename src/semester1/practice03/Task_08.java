package semester1.practice03;

import java.util.Scanner;

public class Task_08 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть M: ");
            int M = scan.nextInt();

            long power = 1;

            while (power <= M) {
                System.out.println(power);
                power = power * 2;
// не думала , що скажу це , але це даже цікаво робить
            }
        }
    }


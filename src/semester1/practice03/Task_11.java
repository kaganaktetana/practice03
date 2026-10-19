package semester1.practice03;

import java.util.Scanner;

public class Task_11 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Початковий внесок S: ");
            double S = scan.nextDouble();

            System.out.print("Річна ставка P (%): ");
            double P = scan.nextDouble();

            if (S <= 0 || P <= 0) {
                System.out.println("S і P мають бути більшими за 0.");
                return;
            }

            double capital = S;
            int years = 0;

            while (capital < 2 * S) {
                capital = capital * (1 + P / 100);
                years++;
            }

            System.out.println("Кількість років: " + years);
            System.out.println("Капітал: " + capital);
        }
    }

package semester1.practice03;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double rate = scan.nextDouble();

        for (int euro = 10; euro <= 100; euro += 10) {
            double uah = euro * rate;
            System.out.println(euro + " євро = " + uah + " грн");
        }
        }
    }


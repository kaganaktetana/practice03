package semester1.practice03;

import java.util.Scanner;
public class Task_02{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }
    }
}
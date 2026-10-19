package semester1.practice03;

public class Task_03 {
    public static void main(String[] args) {
        int balance = 0;

        for (int month = 1; month <= 12; month++) {
            balance = balance + 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }
    }
}
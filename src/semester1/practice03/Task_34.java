package semester1.practice03;

public class Task_34 {
    public static void main(String[] args) {

        long bigNumber = 3_000_000_000L;

        int smallNumber = (int) bigNumber;

        System.out.println("Початкове число: " + bigNumber);
        System.out.println("Після приведення: " + smallNumber);
    }
}
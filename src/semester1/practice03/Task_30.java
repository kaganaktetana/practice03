package semester1.practice03;

    import java.util.Scanner;

    public class Task_30 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Скільки чисел буде? ");
            int n = scan.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Введіть число: ");
                int number = scan.nextInt();

                sum += number;
            }

            double average = (double) sum / n;
            double averageWithoutCasting = sum / n;

            System.out.println("Сума = " + sum);
            System.out.println("З приведенням типу = " + average);
            System.out.println("Без приведення типу = "
                    + averageWithoutCasting);
        }
    }


package semester1.practice03;

public class Task_23 {
        public static void main(String[] args) {

            System.out.printf("%-10s %-10s %-10s%n",
                    "Число", "Квадрат", "Куб");

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%-10d %-10d %-10d%n",
                        i, i * i, i * i * i);
            }
        }
}

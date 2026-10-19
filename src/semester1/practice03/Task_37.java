package semester1.practice03;

    import java.util.Scanner;

    public class Task_37 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть висоту H: ");
            int H = scan.nextInt();

            System.out.print("Введіть ширину W: ");
            int W = scan.nextInt();

            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    if (i == 1|| i == H || j == 1 || j == W) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}

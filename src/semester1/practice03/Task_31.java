package semester1.practice03;

    import java.util.Scanner;

    public class Task_31 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введіть слово: ");
            String word = scan.nextLine();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                char encrypted = (char) (ch + 1);

                System.out.print(encrypted);
            }
        }
    }


package semester1.practice03;
public class Task_33 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);

            System.out.println("Завантажено: " + percent + "%");
        }
    }
}

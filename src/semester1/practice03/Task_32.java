package semester1.practice03;

    public class Task_32 {
        public static void main(String[] args) {

            double[] prices = {
                    19.99, 45.50, 12.10, 99.95, 3.40
            };

            int wholeSum = 0;
            double centsSum = 0;

            for (int i = 0; i < prices.length; i++) {
                int whole = (int) prices[i];

                wholeSum += whole;
                centsSum += prices[i] - whole;
            }

            System.out.println("Цілі гривні: " + wholeSum);
            System.out.println("Відкинуті дробові частини: "
                    + centsSum);
        }
    }


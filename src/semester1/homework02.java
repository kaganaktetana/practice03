package semester1;
public class homework02 {
        public static void main(String[] args) {
            // Вхідні дані
            int number = 742;

            // 1. Виділення окремих цифр
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            // 2. Обчислення суми та добутку цифр
            int sum = hundreds + tens + units;
            int product = hundreds * tens * units;

            // 3. Формування перевернутого числа
            int reversedNumber = units * 100 + tens * 10 + hundreds;

            // 4. Перевірка парності суми цифр
            boolean isSumEven = (sum % 2 == 0);

            // 5. Вивід звіту
            System.out.println("Початкове число:            " + number);
            System.out.println("Розряди:                    Сотні = " + hundreds + ", Десятки = " + tens + ", Одиниці = " + units);
            System.out.println("Сума цифр:                  " + sum);
            System.out.println("Добуток цифр:               " + product);
            System.out.println("Перевернуте число:          " + reversedNumber);
            System.out.println("Чи є сума цифр парною?      " + isSumEven);
        }
    }

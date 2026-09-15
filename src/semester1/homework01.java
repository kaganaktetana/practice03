package semester1;

public class homework01 {
        public static void main(String[] args) {
            // Вхідні дані
            double usdAmount = 250.0;
            final double EXCHANGE_RATE = 41.25;
            final double COMMISSION_PERCENT = 1.5; // 1.5%
            // 1. Загальна сума в гривнях до вирахування комісії
            double totalUah = usdAmount * EXCHANGE_RATE;
            // 2. Сума комісії банку в гривнях
            double commissionUah = totalUah * (COMMISSION_PERCENT / 100.0);
            // 3. Чиста сума до видачі клієнту
            double netAmountUah = totalUah - commissionUah;
            // 4. Округлення суми до видачі до найближчого цілого числа
            long cashToGive = Math.round(netAmountUah);
            // 5. Вивід квитанції
            System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================");
            System.out.println("Сума до обміну:             " + String.format("%.2f", usdAmount) + " USD");
            System.out.println("Курс валют:                 " + String.format("%.2f", EXCHANGE_RATE) + " UAH/USD");
            System.out.println("Нараховано до комісії:      " + String.format("%.2f", totalUah) + " UAH");
            System.out.println("Комісія банку (" + COMMISSION_PERCENT + "%):       " + String.format("%.2f", commissionUah) + " UAH");
            System.out.println("--------------------------------------------------");
            System.out.println("Чиста сума до видачі:       " + String.format("%.2f", netAmountUah) + " UAH");
            System.out.println("До видачі готівкою:         " + cashToGive + " UAH");
            System.out.println("==================================================");
        }
    }


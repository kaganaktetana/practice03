package semester1.practice03;
    import java.util.Scanner;

    public class Homework05BRAWL {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int playerHp = 0;
            int maxPlayerHp = 0;
            int attackDamage = 0;
            int superDamage = 0;
            String playerName = "";

            int bossHp = 10000;
            int maxBossHp = 10000;
            int bossBaseDamage = 700;

            int ammo = 3;
            int superCharge = 0;
            int rounds = 0;

            double damageMultiplier = 1.0;

            boolean bossStunned = false;
            boolean weakenNextAttack = false;

            System.out.println("=== BRAWL STARS: ROBO-BOSS ===");
            System.out.println("Оберіть бійця:");
            System.out.println("1 - Shelly");
            System.out.println("2 - Colt");
            System.out.println("3 - El Primo");
            System.out.print("Ваш вибір: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    playerName = "Shelly";
                    playerHp = 4000;
                    attackDamage = 1200;
                    superDamage = 2800;
                    break;

                case 2:
                    playerName = "Colt";
                    playerHp = 3000;
                    attackDamage = 1600;
                    superDamage = 3600;
                    break;

                case 3:
                    playerName = "El Primo";
                    playerHp = 6000;
                    attackDamage = 1100;
                    superDamage = 2200;
                    break;

                default:
                    System.out.println("Неправильний вибір!");
                    return;
            }

            maxPlayerHp = playerHp;

            System.out.println("\nВи обрали: " + playerName);
            System.out.println("Бій починається!");

            while (playerHp > 0 && bossHp > 0) {
                rounds++;

                System.out.println("\n========== РАУНД " + rounds + " ==========");

                printHealthBar(playerName, playerHp, maxPlayerHp);
                printHealthBar("Robo-Boss", bossHp, maxBossHp);

                System.out.println("Набої: " + ammo + "/3");
                System.out.println("Заряд суперздібності: "
                        + superCharge + "%");

                System.out.println("\nОберіть дію:");
                System.out.println("1 - Основна атака");
                System.out.println("2 - Супер");
                System.out.println("3 - Захист і лікування");
                System.out.println("4 - Пошук енергетичного куба");

                int action;

                do {
                    System.out.print("Ваша дія: ");
                    action = scan.nextInt();

                    if (action == 2 && superCharge < 100) {
                        System.out.println("Супер ще не заряджений!");
                    } else if (action < 1 || action > 4) {
                        System.out.println("Оберіть число від 1 до 4.");
                    }
                } while (action < 1 || action > 4
                        || (action == 2 && superCharge < 100));

                switch (action) {
                    case 1:
                        if (ammo > 0) {
                            ammo--;

                            int damage = (int) (attackDamage
                                    * damageMultiplier);

                            bossHp -= damage;
                            superCharge += 35;

                            if (superCharge > 100) {
                                superCharge = 100;
                            }

                            System.out.println(playerName
                                    + " атакує! Шкода: " + damage);

                            System.out.println("Заряд суперздібності: "
                                    + superCharge + "%");
                        } else {
                            System.out.println("Немає набоїв! Хід втрачено.");
                        }
                        break;

                    case 2:
                        int ultimateDamage = (int) (superDamage
                                * damageMultiplier);

                        bossHp -= ultimateDamage;
                        superCharge = 0;
                        System.out.println(playerName
                                + " використовує СУПЕР! Шкода: "
                                + ultimateDamage);

                        if (choice == 1) {
                            weakenNextAttack = true;
                            System.out.println(
                                    "Боса відкинуто! Його наступна атака слабша на 50%.");
                        } else if (choice == 3) {
                            bossStunned = true;
                            System.out.println(
                                    "Боса оглушено! Він пропустить наступний хід.");
                        }
                        break;

                    case 3:
                        ammo += 2;

                        if (ammo > 3) {
                            ammo = 3;
                        }

                        int healing = (int) (maxPlayerHp * 0.15);

                        playerHp += healing;

                        if (playerHp > maxPlayerHp) {
                            playerHp = maxPlayerHp;
                        }

                        System.out.println("Захисний маневр!");
                        System.out.println("Відновлено здоров'я: "
                                + (playerHp > 0 ? healing : 0));
                        System.out.println("Набої: " + ammo + "/3");
                        break;

                    case 4:
                        if (Math.random() < 0.6) {
                            damageMultiplier += 0.15;

                            System.out.println(
                                    "Ви знайшли енергетичний куб!");
                            System.out.println("Множник шкоди: "
                                    + damageMultiplier);
                        } else {
                            System.out.println(
                                    "Куб не знайдено. Спробуйте ще раз!");
                        }
                        break;
                }

                if (bossHp <= 0) {
                    bossHp = 0;
                    break;
                }

                System.out.println("\n--- Хід Робо-Боса ---");

                if (bossStunned) {
                    System.out.println(
                            "Бос оглушений і пропускає свій хід.");
                    bossStunned = false;
                } else {
                    int bossDamage = bossBaseDamage;

                    if (bossHp > maxBossHp * 0.6) {
                        System.out.println("Фаза 1: NORMAL");
                    } else if (bossHp >= maxBossHp * 0.3) {
                        bossDamage = (int) (bossDamage * 1.3);
                        System.out.println("Фаза 2: ANGRY!");
                    } else {
                        bossDamage = (int) (bossDamage * 1.7);
                        System.out.println("Фаза 3: ENRAGED!");
                    }

                    if (weakenNextAttack) {
                        bossDamage = (int) (bossDamage * 0.5);
                        weakenNextAttack = false;
                        System.out.println("Атаку боса послаблено!");
                    }

                    if (Math.random() < 0.15) {
                        System.out.println(
                                "Ви ухилилися від атаки!");
                    } else {
                        playerHp -= bossDamage;

                        System.out.println("Бос атакує! Шкода: "
                                + bossDamage);

                        if (playerHp < 0) {
                            playerHp = 0;
                        }
                    }
                }

                if (playerHp > 0) {
                    if (ammo < 3) {
                        ammo++;
                    }

                    System.out.println("Перезарядка: набої "
                            + ammo + "/3");
                }
            }

            System.out.println("\n========== КІНЕЦЬ БИТВИ ==========");

            printHealthBar(playerName, playerHp, maxPlayerHp);
            printHealthBar("Robo-Boss", bossHp, maxBossHp);

            System.out.println("Кількість раундів: " + rounds);
            if (bossHp <= 0) {
                System.out.println("ПЕРЕМОГА! Робо-Боса переможено!");
                System.out.println("Нагорода: +10 трофеїв!");
                System.out.println("Нагорода: 100 Starr Drops!");
            } else {
                System.out.println("ПОРАЗКА! Вас переможено.");
                System.out.println(
                        "Спробуйте зіграти за витривалішого Ель Прімо!");
            }

            scan.close();
        }

        public static void printHealthBar(
                String name, int currentHp, int maxHp) {

            int safeHp = Math.max(0, currentHp);

            int bars = (int) (((double) safeHp / maxHp) * 10);

            if (bars > 10) {
                bars = 10;
            }

            System.out.print(name + " HP: " + safeHp
                    + "/" + maxHp + " [");

            for (int i = 0; i < bars; i++) {
                System.out.print("█");
            }

            for (int i = 0; i < 10 - bars; i++) {
                System.out.print("░");
            }

            System.out.println("]");
        }
    }

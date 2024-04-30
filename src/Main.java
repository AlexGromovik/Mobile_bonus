public class Main {
    public static void main(String[] args) {
        int startBalance; // Переменная начального баланса клиента
        int refill; // Сумма пополнение счета
        int oneBonus = 100; // Сумма, с которой начисляется 1 бонус
        startBalance = 100;
        refill = 1_100;

        int bonus;
        int finalBalance;
        if (refill > 1_000) {
            bonus = refill / oneBonus; // Расчет бонусов при выполнении условия
            finalBalance = startBalance + refill + bonus; // Окончательный баланс
            System.out.println("Начисленные бонусы: " + bonus);
            System.out.println("Итоговый баланс" + finalBalance);
        } else {
            finalBalance = startBalance + refill; // Окончательный баланс

            System.out.println("Итоговый баланс = " + finalBalance);
        }

    }
}

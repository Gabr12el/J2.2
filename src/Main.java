public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и параметров программы: начального счёта,
        // суммы пополнения и тп:
        int pervo = 100;  // первоначальная сумма на счёте
        int popol = 600; // сумма пополнения счёта
        boolean inActive = true;
        // Условным оператором проверяете превысила ли сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите на экран.
        int porog = (popol > 1000) ? 1 : 0;
        int bonus = popol / 100 * porog;
        int balance = pervo + popol + bonus;
        System.out.println("Респект за лавэ!:) Твой баланс: " + balance + " руб. Твой бонус: " + bonus + " руб.");
    }
}

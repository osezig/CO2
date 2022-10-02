public class Main {
    public static void task4(String[] args) {
        int deliveryDistanse = 95;

        int deliveryDays = 1;

        if (deliveryDistanse > 20) {
            deliveryDays++;
        }
        if (deliveryDistanse > 60) {
            deliveryDays++;

            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}
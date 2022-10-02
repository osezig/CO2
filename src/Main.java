public class Main {
    public static void task3(String[] args) {
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "является високосным");
        } else {
            System.out.println (year + " не является високосным");
        }

        }
    }
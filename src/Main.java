public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (int a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int year = 0;
        int fertility = 17;
        int mortality = 8;
        while (year <= 10) {
            totalPopulation = totalPopulation / 1000 * (fertility - mortality) + totalPopulation;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int depositAmount = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            total = total + total * 7 / 100;
            total = total + depositAmount;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int depositAmount = 15_000;
        int total = 0;
        for (int month = 0; total <= 12_000_000; month++) {
            total = total + total * 7 / 100;
            total = total + depositAmount;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int depositAmount = 15_000;
        double procent = 0.07;
        int depositTerm = 9 * 12;
        int month = 1;
        while (month <= depositTerm) {
            depositAmount += depositAmount * procent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, depositAmount);
            }
            month++;
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friyday = 5;
        int month = 31;
        while (friyday <= month) {
            System.out.printf("Сегодня пятница, %d число. Необходимо подготовить отчет.%n", friyday);
            friyday += 7;
            }
        }
    public static void task8() {
        System.out.println("Задача 8");
        int startYear = 1823;
        int lastYear = 2123;
        int cometPeriod = 79;
        for (int year = startYear; year <= lastYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}





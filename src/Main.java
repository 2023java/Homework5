public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваш телефон не поддерживает приложение на Android или iOS");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2013;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 1600;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней:");
            if (deliveryDistance <= 20) {
                System.out.println(" 1");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println(" 2");
            } else {
                System.out.println(" 3");
            }
        }
        if (deliveryDistance > 100) {
            System.out.println(" Доставка не осуществляется");
        }
    }
    public static void task5() {
        System.out.println("Задача 4+");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println(" Потребуется дней: " + deliveryDays);
        if (deliveryDistance > 100) {
            System.out.println(" Доставка не осуществляется");
        }


    }
    public static void task6() {
        System.out.println("Задача 5");
        int monthNumber = 3;

        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас январь - это зимний месяц");
                break;
            case 2:
                System.out.println("Сейчас февраль - это зимний месяц");
                break;
            case 3:
                System.out.println("Сейчас март - это весенний месяц");
                break;
            case 4:
                System.out.println("Сейчас апрель - это весенний месяц");
                break;
            case 5:
                System.out.println("Сейчас май - это весенний месяц");
                break;
            case 6:
                System.out.println("Сейчас июнь - это летний месяц");
                break;
            case 7:
                System.out.println("Сейчас июль - это летний месяц");
                break;
            case 8:
                System.out.println("Сейчас августа - это летний месяц");
                break;
            case 9:
                System.out.println("Сейчас сентябрь - это осенний месяц");
                break;
            case 10:
                System.out.println("Сейчас октябрь - это осенний месяц");
                break;
            case 11:
                System.out.println("Сейчас ноябрь - это осенний месяц");
                break;
            case 12:
                System.out.println("Сейчас декабрь - это зимний месяц");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }
    public static void task7() {
        System.out.println("Задача 5+");
        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }
}

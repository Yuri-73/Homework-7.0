import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Является ли введённый в консоль год високосным? ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("I enter the year: ");
        int year = scanner.nextInt(); // Ввод года
        yearIsLeap(year); // Вызов метода определения високосного года без возвращения переменной
    }
    public static void yearIsLeap(int Year) {
        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0)
                    System.out.println(Year + " год является високосным");
                else
                    System.out.println(Year + " год не является високосным");
            }
            else
                System.out.println(Year + " год является високосным");
        }
        else
            System.out.println(Year + " год не является високосным");
    }
    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Какое приложение следует установить клиенту банка? ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Operating system: ");
        byte clientOS = scanner.nextByte(); // Ввод кода операционной системы (0 или 1)
        System.out.print("Year of release: ");
        int clientDeviceYear = scanner.nextInt(); // Год выпуска устройства
        InstallTheApp(clientOS, clientDeviceYear); // Вызов метода определения версии телефона
    }
    public static void InstallTheApp(byte ClientOS, int ClientDeviceYear) {
        if (ClientDeviceYear < 2015) {
            if (ClientOS == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else if (ClientOS == 1)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (ClientDeviceYear >= 2015) {
            if (ClientOS == 0)
                System.out.println("Установите версию приложения для IOS по ссылке");
            else if (ClientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        System.out.println("Посчитать сроки доставки карты клиенту на дом");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Distance for delivery: ");
        int deliveryDistance = scanner.nextInt(); // Ввод расстояния от офиса до дома клиента

        if(DeliverTheCardToYourHome(deliveryDistance) != 0) // Вызов метода определения сроков доставки
           System.out.println("Потребуется дней: " + DeliverTheCardToYourHome(deliveryDistance)); // Повторный вызов метода определения сроков доставки
        else
           System.out.println("Доставки нет");
    }
    public static int DeliverTheCardToYourHome(int distance) {
        int deliveryPeriod = 1;
        if (distance <= 100) {
            if (distance <= 20)
                return deliveryPeriod;
            if (distance > 20 && distance <= 60)
                return deliveryPeriod + 1;
            if (distance > 60 && distance <= 100)
                return deliveryPeriod + 2;
        } else
            return 0;
        return 0;
    }
}




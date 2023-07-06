import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        String name = "Сагида";
        switch (name) {
            case "Саалиха":
                System.out.println("Младшая");
                break;
            case "Сагида":
                System.out.println("Старшая");
                break;
            case "Сумая":
                System.out.println("Средняя");
                break;
            default:
                System.out.println("Число неизвестно");
                break;


        }
        int temperature = 30;
        int ageOfMyDad = 40;
        boolean isSunny = false;

        if (temperature > 25 && temperature < 45) {
            System.out.println("Go swimming");

        }
        if (ageOfMyDad == 34 && temperature > 7) {
            System.out.println("Go to park");
        }
        if (isSunny || temperature == 30) {
            System.out.println("Stay at home");
        }

        if (isSunny || ageOfMyDad < 30 && temperature < 20) {
            // false + false * false = 0 + 0 * 0 = 0 false
            System.out.println("Go to Sumbul");
        }
        if (!isSunny) {
            System.out.println("Stay at home mlya");
        }
        if (!isSunny || ageOfMyDad < 30 && temperature < 20) {
            // false + false * false = 0 + 0 * 0 = 0 false
            System.out.println("Go to school");
        }

        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();
        addition(5, 3, "Java is the best");
        addition(7, 6, "I love programming!");
        calculatePerimeter("Аудитория 2", 4.0, 5.0);
        calculatePerimeter("Кухня", 6.0, 9.5);
        calculatePerimeter("Библиотека", 10.0, 8.0);
        calculatePerimeter("Холл", 14.0, 10.0);
        double areaOfAuditory2 = calculateArea(4, 5);
        System.out.println("Площадь комнаты Аудитория2: " + areaOfAuditory2 + " квадратных метров.");
        double areaOfKitchen = calculateArea(6, 9);
        System.out.println("Площадь комнаты Кухня: " + areaOfKitchen + " квадратных метров.");
        double areaOfLibrary = calculateArea(10, 8);
        System.out.println("Площадь комнаты Бибилиотека: " + areaOfLibrary + " квадратных метров.");
        double areaOfHall = calculateArea(14, 10);
        System.out.println("Площадь комнаты Холл: " + areaOfHall + " квадратных метров.");
        System.out.println("ОБЩАЯ ПЛОЩАДЬ: " + (areaOfAuditory2 + areaOfKitchen + areaOfLibrary + areaOfHall) + " квадратных метров.");

    }

    public static void makeTea() { //невозвращаемый метод без входящих параметров
        System.out.println("1. Вскипятить воду");
        System.out.println("2. Насыпать заварку");
        System.out.println("3. Залить кипятком");
        System.out.println("4. Дать настояться");
        System.out.println("5. Налить в чашку, добавить молоко/сахар по вкусу");
        System.out.println("6. Добавить молоко или сахар по вкусу");
        time();
    }

    public static void time() { //невозвращаемый метод без входящих параметров
        int time = 7;
        System.out.println("Процесс занял " + time + "минут");
    }

    public static void addition(int num1, int num2, String phrase) { //невозвращаемый метод с входящими параметрами
        System.out.println("Сумма двух чисел = " + (num1 + num2));
        System.out.println("Значение фразы = " + phrase);

    }

    public static double calculateArea(int length, int width) { //возвращаемый метод с входщими параметрами
        double area = length * width;
        return area;
    }

    public static void calculatePerimeter(String roomName, double length, double width) { //невозвращаемый метод с входщими параметрами
        System.out.println("Периметр комнаты " + roomName + ": " + (2 * (length + width)) + " метров.");
    }
            }
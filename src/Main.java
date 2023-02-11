import java.util.Locale;

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
        int apple = 33000;
        System.out.println("Значение переменной apple c типом int равно " + apple);
        byte white = 5;
        System.out.println("Значение переменной white c типом byte равно " + white);
        long red = 3456L;
        System.out.println("Значение переменной red c типом long равно " + red);
        short blue = 234;
        System.out.println("Значение переменной blue c типом short равно " + blue);
        float color = 1.45675f;
        System.out.println("Значение переменной color c типом float равно " + color);
        double gray = 1.56;
        System.out.println("Значение переменной gray c типом double равно " + gray);

    }
public static void task2() {
        System.out.println("Задача 2:");
        float a = 2.712f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        long f = 27897L;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
}
    public static void task3() {
        System.out.println("Задача 3:");
        byte pupilsInFirstClass = 27;
        byte pupilsInSecondClass = 23;
        byte pupilsInThirdClass = 30;
        int totalPaperCount = 480;
        int totalPupils = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        int paperPerPupils = totalPaperCount / totalPupils;
        System.out.println("На каждого ученика рассчитано " + paperPerPupils + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4:");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMin = bottles / minutes;
        int bottlesPerHour = bottlesPerMin * 60;
        int bottlesPer20Min = bottlesPerMin * 20;
        System.out.println("За 20 мин. машина произвела " + bottlesPer20Min +
                " шт");
        int bottlesPerDay = bottlesPerHour * 24;
        System.out.println("За 1 день машина произвела " + bottlesPerDay +
                " штук бутылок");
        int bottlesPer3Day = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPer3Day +
                " штук бутылок");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth +
                " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5:");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 6;
        int totalClass = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClass * whiteCansPerClass;
        int totalBrownCans = totalClass * brownCansPerClass;
        System.out.println("В школе где " + totalClass + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6:");
        int bananasCount = 5;
        int weightBananaUnit = 80;
        int milkCount = 2;
        int weightMilkUnit = 105;
        int iceCreamCount = 2;
        int weightIceCreamUnit = 100;
        int eggCount = 4;
        int weightEggUnit = 70;
        int totalWeightInGrams = bananasCount * weightBananaUnit + milkCount * weightMilkUnit +
                iceCreamCount * weightIceCreamUnit + eggCount * weightEggUnit;
        double totalWeightInKg = totalWeightInGrams / 1_000D;
        System.out.println("Вес спортзавтрака = " + totalWeightInGrams +
                "гр, или " + totalWeightInKg + " кг.");
    }
    public static void task7() {
        System.out.println("Задача 7:");
        int weightForLossInGr = 7_000;
        int looseWeightPerDayMin = 250;
        int looseWeightPerDayMax = 500;
        double minDayCount = (double) weightForLossInGr / looseWeightPerDayMax;
        double maxDayCount = (double) weightForLossInGr / looseWeightPerDayMin;
        double looseWeightPerDayAverage = (looseWeightPerDayMax + looseWeightPerDayMin) / 2D;
        double averageDayCount = weightForLossInGr / looseWeightPerDayAverage;
    System.out.println(maxDayCount + " дней уйдет, если сбрасывать по 250 гр" +
            " в день, и " + minDayCount + " уйдет, если сбрасывать по 500 гр в день.");
           System.out.printf(Locale.US,"А в среднем может понадобиться %.2f%n" ,averageDayCount, " дней.");
    }
    public static void task8() {
        System.out.println("Задача 8:");
        int mashaSalaryPerMonth = 67760;
        int denisSalaryPerMonth = 83690;
        int kristinaSalaryPerMonth = 76230;
        float increaseSalaryPerYear = 0.1F;
        int monthQtyPerYear = 12;
        int mashaSalaryPerYear = mashaSalaryPerMonth * monthQtyPerYear;
        int denisSalaryPerYear = denisSalaryPerMonth * monthQtyPerYear;
        int kristinaSalaryPerYear = kristinaSalaryPerMonth * monthQtyPerYear;
        float mashaIncreaseSalary = (mashaSalaryPerYear * increaseSalaryPerYear +
                mashaSalaryPerYear) / monthQtyPerYear;
        float denisIncreaseSalary = (denisSalaryPerYear * increaseSalaryPerYear +
                denisSalaryPerYear) / monthQtyPerYear;
        float kristinaIncreaseSalary = (kristinaSalaryPerYear * increaseSalaryPerYear +
                kristinaSalaryPerYear) / monthQtyPerYear;
        float mashaDiff = mashaIncreaseSalary * monthQtyPerYear - mashaSalaryPerYear;
        float denisDiff = denisIncreaseSalary * monthQtyPerYear - denisSalaryPerYear;
        float kristinaDiff = kristinaIncreaseSalary * monthQtyPerYear - kristinaSalaryPerYear;
        System.out.println("Маша теперь получает " + mashaIncreaseSalary +
                " рублей. Годовой доход вырос на " + mashaDiff + "рублей. Денис теперь получает " +
                denisIncreaseSalary + " рублей. Годовой доход" +
                "вырос на " + denisDiff + " рублей. Кристина теперь получает " +
                kristinaIncreaseSalary + " рублей. Годовой доход вырос на " +
                kristinaDiff + " рублей.");

    }
        }

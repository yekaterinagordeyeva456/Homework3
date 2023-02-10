import com.sun.source.doctree.SummaryTree;

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
        System.out.println("Задача 1:");
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
        byte pupilsAnnaSerg = 27;
        byte pupilsLyudPavl = 23;
        byte pupilsYekatAndr = 30;
        int totalPaper = 480;
        int pupilsPaper = totalPaper / (pupilsAnnaSerg + pupilsLyudPavl + pupilsYekatAndr);
        System.out.println("На каждого ученика рассчитано " + pupilsPaper + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4:");
        int capacity = 16;
        int capacityPerMin = capacity / 2;
        int capacityPerHour = capacityPerMin * 60;
        int capacityPer20Min = capacityPerMin * 20;
        System.out.println("За 20 мин. машина произвела " + capacityPer20Min +
                " штук бутылок");
        int capacityPerDay = capacityPerHour * 24;
        System.out.println("За 1 день машина произвела " + capacityPerDay +
                " штук бутылок");
        int capacityPer3Day = capacityPerDay * 3;
        System.out.println("За 3 дня машина произвела " + capacityPer3Day +
                " штук бутылок");
        int capacityPerMonth = capacityPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + capacityPerMonth +
                " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5:");
        int paintTotal = 120;
        int paintWhitePerClass = 2;
        int paintBrownPerClass = 6;
        int paintPerClass = paintWhitePerClass + paintBrownPerClass;
        int classQty = paintTotal / paintPerClass;
        int paintWhiteTotal = classQty * paintWhitePerClass;
        int paintBrownTotal = classQty * paintBrownPerClass;
        System.out.println("В школе где " + classQty + " классов, нужно " + paintWhiteTotal +
                " банок белой краски и " + paintBrownTotal + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6:");
        int bananaTotalPcs = 5;
        int bananaWeightPer1pcsGr = 80;
        int bananaWeightTotalGr = bananaTotalPcs * bananaWeightPer1pcsGr;
        int milkTotalMl = 200;
        int milkWeightPer100MlGr = 105;
        int milkWeightTotalGr = milkTotalMl * milkWeightPer100MlGr;
        int icecreamTotalPcs = 2;
        int icecreamWeightPer1PcsGr = 100;
        int icecreamWeightTotalGr = icecreamTotalPcs * icecreamWeightPer1PcsGr;
        int eggTotalPcs = 4;
        int eggWeightPer1PcsGr = 70;
        int eggWeightTotalGr = eggTotalPcs * eggWeightPer1PcsGr;
        int breakfastWeightTotalGr = bananaWeightTotalGr + milkWeightTotalGr +
                icecreamWeightTotalGr + eggWeightTotalGr;
        int grPerKg = 1000;
        float breafastWeightTotalKg = breakfastWeightTotalGr / (float) grPerKg;
        System.out.println("Вес спортзавтрака = " + breakfastWeightTotalGr +
                "гр, или " + breafastWeightTotalKg + " кг.");
    }
    public static void task7() {
        System.out.println("Задача 7:");
        int looseWeightTotalKg = 7;
        int looseWeightPerDayGr1 = 250;
        int looseWeightPerDayGr2 = 500;
        int grPerKg = 1000;
        float looseWeightPerDayKg1 = looseWeightPerDayGr1 / (float) grPerKg;
    float looseWeightPerDayKg2 = looseWeightPerDayGr2 / (float) grPerKg;
    float looseWeightTotalDay1 = looseWeightTotalKg / looseWeightPerDayKg1;
    float looseWeightTotalDay2 = looseWeightTotalKg / looseWeightPerDayKg2;
    float looseWeightPerDayAverageKg = (looseWeightPerDayKg1 + looseWeightPerDayKg2) / 2;
    float looseWeightTotalDayAverage = looseWeightTotalKg / looseWeightPerDayAverageKg;
    System.out.println(looseWeightTotalDay1 + " дней уйдет, если сбрасывать по 250 гр" +
            " в день, и " + looseWeightTotalDay2 + " уйдет, если сбрасывать по 500 гр" +
            " в день. А в среднем может понадобиться " + looseWeightTotalDayAverage +
            " дней на сброс веса в 7 кг.");
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

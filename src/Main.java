public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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
        int pupilsPaper = totalPaper / (pupilsAnnaSerg + pupilsLyudPavl +pupilsYekatAndr);
        System.out.println("На каждого ученика рассчитано " + pupilsPaper + " листов бумаги.");

    }
        }

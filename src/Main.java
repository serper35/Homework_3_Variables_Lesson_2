public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        byte cat = 1;
        short dog = 200;
        int frog = 50000;
        long rabbit = 10000000000L;
        float cow = 1.1F;
        double horse = 1.123456789;

        System.out.println("Задача №1\nЗначение переменной cat с типом byte равно = " + cat + ";");
        System.out.println("Значение переменной dog с типом short равно = " + dog + ";");
        System.out.println("Значение переменной frog с типом int равно = " + frog + ";");
        System.out.println("Значение переменной rabbit с типом long равно = " + rabbit + ";");
        System.out.println("Значение переменной cow с типом float равно = " + cow + ";");
        System.out.println("Значение переменной horse с типом double равно = " + horse + ";");
    }

    public static void task2() {
        float a  = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        short g = 67;

    }

    public static void task3() {
        byte lyudmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short paper = 480;
        int forPupil =paper / (lyudmila + anna + ekaterina);

        System.out.println();
        System.out.println("Задача №3\nНа каждого ученика рассчитано " + forPupil + " листов бумаги.");

    }

    public static void task4() {
        byte bottles = 16;
        byte minutes2 = 2;

        int minutes1 = bottles / minutes2;
        int minutes20 =minutes1 *20;
        int day1 = 24 * 60 * minutes1;
        int day3 = day1 * 3;
        int month = day1 *30;


        System.out.println();
        System.out.println("Задача №4\nЗа 20 минут машина произвела " + minutes20 + " штук бутылок;");
        System.out.println("За одни сутки машина произвела " + day1 + " штук бутылок;");
        System.out.println("За трое суток машина произвела " + day3 + " штук бутылок;");
        System.out.println("За один месяц машина произвела " + month + " штук бутылок;");

    }
    public static void task5() {
        byte paints = 120;
        byte white = 2;
        byte brown = 4;

        int totalClassRoom = paints /(white + brown);
        int totalWhite = totalClassRoom * white;
        int totalBrown = totalClassRoom * brown;

        System.out.println();
        System.out.println("Задача №5\nВ школе, где " + totalClassRoom + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

    }

    public static void task6() {
        int bananas = 5;
        int bananaWeight = 80;
        int milk = 200;
        int iceCream =2;
        int iceCreamWeight =100;
        int eggs = 4;
        int eggsWeight =70;
        int breakfastWeightGr = (bananas * bananaWeight) + (milk*105/100) + (iceCream * iceCreamWeight) + (eggs + eggsWeight);
        float breakfastWeightKg = breakfastWeightGr / 1000f;

        System.out.println();
        System.out.println("Задача №6\nВес завтрака в граммах " + breakfastWeightGr + " гр;");
        System.out.println("Вес завтрака в килограммах " + breakfastWeightKg + " кг.");


    }
}
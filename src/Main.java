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
        int minutes20 =20;
        int day1 = 24 * 60;
        int day3 = day1 * 3;
        int month = day1 *30;

        int minutes1 = bottles / minutes2;
        int minutes20Bottles =minutes1 * minutes20;
        int day1Bottles = day1 * minutes1;
        int day3Bottles = day3 * minutes1;
        int monthBottles = month *minutes1;


        System.out.println();
        System.out.println("Задача №4\nЗа 20 минут машина произвела " + minutes20Bottles + " штук бутылок;");
        System.out.println("За одни сутки машина произвела " + day1Bottles + " штук бутылок;");
        System.out.println("За трое суток машина произвела " + day3Bottles + " штук бутылок;");
        System.out.println("За один месяц машина произвела " + monthBottles + " штук бутылок;");

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
        float mlToGr = 105f/100f;
        int iceCream =2;
        int iceCreamWeight =100;
        int eggs = 4;
        int eggsWeight =70;
        int grPerKg = 1000;
        float breakfastWeightGr = (bananas * bananaWeight) + (milk * mlToGr) + (iceCream * iceCreamWeight) + (eggs * eggsWeight);
        float breakfastWeightKg = breakfastWeightGr / (float)grPerKg;

        System.out.println();
        System.out.println("Задача №6\nВес завтрака в граммах " + breakfastWeightGr + " гр;");
        System.out.println("Вес завтрака в килограммах " + breakfastWeightKg + " кг.");
    }

    public static void task7() {
        int loseWeight = 7;
        int minWeight = 250;
        int maxWeight = 500;
        int kgToGr = 1000;

        int minLoseWeight = (loseWeight * kgToGr) / minWeight;
        int maxLoseWeight = (loseWeight * kgToGr) / maxWeight;
        int averageLoseWeight = (maxLoseWeight + minLoseWeight) /2;

        System.out.println();
        System.out.println("Задача №7\nЕсли спортсмен будет терять каждый день по " + minWeight + " грамм, то на похудение уйдет " + minLoseWeight + " дней;");
        System.out.println("Если спортсмен будет терять каждый день по " + maxWeight + " грамм, то на похудение уйдет " + maxLoseWeight + " дней;");
        System.out.println("В среднем на похудение уйдет " + averageLoseWeight + " день.");
    }

    public static void task8() {
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float percent10 = 0.1f;

        float salaryIncreaseMasha =(salaryMasha * percent10 ) + salaryMasha;
        float salaryIncreaseDenis =(salaryDenis * percent10 ) + salaryDenis;
        float salaryIncreaseKristina =(salaryKristina * percent10 ) + salaryKristina;
        float salaryDifMasha = salaryIncreaseMasha - salaryMasha;
        float salaryDifDenis = salaryIncreaseDenis - salaryDenis;
        float salaryDifKristina = salaryIncreaseKristina - salaryKristina;

        System.out.println();
        System.out.println("Задача №8\nМаша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + salaryDifMasha + " рублей;");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + salaryDifDenis + " рублей;");
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + salaryDifKristina + " рублей;");
    }
}
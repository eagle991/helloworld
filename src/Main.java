public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        //задача 1

        int a = 2100400600;
        System.out.println("Значение переменной (a) с типом int равно = " +a+" | Диапазон значений от -2 147 483 648 до 2 147 483 647 Объем Памяти 4 байт");
        byte b = 120;
        System.out.println("Значение переменной (b) с типом byte равно = " +b+" | Диапазон значений от -128 до 127 Объем Памяти 1 байт");
        short c = 32000;
        System.out.println("Значение переменной (c) с типом short равно = " +c+" | Диапазон значений от -32 768 до 32 767 Объем Памяти 2 байт");
        long d = 920030080; // на добавление  l  в конце цифры выдает ошибку
        System.out.println("Значение переменной (d) с типом long равно = " +d+" | Диапазон значений от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 Объем Памяти 8 байт");
        float e =  3.40030f;
        System.out.println("Значение переменной (e) с типом float равно = " +e+" | Диапазон значений от -3.4E+38 до 3.4E+38 Объем Памяти 4 байт");
        double f = 1.700300d;
        System.out.println("Значение переменной (e) с типом double равно = " +f+" | Диапазон значений от -1.7E+308 до 1.7E+308 Объем Памяти 8 байт");

        //Задача 2

        float e1 = 27.12f;
        System.out.println(e1);
        long d1 = 9876764;// на добавление  l  в конце цифры выдает ошибку
        System.out.println(d1);
        float e2 = 2.786f;
        System.out.println(e2);
        short c1 = 569;
        System.out.println(c1);
        short c2 = -159;
        System.out.println(c2);
        short c3 = 27897;
        System.out.println(c3);
        byte b1 = 67;
        System.out.println(b1);

        //задача 3

        byte lpStudent = 23;
        byte acStudent = 27;
        byte eaStudent = 30;
        short leaf = 480;
        int resylts = (lpStudent+acStudent+eaStudent);
        int Student1 = leaf/resylts;
        System.out.println("На каждого ученика рассчитано = " +Student1+ " листов бумаги");

        //задача 4

        byte bottle = 16;
        byte time = 2;
        byte time20 = 20;//за 20 минут
        int resylts20 = time20/time*bottle;
        System.out.println("За 20 минут машина произвела = " +resylts20+ " штук бутылок");
        int hour24 = 24*60;//в сутки,
        int time1440 = hour24/time*bottle;
        System.out.println("За сутки машина произвела = " +time1440+ " штук бутылок");
        int day3 = 24*60*3;//за 3 дня,
        int time4320 = day3/time*bottle;
        System.out.println("За 3 дня машина произвела = " +time4320+ " штук бутылок");
        int month = 24*60*30;//за 1 месяц
        int time43200 = month/time*bottle;
        System.out.println("За месяц машина произвела = " +time43200+ " штук бутылок");

        //задача 5
        byte bank = 120;
        byte bankWhite = 2;
        byte bankBrown = 4;
        int cl1 = bankWhite+bankBrown;
        System.out.println("на 1 класс количество банок = " +cl1);
        int allCl = bank/cl1;
        System.out.println("Всего классов в школе = " +allCl);
        int allWhite = bankWhite*allCl;
        System.out.println("Всего белой краски куплено = " +allWhite);
        int allBrown = bankBrown*allCl;
        System.out.println("Всего коричневой краски куплено = " +allBrown);
        System.out.println("В школе, где " +allCl+ " классов, нужно " +allWhite+ " банок белой краски и " +allBrown+ " банок коричневой краски");

        //задача 6

        byte banana = 1;
        byte bananaGr = 80; //Бананы — 5 штук (1 банан — 80 грамм).
        int allBananaGr = banana*5*bananaGr;
        byte milk = 100;
        byte milkGr = 105; // Молоко — 200 мл (100 мл = 105 грамм).
        int allMilkGr = 200/milk*milkGr;
        byte iceCream = 2;
        byte iceCreamGr = 100; //Мороженое-пломбир — 2 брикета по 100 грамм.
        int allCreamGr = iceCreamGr/iceCream*2;
        byte egg = 4;
        byte eggGr = 70; //Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        int allEggGr = egg*eggGr;
        int allGr = allBananaGr + allMilkGr + allCreamGr + allEggGr;
        System.out.println("Всего " +allGr+"гр");
        float allKg = allGr/1000f;
        System.out.println("Всего " +allKg+"кг");

        //задача 7

        byte allKg1 = 7;
        int allGr1 = allKg1*1000;
        int Day1 = 250;
        int Day2 = 500;
        int allDay1 = allGr1/Day1;
        System.out.println("Всего " +allDay1+"дней");
        int allDay2 = allGr1/Day2;
        System.out.println("Всего " +allDay2+"дней");
        int allDay3 = (allDay2+allDay1)/2;
        System.out.println("Всего в среднем " +allDay3+"день");

        //задача 8

        int Mawa = 67760; //Маша получает 67 760 рублей в месяц.
        int Deni = 83690; //Денис получает 83 690 рублей в месяц.
        int Kris = 76230; //Кристина получает 76 230 рублей в месяц.
                         // повышение 10% (от фактической зарплаты) кто работает  в компании дольше 3 лет
        int year = 12; // год - кол-во месяцев

        int Mawa10 = (int) (0.1*Mawa)+Mawa;
        System.out.println("Прибавка 10% = " +Mawa10+"т.р. в месяц"); //Каждому нужно увеличить зарплату на 10% от текущей месячной
        int Deni10 = (int) (0.1*Deni)+Deni;
        System.out.println("Прибавка 10% = " +Deni10+"т.р. в месяц"); //Каждому нужно увеличить зарплату на 10% от текущей месячной
        int Kris10 = (int) (0.1*Kris)+Kris;
        System.out.println("Прибавка 10% = " +Kris10+"т.р. в месяц"); //Каждому нужно увеличить зарплату на 10% от текущей месячной
        int yearMawa = Mawa*year ; //годовым доходом
        int yearDeni = Deni*year ; //годовым доходом
        int yearKris = Kris*year ; //годовым доходом
        int yearMawa10 = Mawa10*year ; //после повышения
        System.out.println (yearMawa10);
        int yearDeni10 = Deni10*year ; //после повышения
        System.out.println (yearDeni10);
        int yearKris10 = Kris10*year ; //после повышения
        System.out.println (yearKris10);
        int resultMawa = yearMawa10%yearMawa;
        System.out.println ("Разницу между годовым доходом с нынешней зарплатой " +yearMawa+" и после повышения "+yearMawa10+" = "+resultMawa+ "т.р." );
        int resultDeni = yearDeni10%yearDeni;
        System.out.println ("Разницу между годовым доходом с нынешней зарплатой " +yearDeni+" и после повышения "+yearDeni10+" = "+resultDeni+ "т.р." );
        int resultKris = yearKris10%yearKris;
        System.out.println ("Разницу между годовым доходом с нынешней зарплатой " +yearKris+" и после повышения "+yearKris10+"= "+resultKris+ "т.р." );
        System.out.println ("Маша теперь получает "+Mawa10+ " рублей. Годовой доход вырос на " +resultMawa+ " рублей");
        System.out.println ("Денис теперь получает "+Deni10+ " рублей. Годовой доход вырос на " +resultDeni+ " рублей");
        System.out.println ("Кристина теперь получает "+Kris10+ " рублей. Годовой доход вырос на " +resultKris+ " рублей");
    }
}
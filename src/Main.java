public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        System.out.println ("переменная dog = " +dog);
        var cat = 3.6;
        System.out.println ("переменная cat = " +cat);
        var paper = 763789;
        System.out.println ("переменная paper = " +paper);
        //Задача 2
        var dog1 = dog + 4;
        System.out.println ("переменная dog = " +dog1);
        var cat1 = cat + 4;
        System.out.println ("переменная cat = " +cat1);
        var paper1 = paper + 4;
        System.out.println ("переменная paper = " +paper1);
        //задача 3
        var dog2 = dog1 - 3.5;
        System.out.println ("переменная dog = " +dog2);
        var cat2 = cat1 - 1.6;
        System.out.println ("переменная cat = " +cat2);
        var paper2 = paper1 - 7639;
        System.out.println ("переменная paper = " +paper2);
        //задача 4
        var friend = 19;
        System.out.println ("переменная friend = " +friend);
        var friend1 = friend + 2;
        System.out.println ("переменная friend = " +friend1);
        var friend2 = friend1 / 7;
        System.out.println ("переменная friend = " +friend2);
        //задача 5
        var frog = 3.5;
        System.out.println ("переменная frog = " +frog);
        frog = frog * 10;
        System.out.println ("переменная frog = " +frog);
        frog = frog / 3.5;
        System.out.println ("переменная frog = " +frog);
        frog = frog + 4;
        System.out.println ("переменная frog = " +frog);
        //задача 6
        var Boxer1 = 78.2;
        System.out.println ("Вес Боксера 1 = " +Boxer1+ "кг");
        var Boxer2 = 82.7;
        System.out.println ("Вес Боксера 2 = " +Boxer2+ "кг");
        var result = Boxer1 + Boxer2;
        System.out.println ("Вес Боксера 1 + Вес Боксера 2 = "+ result+ "кг" ); // Вес Боксера 1 + Вес Боксера 2 =
        var difference = Boxer2%Boxer1;
        System.out.println ("Разница между Вес Боксера 1 и Вес Боксера 2 = "+ difference+ "кг" );
        //задача 7
        var scales1 = 18.2;
        System.out.println ("Весы 1 = " +scales1+ "кг");
        var scales2 = 12.7;
        System.out.println ("Весы 2 = " +scales2+ "кг");
        var result10 = scales2%scales1;
        System.out.println ("Разница между Весы 1 и Весы 2 = "+result10+ "кг" );
        //задача 8
        var watch = 640;
        System.out.println ("Всего Часов = " +watch);
        var workingHours = 8;
        System.out.println ("Всего Часов = " +workingHours);
        var result20 = watch / workingHours;
        System.out.println ("Всего работников в компании — " + result20+ " человек" );
        var additionalWorkers = 94;
        System.out.println ("Дополнительно еще = " +additionalWorkers+ " человека");
        var result21 = result20 + additionalWorkers;
        System.out.println ("Всего человек на фирме теперь = " +result21+ " человека");
        var requiredTime = watch / result21 ;
        System.out.println ("Если в компании работает = " +result21+ " человек, то всего по " +requiredTime+ " часов работы может быть поделено между сотрудниками");
    }
}
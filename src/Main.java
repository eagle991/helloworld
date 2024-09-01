public class Main {
    public static void main(String[] args) {
//задача 1
        {
            int age = 19;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            }
        }
        {
            int age = 17;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        //Задача 2
        {
            int temp = 4;
            if (temp < 5) {
                System.out.println("На улице холодно, нужно надеть шапку "+temp+" градуса");
            }else {
                System.out.println("Сегодня тепло, можно идти без шапки "+temp+" градусов");
            }
        }
        //задача 3
        {
            int speed = 59;
            if (speed >= 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", можно ездить спокойно");
            }
        }
        {
            int speed = 61;
            if (speed >= 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", можно ездить спокойно");
            }
        }
        //задача 4
        {
            int age = 55;
            if (age >= 2 && age <=6){
                System.out.println("Если возраст человека равен"+age+", то ему нужно ходить в детский сад");
            }
            if (age >= 7 && age <=17) {
                System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в школу");
            }
            if (age >= 18 && age <=24) {
                System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в университет");
            }
            if (age > 24 ) {
                System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить на работу");
            }
        }
        //задача 5
        {
            int age = 7;
            if (age < 5) {
                System.out.println("Если возраст человека равен " + age + ", то ему можно кататься");
            }
            if(age >= 5 && age <14) {
                System.out.println("Если возраст человека равен " + age + ", то ему нельзя кататься в сопровождении");
            }
            if(age > 14) {
                System.out.println("Если возраст человека равен " + age + ", то ему можно кататься без сопровождения");
            }
        }

        //задача 6
        {
            int places = 102;
            int sitPlace = 60;
            int people = 110;
            if (place < sitPlace) {
                {
                    System.out.println("в вагоне есть сидячие места");
                }
                if (people >= sitPlace && people < places) {
                    System.out.println("в вагоне есть стоячие места");
                }
                if (people >= places) {
                    System.out.println("в вагоне нет мест");
                }
            }
            //задача 7
            {
                int one = 10;
                int two = 5;
                int three = 30;
                if (one >= two && one >= three) {
                    System.out.println("Самое большое число - " +one);
                } else {
                    if(two >= three) {
                        System.out.println("Самое большое число - " +two);
                    }else{
                        System.out.println("Самое большое число - " +three);
                    }
                }
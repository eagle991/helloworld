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
            }
        }
        {
            int temp = 6;
            if (temp > 5) {
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
            int age = 5;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить в садик");
            }
        }
        {
            int age = 8;
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить в школу");
            }
        }
        {
            int age = 17;
            if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить в университет");
            }
            {
                int age = 25;
                if (age > 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему не нужно ходить на работу");
                }
            }
            //задача 5
            {
                int age = 5;
                boolean teenager1 = age < 5 || age > 14;
                boolean teenager2 = age >= 14;
                if (age >= 5) {
                    System.out.println("Если возраст человека равен " + age + ", то ему можно кататься");
                } if(teenager1)
            {
                System.out.println("Если возраст человека равен " + age + ", то ему нельзя кататься");
            }
                if (teenager2) {
                    System.out.println("Если возраст человека равен " + age + ", то ему можно кататься без сопровождения");
                }
            }
            //задача 6
            int oneWagon = 102;
            int place = 60;
            if (place >= 60)
            {
                System.out.println("остались стоячие места");
            }
            if (place >= 60 && oneWagon <= 102)
            {
                System.out.println("мест нет");
            }
            else
            {
                System.out.println("остались места");
            }
            //задача 7
            {
                int one ;
                int two ;
                int three;
                if (one >= two && one >= three)
                {
                    System.out.println("Самое большое число - " +one);
                }
                else {
                    if(two >= three)
                    {
                        System.out.println("Самое большое число - " +two);
                    }
                    else
                    {
                        System.out.println("Самое большое число - " +three);
                    }
                }
            }



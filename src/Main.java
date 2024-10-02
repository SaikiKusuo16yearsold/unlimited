public class Main {

    public static void main(String[] args) {
        byte age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }


        byte temperature = 6;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }


        byte speed = 52;
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }


        byte year = 13;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в детский сад");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в школу");
        }

        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + " , ему нужно ходить в университет.");

        }
        if (year > 24) {
            System.out.println("Иди на работу");
        }

        byte childAge = 7;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе в сопровождении");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе в сопровождении");
        }

        byte totalSeats = 102;
        byte occupiedPlaces = 30;
        byte seats = 60;
        if (totalSeats > occupiedPlaces) {
            if (occupiedPlaces < seats) {
                System.out.println("Есть сидячие места");

            } else {
                System.out.println("Есть только стоячие места");
            }
        } else {
            System.out.println("Вагон полностью забит");
        }


        int one = 10;
        int two = 11;
        int three = 4;
        if (one > two && one > three) {
            System.out.println("Самое большое число под номером 1 и оно равно " + one);
        } else {
            if (two > three && two > one) {
                System.out.println("Самое большое число под номером 2 и оно равно " + two);
            }
            if (three > one && three > two) {
                System.out.println("Самое большое число под номером 3 и оно равно " + three);
            }
        }

    }
}
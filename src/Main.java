public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 6,задача 4:");
        double deliveryDistance = 1000;
        int deliveryTime1 = 1;
        int deliveryTime2 = 2;
        int deliveryTime3 = 3;


        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime1 + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryTime2 + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliveryTime3 + " дня");
        } else {
            System.out.println("На указанное расстояние доставка не производится, для получения карты посетите офис банка.");
        }

        System.out.println("Домашка 6,задача 5:");
        int monthNumber = 10;
        if (monthNumber > 12) {
            System.out.println("Нет такого месяца."); // если перенести после блока switch, условие не работает.
        }
               if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Это зимний месяц.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весенний месяц.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это летний месяц.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осенний месяц.");
                    break;
                                }

            }
                    }
        }



public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 6,задача 1:");
       int clientOS = 1;
       int year = 2010;
       boolean yearOSFull = year > 2015;
        boolean yearOSLite = year < 2015;
        if (yearOSFull) {
       switch (clientOS) {
           case 0:
               System.out.println("Установите версию приложения для iOS по ссылке.");
               break;
               case 1:
           System.out.println("Установите версию приложения для Android по ссылке.");
           break;
       }
       }
        if (yearOSLite) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
                    break;
            }
        }
       }
    }

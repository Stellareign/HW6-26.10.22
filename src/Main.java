public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 6,задача 3:");
       int year = 2021;
        double liapYear1 =  year % 4;
        double liapYear2 =  year % 400;
        double noLiapYear = year % 100;
       if (noLiapYear != 0 && liapYear1 == 0 || liapYear2 == 0) {

           System.out.println("Этот год високосный.");
       }
       else {
           System.out.println("Этот год не високосный.");
       }


              }
       }

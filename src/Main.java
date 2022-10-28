public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 6,задача 4:");
       double deliveryDistance = 1000;
        int deliveryTime1 = 1;
        int deliveryTime2 = 2;
        int deliveryTime3 = 3;


       if (deliveryDistance < 20) {
        System.out.println("Потребуется дней: " + deliveryTime1 + " день");
       }
       else if (deliveryDistance >=20 && deliveryDistance < 60){
           System.out.println("Потребуется дней: " + deliveryTime2 + " дня");
       }
       else if (deliveryDistance >=60 && deliveryDistance < 100) {
           System.out.println("Потребуется дней: " + deliveryTime3 + " дня");
       }
        else  {
               System.out.println("На указанное расстояние доставка не производится, для получения карты посетите офис банка.");
       }
              }
       }

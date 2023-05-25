package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // If
        int hour = 15;
        if (hour < 14) {
            System.out.println("아아 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 10;
        boolean morningCoffee = false; //모닝 커피
        if (hour < 14 && morningCoffee == false) {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아아 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}

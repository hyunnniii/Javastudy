package chap_04;

public class _11_Break {
    public static void main(String[] args) {
        //Break

        int max = 20;
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왓슴요");
            if (i == max) {
                System.out.println("재료 모두소진..ㅠㅠ");
                break;
            }
        }
        System.out.println("영업종료");

        System.out.println("---------------------------------");

        int index = 1;
        while (index <=50) {
            System.out.println(index +"번 손님, 치킨나왓슴요");
            if (index==max) {
                System.out.println("재료소진..ㅠㅠ");
                break;
            }
            index++;
        }
    }
}

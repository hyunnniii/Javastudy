package chap_04;

public class _05_SwitchCase {
    public static void main(String[] args) {
        //If else: 범위 또는 다양한 케이스

        int ranking = 1;
        if (ranking ==1) {
            System.out.println("전액");
        } else if (ranking ==2) {
            System.out.println("반액");

        } else if (ranking ==3) {
            System.out.println("반액");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        //Switch Case 문 이용 -> 명확한 케이스
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2:
                System.out.println("반액");
                break;
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        //Case 2하고 3 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        //중고상품 등급 1~4
        int grade = 3;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의가격 :" + price + "원");


    }
}

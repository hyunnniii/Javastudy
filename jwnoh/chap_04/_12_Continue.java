package chap_04;

public class _12_Continue {
    public static void main(String[] args) {
        // Continue

        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //노쇼등장!!
            if (i == noShow) {
                System.out.println(i + "번 손님, 번호 넘어가용..");
                continue; // 그 즉시 동작 멈추고 다음 회차로 넘어가게 된다.
            }
            sold++;
            if (sold == max) {
                System.out.println("재료소진..ㅠㅠ");
                break;
            }
        }
        System.out.println("영업종료..ㅠㅠ");

        System.out.println("---------------------------------");

        sold = 0;
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            //노쇼등장!!!
            if (index==noShow) {
                System.out.println("치킨 사라져용..");
                index++; //while은 그대로 continue 되어버리면 count 수가 늘어나지 않아 계속 17번 노쇼손님 기다림..ㅠㅠ
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("재료소진..ㅠㅠ");
                break;
            }
            index++;
        }
        System.out.println("영업종료..ㅠㅠ");
    }
}

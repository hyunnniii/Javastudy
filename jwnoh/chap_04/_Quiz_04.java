package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 8;
        boolean isSmall = true;
        boolean isDisabled = false;
        int fee = hour * 4000;

        if (fee >30000) {
            fee = 30000;
        }

        if (isDisabled || isSmall) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "입니다.");
    }
}

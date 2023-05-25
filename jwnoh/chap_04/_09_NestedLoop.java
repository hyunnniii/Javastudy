package chap_04;

public class _09_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //* 사각형 만들기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        //삼각형
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

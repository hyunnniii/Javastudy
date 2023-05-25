package chap_04;

public class _04_ElseIf {
    public static void main(String[] args) {
        // ElseIf

        boolean a = true;
        boolean b = true;

        if (a) {
            System.out.println("a +1");
        } else if (b) {
            System.out.println("b+1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //else if는 여러번 사용 가능

        a = false;
        b = false;
        boolean c= true;

        if (a) {
            System.out.println("a +1");
        } else if (b) {
            System.out.println("b +1");
        } else if (c) {
            System.out.println("c +1");
        } else {
            System.out.println("아아 +1");
        }
        System.out.println("커피 주문 완료 #2");

        //else는 없어도 가능

        a = false;
        b = false;
        c= false;

        if (a) {
            System.out.println("a +1");
        } else if (b) {
            System.out.println("b +1");
        } else if (c) {
            System.out.println("c +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}

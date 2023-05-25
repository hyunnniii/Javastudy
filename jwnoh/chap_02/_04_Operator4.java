package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean a = true;
        boolean b = true;
        boolean c = true;

        System.out.println(a || b || c); //하나라도 true
        System.out.println(a && b && c); //모두 true

        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false

        System.out.println((5 > 3) || (3 > 1)); //true
        System.out.println((5 > 3) || (3 < 2)); //true
        System.out.println((5 < 3) || (3 < 2)); //false

        //논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true
    }
}

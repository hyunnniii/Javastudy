package chap_04;

public class _06_For {
    public static void main(String[] args) {
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");

        //what if comment changes?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");

        //what if name changes?
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");

        //For 사용
        for ( int i = 0; i < 10; i++) {
            System.out.println("환영합니다. 나코입니다. " + i);
        }

        //for even numbers
        for (int i =0; i <10 ; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        //1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}

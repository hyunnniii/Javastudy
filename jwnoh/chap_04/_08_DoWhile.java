package chap_04;

public class _08_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("이동거리는 " + move);
            move += 3;
        }
        System.out.println("도착했습니당");

        System.out.println("-----반복문#1-----");

        //height is too high
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("이동거리는 " + move);
            move += 3;
        }
        System.out.println("도착했습니당");

        //Do while
        do {
            System.out.println("현재 이동거리는" + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니당.");
    }
}

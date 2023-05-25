package chap_04;

public class _07_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25;
        int move = 0;
        while (move < distance) {
            System.out.println("현재 이동거리 :" + move);
            move += 3;
        }
        System.out.println("도착함요");

        move = 0;
        while (move < distance) {
            System.out.println("현재 이동거리 :" + move);
//            move += 3;
        }
        System.out.println("도착함요");
    }
}

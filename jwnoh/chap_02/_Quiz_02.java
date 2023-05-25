package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int min = 120;
        int height= 140;
        String result = (height >= min) ? "키가 "+ height + "이므로 탑승 가능합니다." : "키가 "+ height + "이므로 탑승 불가능합니다.";
        System.out.println(result);
    }
}

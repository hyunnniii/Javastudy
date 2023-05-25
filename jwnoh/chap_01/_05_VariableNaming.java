package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
//        변수 이름 짓는 법
//        1. 저장할 값에 어울리는 이름
//        밑줄, 문자, 숫자 사용 가능
//        밑줄 또는 문자로 시작 가능
//        한 단어 또는 2개 이상 단어의 연속
//        소문자로 시작, 각 단어의 시작 글자는 대문자
//        예약어 사용 불가 (public, static, void, int , double, float,..)

//        입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "현성";
        String lastName = "김";
        String dateOfBirth = "2001-12-31";
        String residentialAdress = "호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";

//        절대 변하지 않는 상수는 대문자
        final String CODE = "KR";
    }
}

package day08;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

//        - 자바의 리터럴 : 객체가 아닌 순수 데이터 = 3, 3.14, 'a', true 등등
//        문자열이란 ? 문자 2개이상, 문자char : ' ' 감싼, 문자열 String : " " 감싼
//        변수1 == 변수2 : 두 변수가 갖는 ( 리터럴 ) 비교  , 리터럴 비교시에는 연산자가능
//        변수1.equals(변수2) : 두 변수가 갖는 ( 객체주소 ) 비교    , 객체 비교시에는 연산자 불가능
//        [1]문자
            char c = '김';
        System.out.println("김 = " + c);

//        [2]문자열
//        1. " " 감싼 문자열은 리터럴로 상수 처리
        String str1 = "김민재";
        System.out.println("str1 = " + str1);

        String str2 = "김민재";
        System.out.println("str2 = " + str2);

//        2. new String("문자열") 힙영역(객체) 생성
        String str3 = new String("김민재");
        System.out.println("str3 == " + str3);

//        3. 객체내 '김민재' 가 리터럴 '김민재' 비교
        System.out.println("str3.equals(\"김민재\") = " + str3.equals("김민재"));

//        [3] 자주 사용되는 문자열 함수
//        1. "".charAt(index) : 해당 인덱스번호의 문자 1개 반환

        String ssn = "123456-1234567"; // 문자열타입
        char gender = ssn.charAt(7);
        switch ( gender ){
            case '1' :
            case '3' :
                System.out.println("gender = 남 ");
                break;
            case '2':
            case 4 :
                System.out.println("gender = 여 ");
                break;

//        1. 문자 입력받기
        }
        Scanner sc = new Scanner(System.in); // 입력객체
        char _c = sc.next().charAt(0); // 문자열에서 0번째 인덱스 반환 , 문자 1개

//        2. 문자열의 길이
        System.out.println("ssn.length() = " + ssn.length());
            // -
        for (int i = 0; i < ssn.length(); i++) {
            System.out.println("문자 1개씩 추출 : " + ssn.charAt(i));
        }

//            3. "".replace ( "기존문자" , "새로운문자") : 기존문자를 새로운 문자로 치환/교체 반환
        String oldStr  = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다";
        String newStr = oldStr.replace("자바", "JAVA"); // 자바 -> JAVA로 치환 후 반환

        System.out.println("oldStr = " + oldStr);
        System.out.println("newStr = " + newStr);

//        - 특정 불필요한 데이터 대체 : 서로ㅓ 다른 프로그래밍 언어들간의 형식 변경할때 주로 사용
//        html 언어에서는 <br/> 줄바꿈인데 자바에서는 \n이 줄바꿈이기 때문에 치환


//      4. " ".subString(시작인덱스 , 끝인덱스) : 문자열 잘라내기
//              끝 인덱스는 생략 가능
        String ssn2 = "991107-1234567";
        String firstNum = ssn2.substring(0,6);
        System.out.println("firstNum = " + firstNum);

        String endNum = ssn2.substring(7);
        System.out.println("endNum = " + endNum);

//      5. " ".split("구분문자") : 문자열 분해하기
        System.out.println("ssn2.split(\"-\") = " + ssn2.split("-"));
        String[] strArray = ssn2.split("-");
        System.out.println("strArray[0] = " + strArray[0]);
        System.out.println("strArray[1] = " + strArray[1]);

//      6. " ".indexOf("찾을문자") : 문자열 내 찾을 문자 검색, 찾았으면 찾은 인덱스 반환, 없으면 -1 반환
        String subject = "자바 프로그래밍";
        int findIndex = subject.indexOf("자바");
        System.out.println("findIndex = " + findIndex); // 0 : 찾을 문자가 첫번째 인덱스에 존재한다.

//      7. " ".contains("찾을문자") : 문자열 내 찾을 문자 검색, 찾았으면 true 반환, 못찾았으면 false 반환
        boolean findCheck = subject.contains("자바");
        System.out.println("findCheck = " + findCheck); // true : 찾을 문자가 문자열 내 존재 = true

//      8. " ".getBytes() : 문자열 내 문자 하나씩 바이트로 변환 후 바이트 배열로 반환
        System.out.println("subject = " + subject.getBytes());
        byte[] bytes = subject.getBytes();
        System.out.println("bytes = " + bytes);

//      9. new String (바이트배열) : 해당 바이트 배열을 문자열로 반환
        String str4 = new String(bytes  );
        System.out.println("str4 = " + str4);

//      문자와 바이트의 관계
//        1. 영문 / 특수문자 : 한 글자 당 -> 1바이트
//        2. 한글 : 한 글자 당 -> 2바이트 + 1바이트(헤더:UTF-8정보, 자릿수) => 3바이트

        byte b1 = 'a';
        System.out.println("b1 = " + b1); // 97 : 'a'  // 1바이트 : 아스키코드
        char ch1 = 65;
        System.out.println("ch1 = " + ch1); // 65 : 'A'  // 2바이트 : 유니코드, 65536글자, short +-3만
        char ch2 = '가';
        int in1 = ch2;
        System.out.println("in1 = " + in1); // 44032 : '가'  // 4바이트

        System.out.println("가".getBytes().length);  // 3
        System.out.println("a".getBytes().length);  // 1

//       원래 한글 문자는 기본적으로 지원되지 않기 때문에 EUC-KR, * URF-8 * 을 이용한 인코딩이 필요하다
        try {
            String eucStr = new String("자바".getBytes(), "EUC-KR");
            System.out.println("EUC-KR = " + eucStr);
            String utfStr = new String("자바".getBytes(), "UTF-8");
            System.out.println("UTF-8 = " + utfStr);
        }catch (Exception e) {
            System.out.println("e + " + e);
        }













    }
}

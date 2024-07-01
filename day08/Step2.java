package day08;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        // 금액을 입력받아 천단위  쉼표가 포함된 형식으로 출력하시오
        Scanner sc = new Scanner(System.in);
        System.out.print("금액 입력 : ");
        String price = sc.next();
//        천단위 쉼표가 포함된 문자열을 저장할 변수
        String result = "";
//        입력받은 문자열을 반복문으로 통해 문자 하나씩 순회
//        i는 0부터 입력받은 문자길이까지 1씩 증가 반복
        for (int i = 0; i < price.length(); i++) {
//            System.out.println("i = " + i); // i 출력
//            System.out.println("price.charAt(i) = " + price.charAt(i)); // i 번째 문자 출력
            System.out.println("price.length() - i = " + (price.length() - 1));
            if (i > 0 && (price.length() - i) % 3 == 0) {// 배수 찾기 : 값 % 배수 == 0, 나머지가 0이면 값은 그 배수
                result += ",";
            }
            result += price.charAt(i);
            System.out.println("result = " + result);


        }
        System.out.println("result = " + result);
        System.out.println("price = " + price);
    }
}

package day03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 복습 {
    public static void main(String[] args) {
        //입력객체
        Scanner sc = new Scanner(System.in);

        //무한반복/루프
        while (true){
            //입력객체를 이용한 키보드로부터 입력값을
            //정수형타입으로 반환해서 ch 변수에 대임
            //!!!)만일 입력값이 문자이면 오류발생
            System.out.print("정수만 입력하세요 : ");
            try {
                int ch = sc.nextInt();
            }catch ( InputMismatchException e){
                System.out.println("정수만 입력이 가능합니다.");
            }finally {
                //예외가 있던 없던 기존에 키보드로 입력된 값을 가지고 있는 객체 초기화
                sc = new Scanner(System.in);
            }

        }
    }
}

package day04;

import java.util.Scanner;
/*
* 실습1
* 1. Product 객체가 여러개 저장되는 하나의 배열을 선언하고
* 2. 배열 내 Product 객체는 무한정 저장될수 있도록 가변 길이로 구현
* 3. Product 객체 내에는 제품명 , 제품가격이 저장될수 있도록 구현
* [기능]
*   1. ADD : 제품명과 제품가격을 입력받아 Product 객체 생성 후 배열에 저장
*   2. list : 배열내 저장된 Product 객체 모두 출력
*   3. delete : 삭제 할 제품명을 입력받아 동일한 제품명이 존재하면 배열 내 삭제
* */

public class Step2 {
    public static void main(String[] args) {
        // 2. 입력 객체
        Scanner sc = new Scanner(System.in);
        // 1. 무한 반복
        int length = 0;
        Product[] products = new Product[length];

        while (true){
            System.out.println("1.제품등록 2.제품목록 3.제품삭제 선택]");
            int ch = sc.nextInt();
            if ( ch == 1){
                String name = sc.next();
                int price = sc.nextInt();
                Product product = new Product();
                product.name = name;
                product.price = price;
                length++;
                Product[] newProductArray = new Product[length];
                // 기존 배열에 있는 값을 ㅅ ㅐ로운 배열에 카피/복사/이동
                // 4. 새로운 배열 내 마지막 인덱스에 생성된 객체 대입
                // 5. 새로운 배열을 기존 배열에 대입


            } else if (ch == 2) {

            } else if (ch == 3) {

            }
        }
    }
}

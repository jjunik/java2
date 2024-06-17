package day03;

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {
        // 상황 : 제품(제품번호, 제품명, 가격) 3개 관리하는 프로그램
        // 장사가 잘 되면 제품 개수는 무한히 많아질수도있음

        // [1] 변수 활용 : 변수에는 하나의 자료/데이터만 저장 가능
        int pno1 = 1; String pname1 = "사이다"; int price1 = 3000;
        int pno2 = 2; String pname2 = "콜라"; int price2 = 2000;
        int pno3 = 3; String pname3 = "환타"; int price3 = 1000;
        // [2] 배열활용 : 배열에는 여러개의 동일한 타입 자료/데이터 저장가능
        // -
        int[] noArray = {1, 2, 3};
        String[] nameArray = {"사이다", "콜라", "환타"};
        int[] priceArray = {3000, 2000, 1000};
        // [3] 객체와 배열의 활용
        Product p1 = new Product(1, "사이다", 3000);
        Product p2 = new Product(2, "콜라", 2000);
        Product p3 = new Product(3, "환타", 1000);
        Product[] productArray = { p1, p2, p3};

        // [4] Step3 이후에 작성한 코드
        List< Product > productList = new ArrayList<>();



    }
}

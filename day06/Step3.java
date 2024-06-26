package day06;

import java.util.Scanner;
import java.util.TreeMap;

public class Step3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeMap<String , Integer> treeMap = new TreeMap<>();

        while (true) {
            System.out.println("1.등록 2.출력");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("제품명과 가격 입력 : ");
                treeMap.put(sc.next() , sc.nextInt());
            }
            else if ( ch == 2){
                treeMap.entrySet().forEach(entry -> {
                    System.out.print("제품명 = " + entry.getKey());
                    System.out.print("가격 = " + entry.getValue());
                    System.out.println();
                });


            }
        }
    }
}

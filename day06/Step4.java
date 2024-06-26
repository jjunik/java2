package day06;

import java.util.TreeSet;

public class Step4 {
    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>();
//        TreeSet<제네릭> 제네릭타입이 기본타입이면 정렬기준을 정의하지않아도 된다.
//                       제네렉타입이 참조 타입이면 정렬기준을 정의 해야한다.
//        -> 해당 참조 타입입에 Comparable 인터페이스를 implements 해서 compareTo 메소드 재정의
        treeSet.add( new Person("홍길동" , 29));
        treeSet.add( new Person("김자바" , 25));
        treeSet.add( new Person("박지원" , 31));
        System.out.println("treeSet = " + treeSet);
    }
}

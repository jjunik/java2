package day02;
// 컴파일: class단위로 번역
// 인터프리터: 한 줄씩 번역
public class Step1 {
    //자바는 실행할때 class단위로 실행해서 번역 .class파일생성
    // main()함수: 내장된 주요기능(스레드: 코드를 읽어주는 흐름 단위)(스레드 1개)
    /*
        - 오류나 예외는 일반적으로 발생시 컴퓨터가 꺼지거나 프로그램 종료
        - 24시간 문제가 발생해도 종료되지 않고 안전하게 프로그램이 유지 될 수 있도록 처리
        - 예외가 발생하면 다른 흐름으로 코드의 흐름을 변경
         오류[Error]: 개발자가 예측할수도 없는 심각한 문제 (하드웨어: 메모리/JVM)

        예외[Exception]: 개발자가 구현한 로직 혹은 사용자의 실수

            1. 일반예외: 컴파일러가 코드를 검사하는 예외
                - 자바 외 프로그램에 연결된 함수나 클래스들을 사용할때
                - 파일처리, JDBC, 네트워크, 입출력 등등
                - 일반예외가 발생 할 것 같으면 코드에서 예외처리 하라고 자동권장

            2. 실행예외: 컴파일러가 코드를 검사하지 않는 예외
                - 실행 도중에 오류가 발생하는것 - 개발자의 경험에 의존
                - 타입오류, 인덱스, * NULL *
                    - NullPointerException *

            try{
            예외 발생하거나 발생할 것 같은(실행예외)
            }
    * */
    // 1.일반예외
    public static void main(String[] args) {
        // Class : class에 관련 메소드/기능/방법 제공
        // Class.forName(): static 으로 선언된 함수이므로 객체가 필요없다
        // forName(): class 파일 호출 (존재할수도 있고 존재 안 할수도)
        // 일반예외 발생
        try {
            Class.forName("java.lang.String"); //예외 발생 x
            Class.forName("java.lang.String2"); //예외 발생 o
        }catch (ClassNotFoundException e) { // 예외가 발생하면 실행, 예외가 발생하지 않으면 실행 안됨
            System.out.println("e: " + e);
        }
    // 2.실행예외
        String str = "ThisIsJava";
        String obj = null; // "" vs null vs 0 vs 초기화없음

        int count = str.length();
        System.out.println("count: " + count);
    try {
        count = obj.length();   // "obj" is null : static이 없는 함수는 객체가 필요하다. null은 불가능
        System.out.println(count);
    }catch (NullPointerException e){
        System.out.println("e: "+ e);
    }
    // 3.다중 catch vs 여러개 try catch
        String[] array = {"100", "1aa"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
            }catch (NumberFormatException e){
                System.out.println("e: 문자가 포함된 문자열은 정수형 변환이 불가능해");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(">> 존재하지 않는 배열의 인덱스 입니다.");
            }catch (Exception e){ // Exception: 위에 있는 예외 클래스들의 상위 클래스이다.
                System.out.println(e);
            }finally { // try에 예외가 있던 말던 실행되는 구역
                System.out.println("예외가 있어도 없어도 실행되는 구역입니다.");
            }
            // Integer.parseInt(): 매개변수값을 정수형으로 변환해서 반환해주는 함수
            // 첫글자 대문자 = 클래스 , 클래스명.함수명() : 정적멤버 (함수에 static선언)

        }



    }
}

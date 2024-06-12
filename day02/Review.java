package day02;

public class Review {
    public static void main(String[] args) {
        /*
            데이터 : 리터럴(개발자가 직접 입력한 순수 값)
                   ex) 3, 'a', 3.14, true, false

            데이터 타입/형식 : 기본자료형 / 타입
            기본타입 :
                boolean, char, byte, short, int, long, float, double

            참조타입 : 객체를 참조
                클래스, 배열, 인터페이스, 열거타입

        **/
        boolean _boolean = true;
        char _char =  'a';
        byte _byte = 123;
        short _short = 30000;
        int _int = 2000000;
        long _long = 200000000000L;
        float _float =  3.121352451F;
        double _double =  3.121532461;

        // int 3개 저장할래 = int[] array = new int[3];
        // int , double, char  각 3개를 저장할래  --> 3개 저장하는 타입은 없읎
        TotalType totalType = new TotalType();
        totalType.a = 20000;
        totalType.b = 3.14;
        totalType.c = 'a';

    }
}

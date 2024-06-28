package day07;

import java.awt.*;
public class Step2 {
public static void main(String[] args) {
    // [2]
    //Thread thread = new Thread(); // 객체생성
    //Thread thread = new Thread(){ 오버라이딩 };
    Thread thread = new Thread(){
        @Override
        public void run() {
            Toolkit kit = Toolkit.getDefaultToolkit();
            for( int i = 0 ; i < 5 ; i++ ){
                kit.beep();
                try{
                    Thread.sleep(1000);}catch (Exception e ){
                    System.out.println( e );
                }
            } // for end
        }
    }; // run 재정의
    thread.start(); // run 메소드 실행

    // 5번 문자열 출력
    for( int i = 0 ; i < 5 ; i++ ){
        System.out.println("띵");
        try{ Thread.sleep(1000); } catch ( Exception e ){
            System.out.println(e);
        }
    }

}
}


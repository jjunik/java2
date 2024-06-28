package day07;

import java.time.LocalTime;

//public class DigitalTime extends Thread{}
public class DigitalTime implements Runnable {
    // 오버라이딩 : extends , implements 했을때 물려받은 메소드 또는 추상 메소드를 재정의 / 구현
    // 오버로딩 : 동일한 메소드/생성자 명으로 여러개 선언 가능한 기법 제공
        // 매개변수의 타입, 개수, 순서에 따라 식별 가능하도록 만드는 기법
        // - 결론 : 매개변수의 타입, 개수, 순서가 다르면 메소드/생성자 명은 같아도된다.
    @Override
    public void run() {
        // ============= 멀티스레드가 처리할 코드들 =============
        while (true) { // 1초간 일시정지 하면서 무한루프 (출력)
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000); // 1초간 일시정지
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

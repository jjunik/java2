package day07;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        // [1] 전자시계 (현재시간)

        // 1. run 메소드를 구현한 클래스의 객체 생성
        DigitalTime digitalTime = new DigitalTime();

        // 2. run 메소드 구현한 클래스의 객체를 Thread 생성자에 대입
        Thread thread = new Thread( digitalTime );

        // 3. run 메소드를 실행 --> .start()
        thread.start();

        // [2] 타이머 설정 기능
        Scanner sc = new Scanner(System.in);

        boolean timerState = false; // false 중지상태 , true 실행상태
        Thread thread2 = null;
        Timer timer = null;
        while (true){
            System.out.println("1.start : 2.stop");
            int ch = sc.nextInt();
            if (ch == 1 && timerState == false){ // 타이머가 중지일때만
                timer = new Timer();
                thread2 = new Thread(timer);
                thread2.start();
                timerState = true;

            } else if (ch == 2 && timerState == true) { // 타이머가 실행 중 일때만
//                thread.stop();
//                  - 권장하지 않음. 실행도중에 강제종료라서 안전하게 메모리를 종료할 수 없다.
//                  - 스위치변수 활용해서 on / off true/false 표현식으로 run 메소드를 안전하게 종료
                timer.state = false;
                timerState = false;
            }
        }

    }
}

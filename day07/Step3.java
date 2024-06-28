package day07;

import java.awt.*;

class 비프음 implements Runnable {
    @Override
    public void run() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            kit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            // 빨간줄 / 오류 뜨는 이유 :
        }
    }
}
public class Step3 {
    public static void main(String[] args) {

        비프음 b = new 비프음();
        Thread thread = new Thread(b);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
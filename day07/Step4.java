package day07;

import java.awt.*;

class 비프음2 extends Thread{
    @Override
    public void run() {
        super.run();
        Toolkit kit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            kit.beep();
            try{ Thread.sleep(1000);}catch (Exception e){
                System.out.println( e );}
        }
    }
    }

public class Step4 {
    public static void main(String[] args) {
        비프음2 b2 = new 비프음2();
        b2.start();
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
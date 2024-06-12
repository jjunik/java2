package day02;

public class 잔고부족예외 extends Exception{
    public 잔고부족예외(String msg){
        super(msg); //super() : Exception 클래스의
    }
    //this.필드명, this(), this.메소드명()
    //super.필드명, super(), super.메소드명()
}

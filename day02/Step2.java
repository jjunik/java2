package day02;

public class Step2 {
    // 함수명() throws 예외클래스{}: 예외 던지기, 어디로: 해당 함수를 호출했던 곳으로
    static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }

    public static void main(String[] args) {
        try{
            findClass(); // 함수호출
        }catch (Exception e){

        }















    }
}

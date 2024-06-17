package day03;

public class Step2 {
    public static void main(String[] args) {


        Box box1 = new Box();
        box1.data = 30;
        // ! : box객체 안에 있는 data 타입을 유연하게 사용하고싶다
        // 방안 : Object클래스 (자바내 최상위 클래스)
            // -상속 : 부 --> 자식 (강제 형변환) / 자식 --> 부모 (자동형변환)
        System.out.println(box1.data);

        int result1 = (int)box1.data;

        Box box2 = new Box();
        box2.data = "자바";
        // - 타입이 불일치라서 오류 발생
        // - Object <--- String
        System.out.println(box2.data);

        String result2 = (String)box2.data;

        // 제네릭 :
            // 특정한 타입을 지정하지 않고 유연하게 다양한 종류의 데이터를 처리

        // 제네릭 타입을 가지는 클래스의 객체생성
        Box2<Integer> box3 = new Box2();
        box3.data = 3;
        int result3 = box3.data;

        Box2<String> box4 = new Box2<>();
        box4.data = "자바";
        String result4 = box4.data;

        // 멀티타입
        Box3<Integer,Double> box8 = new Box3<>();
        box8.data1 = 3;
        box8.data2 = 3.14;
        System.out.println(box8.data1 + box8.data2);

        Box3<Integer, String > box9 = new Box3<>();
        box9.data1 = 3;
        box9.data2 = "자바";
        System.out.println(box9.data1 + box9.data2);

        // 제네릭 다형성 제공 : <T extends 상위클래스>
        Dog dog = new Dog();
        dog.name = "퍼피";

        Location<Dog> location = new Location<Dog>();
        location.animal = dog;

        Tiger tiger = new Tiger();
//        Location<Tiger> location2 = new Location<Tiger>();
//        location2.animal = tiger;
        // Tiger 클래스는 Animal 클래스로부터 상속 관계가 아니므로 불가

    }
}

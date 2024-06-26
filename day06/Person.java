package day06;

public class Person implements Comparable<Person> {
//    implements 구현하다
//    인터페이스의 추상메소드를 해당 클래스가 상속받아 구현할 때
//    implements 했을때 무조건 해당 인터페이스의 추상 메소드를 재정의를 해야한다.
//    - 1 멤버 변수
    public String name;
    public int age;
    public double doubel2;
//    - 2 생성자
    public Person(String name, int age  ){
        this.name = name;
        this.age = age;
    }
    // - 3 메소드
//        오른쪽 클릭 - Generate -> toString()
//        객체 출력시 객체의 주소값이 아닌 객체의
    // - 3 메소드

    @Override
    public int compareTo(Person o) {
//        -오름차순 : 같으면 0, 주어진객체보다 적으면 -1, 크면 1
//        -내림차순 : 같으면 0, 주어진객체보다 적으면 1, 크면 -1

//        [1] age 기준으로 정렬 (기본타입 기준으로 정렬)
//        if (this.age < o.age) return -1;
//        else if (this.age == o.age) return 0;
//        else return 1;
//        [2] name 기준으로 정렬 , 문자열 정렬비교는 compareTo() 사용, (참조타입 기준으로 정렬)
//        기준문자열.compareTo(주어진문자열)
//        문자열 정렬비교는 이미 구현된 상태
//        this.name.compareTo( o.name );
//        if (this.name.equals())
       return this.name.compareTo( o.name );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

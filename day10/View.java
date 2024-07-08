package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
// [1] 멤버변수의 생성된 객체참조값을 저장한다. 싱글객체/톤
 private static View view = new View();
// [2] 생성자를 private , 다른 클래스로부터 생성자를 사용하지 못하게 차단한다.
 private View(){}
// [3] 해당 싱글톤을 다른 클래스로부터 간접접근을 허용하기 위한 getter 메소드를 구현한다.
    public static  View getInstance(){return view;}

    private Scanner sc = new Scanner(System.in);

//    public static void index(){
    public void index() {
        System.out.println("---메인 페이지---");
        System.out.print("1.create 2.read 3.update 4.delete : ");
        int ch = sc.nextInt();
        switch ( ch ){
            case 1: create();
                break;
            case 2: read();
                break;
            case 3: update();
                break;
            case 4: delete();
                break;
            default:
                System.out.println(">> 알 수 없는 번호입니다.");
        }
    }

//    [1] 등록 함수
    public void create(){
//        1-1 저장 할 이름을 입력받기
        System.out.print(">> save Name : ");
        String name = sc.next();
//        1-2 컨트롤러에게 입력 받은 이름을 전달 후 결과를 응답 받는다
        boolean result = Controller.getInstance().create(name);
//        1-3 컨트롤러에게 바등ㄴ 응답 데이터 기준으로 출력한다
        if(result){
            System.out.println("save Success");
        }else System.out.println("save fail");
    }
//    [2] 출력 함수
public void read(){
        // 2. 컨트롤러에게 모든 이름을 전달받아 ArrayList에 대입
    ArrayList<String > result = Controller.getInstance().read();
        // 2-2 전달받은 ArrayList를 출력하기
    System.out.println(">> 회원등록 명단");
    for (int i = 0; i < result.size(); i++) {
        System.out.println(result.get(i));

    }
}
//    [3] 수정 함수
public void update(){}
//    [4] 삭제 함수
public void delete(){}
}
package day10;

import java.util.ArrayList;

public class Controller {

//    싱글톤 : 프로젝트 내 해당 클래스의 객체가 단 1개가 존재하는 패턴
    private  static Controller controller = new Controller();
    private Controller(){}
    public static Controller getInstance(){
        return controller;
    }

    //    [1] 등록 함수 : 매개변수 : 입력받은 이름 , 리턴값 : 저장여부
    public boolean create(String name){
        boolean result = Dao.getInstance().create(name);
        return result;
    }
    //    [2] 출력 함수 : 매개변수x , 리턴값 : ArrayList<String> , 여러개의 이름을 반환하기 위해
    public ArrayList<String> read(){
        return Dao.getInstance().read();
    }
    //    [3] 수정 함수
    public void update(){}
    //    [4] 삭제 함수
    public void delete(){}
}

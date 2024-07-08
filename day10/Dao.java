package day10;
//        [0] 싱글톤

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
    private static Dao dao = new Dao();

    private Dao() {
        try {// DB연동
            // [DB연동] mysql 회사에 제공하는 클래스를 호출
            Class.forName("com.mysql.cj.jdbc.Driver");
            // [DB연동] 연동 할 DB 서버의 주소 URL/DB명, 계정명, 비밀번호 대입하여 DB와 연동
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java2day10", "root", "1234");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(">> DB Connection fail");
        }
    }

    public static Dao getInstance() {
        return dao;
    }

    //    JDBC 라이브러리 인터페이스
    Connection conn;    // 데이터베이스 연동하는 인터페이스
    PreparedStatement ps;// 기재된 SQL을 조작/실행 하는 인터페이스
    ResultSet rs;       // 조회/결과를 조작하는 인터페이스

    //    [1] 등록 함수 : 매개변수 : 입력받은 이름 , 리턴값 : 저장여부
    public boolean create(String name) {
        System.out.println(">> Dao까지 도달했다.");
        try {//        1. sql 작성
            String sql = "insert into member(name)values('" + name + "')";
//        2. sql 기재
            ps = conn.prepareStatement(sql);
//        3. 기재된 sql 실행
            ps.executeUpdate();
//        4. 결과
            return true;
        } catch (Exception e) {
            System.out.println(e);

            return false;
        }
    }
    //    [2] 출력 함수 :
    public ArrayList<String> read () {
        ArrayList<String> list = new ArrayList<>(); // 여러개의 String 문자열을 담을 리스트 객체 선언

        try {// 2-0 예외처리 : 일반적으로 JDBC 관련 메소드들은 무조건 일반예외 발생
            // 2-1 sql작성 : 데이터베이스 테이블에 저장된 모든 레코드를 조회하는 SQL임
            String sql = "select * from member";
            // 2-2 작성한 sql을 DB와 연동된 Connection 인터페이스에 기재준비
            ps = conn.prepareStatement(sql);
            // 2-3 sql 실행
            // 2-4 sql 실행 결과를 ResultSet 인터페이스로 반환 받는다
            rs = ps.executeQuery();
            // 2-5 조회결과를 레코드/테이블의 행 하나씩 순화
            while (rs.next()) {
                // 2-6 rs.next() : 조회결과에서 다음 레코드로 이동, 다음 레코드 존재하면 true 없으면 false
                String name = rs.getString("name");
//                System.out.println("레코드의 필드 값 : name" + name);
                // 2-7 rs.get()타입("필드명") : 현재 레코드의 해당하는 필드의 값 호출
                list.add(name);
                // 2-8 레코드 내 필드값을 호출해서 리스트에 저장 ( view 까지 전달하기 위해 모두
            }
            // 2-7 rs.get타입("필드명"); : 현재 레코드의 해당하는 필드의 값 호출
        } catch (Exception e) {
            System.out.println(e);
        } return list;
    }
    //    [3] 수정 함수
    public void update () {
    }
    //    [4] 삭제 함수
    public void delete () {
    }


}
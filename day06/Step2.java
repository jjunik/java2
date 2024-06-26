package day06;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Step2 {
    public static void main(String[] args) {
        //Tree Map
        // Map 컬렉션 : 여러개 entry(key,value) 저장/관리 하는 구조
        Map<String , Integer> map = new HashMap<>();
        map.put("apple" , 100);
        map.put("forever" , 60);
        map.put("description" , 40);
        map.put("ever" , 50);
        map.put("zoo" , 80);
        map.put("base" , 20);
        map.put("guess" , 70);
        map.put("cherry" , 30);
        System.out.println("map = " + map);

        TreeMap<String , Integer> treeMap = new TreeMap<>();
        treeMap.put("apple" , 100);
        treeMap.put("forever" , 60);
        treeMap.put("description" , 40);
        treeMap.put("ever" , 50);
        treeMap.put("zoo" , 80);
        treeMap.put("base" , 20);
        treeMap.put("guess" , 70);
        treeMap.put("cherry" , 30);
        System.out.println("treeMap = " + treeMap);

        // 3. 순회
        treeMap.entrySet().forEach( entry -> {System.out.println("entry = " + entry); });
        // 4. 함수
        System.out.println("treeMap.firstEntry() = " + treeMap.firstEntry() );
        System.out.println("treeMap.lastEntry() = " + treeMap.lastEntry() );
        System.out.println("treeMap.descendingMap() = " + treeMap.descendingMap());
        System.out.println("treeMap.subMap() = " + treeMap.subMap("c", true, "h", true));

    }
}

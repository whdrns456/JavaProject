package map;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Mappractice {
    public static void main(String[] args) {

        //   map <K,V> 특징
        // : key - value 형식으로 데이터를 저장(관리)
        // + key에 해당하는 데이터 : 중복 허용하지 않음(Set 방식)
        // + value에 해당하는 데이터 : 중복이 허용된다 (키 값이 중복되지 않은 경우 중복 허용)
        // + list 방식


        // Map 메소드
        // [1] 데이터 추가 : put(키에 해당하는 값, 밸류에 해당하는 값)
        // [2] 데이터 삭제 : remove(키에 해당하는 값)
        // [3] 데이터 조회 : get(키에 해당하는 값) - keySet (키 목록 조회)
        // [4] keySet (키 목록 조회)
        // [5] 데이터 길이 조회 : size()
        // [6]
        // [7]
        // [8]


        hashMapTest();
    }



    public  static void hashMapTest(){

        // HashMap 객체 선언 및 생성
        // key - 정수형 데이터, Value - 문자열 데이터
        Map<Integer,String> hashMap = new HashMap<>();
        // Map 구조에 데이터를 저장(추가) : put(key,value)

        hashMap.put(1000,"프리티인창");
        hashMap.put(1001,"종군당");
        hashMap.put(1002,"똥피하 기다운 로드");
        // 키 목록 조회 : keySet()
        Set<Integer> keyList = hashMap.keySet();

        System.out.println("----------------------------------");
        // 키 데이터 출력
        for (Integer key : keyList){
            System.out.println(key);}
        // 데이터 조회
        for (Integer key : keyList) {
            System.out.println(key + " : " + hashMap.get(key));}
        // ㄸ피하 기다운 로드 데이터 제거


        System.out.println("------------------------------------");

        hashMap.remove(1001);

        // Iterator 객체를 사용하여 조회
        Iterator<Integer> it = keyList.iterator();

        while (it.hasNext()){
            // 데이터가 있다면 출력하겠다
            int key = it.next();
            System.out.println( key + " : " + hashMap.get(key));
        }

        System.out.println("----------------------------------------------");

        //entrySet() : Key + value 세트의 집합
        Set entrSet = hashMap.entrySet();

        Iterator entryIt = entrSet.iterator();

        while (entryIt.hasNext()){

           Entry entry = (Entry) entryIt.next();

           Integer key = (Integer) entry.getKey();
           String value = (String) entry.getValue();
            System.out.println(key + " : " + value);
        }
        propertiesTest();

    }

    public static void propertiesTest(){
        // PropertiesTest : Map 계열의 콜렉션 --> key + value 한 쌍으로 데이터 저장(관리)
        //

        Properties prop = new Properties();

        prop.put("List","ArrayList");
        prop.put("Set","HashSet");
        prop.put("Map","HashMap");
        prop.put("Map","Properties");

        System.out.println(prop);
        // -- > 저장 순서 x, key 값은 중복되지 않음!(같은 키값인 경우 덮어씌워짐)

        /*
        * Properties : 주로 저장된 데이터를 파일에 출력 또는 입력하여 사용
        * - store(), load() 메소드 사용
        * */

        System.out.println("------------------------------------------");

        Properties prop2 = new Properties();

        try {
            // store : Properties에 저장된 데이터(key - value)를 파일형태로 저장할 때 사용하는 메소드
            prop.store(new FileOutputStream("test.properties"), "propertiesTest");

            // storeToXML() : Properties에 저장된 데이터를 키 밸류를 xml 형식으로 저장할 때 사용하는 메소드
            prop.storeToXML(new FileOutputStream("test.xml"),"xmlTest");

            // load 파일로부터 데이터를 읽어올 때 사용되는 메소드
            prop2.load(new FileInputStream("test.properties"));
            System.out.println(prop2);

            prop2.loadFromXML(new FileInputStream("test.xml"));
            System.out.println(prop2);
            // XML 형식의 파일로부터 데이터를 읽어올 때 사용되는 메소드

        }catch (IOException e){
            System.out.println("[ERROR]" + e.getMessage());
        }


    }



}

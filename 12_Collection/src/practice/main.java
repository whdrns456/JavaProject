package practice;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class main {
    /*
    * set 특징 :
    * - 중복 허용 안됨
    * - 순서 없음
    *
    * 해시(Hash) 알고리즘 : 특정 기준에 따라 데이터를 분류하는 방식(알고리즘)
    * - HashSet :
    * - * 중복 데이터 판단 : equals, hashCode 메소드 :
    * [1] hashCode : 기준이 되는 값(데이터)를 정의
    * [2] equals : hashCode 같이 같을 경우 동일 데이터 판단 로직 정의
    *
    * set 메소드 :
    * - 데이터 추가 : add(데이터)
    * - 데이터 삭제 : remove(데이터)
    * - 데이터 길이 조회 : size()
    * - 데이더 조회
    * [1] Iterator (반복자) 사용
    *   - Iterator 객체 생성 : set_참조변수.iterator();
    *   - 데이터 유/무 판단 : iterator_참조변수.hasNext();
    *   - 데이터 조회 : iterator_참조변수.next();
    *
    * [2] 향상된 for문 (for - each)
    * for(Set에 저장된 데이터 타입(자료형) 변수명 : Set_참조변수명) {
    *   // 변수명을 사용하여 데이터에 접근
    * }
    *
    *
    * */
    public static void main(String[] args) {

        /*
         * Object
         *     - equals() : 두 객체의 주소값을 비교하여 일치하면 true. 일치하지 않으면 false 반환
         *     - hashCode() : 해당 객체의 주소값을 가지고 10진수 형태로 만들어 반환
         * ---------------------------------------------------------------
         * */

        HashSet hSet1 = new HashSet();

        hSet1.add("기다운님 안녕하세요");
        hSet1.add(new String("기다운님 안녕하세요")); // 생성자로 생성
        hSet1.add(new String("여러분"));
        hSet1.add(new String("힘내요"));
        hSet1.add(new String("여러분"));

        System.out.println(hSet1);
        // 저장 순서 유지되지 않음, 중복이 걸러짐!
        // String
        // - equals() : 재정의됨. "실제 담긴  문자열"을 가지고 동등비교하여 일치하면 true
        // - hashCode() : "실제 담긴 문자열을 가지고 10진수의 형태로 만들어서 반환"

        // -------------------------------------------------------------------


        HashSet<Person> hSet2 = new HashSet();

        hSet2.add(new Person("허완", 34, 165));
        hSet2.add(new Person("허완", 34, 165));
        hSet2.add(new Person("양민욱", 31, 170));
        hSet2.add(new Person("안창원", 31, 181));

        System.out.println(hSet2.toString());
        // Person :
        //   - equals() : 실제 각 필드에 담긴 데이터들이 모두 일치하면 true, 그렇지 않으면 false
        //   - hashCode() : 재정의. 실제 각 필드에 담긴 데이터들을 합해서 10진수 반환

        // ------------------------------------------------
        // HashSet 공간에는 객체가 추가될 때마다 동일 객체인지 비교하여 추가함!
        // = > 동일 객체 판단 기준 : hashCode 결과가 일치하고, equals 메소드 비교 시 true일 떄
        // ----------------------------------------------------------------------------
        // ** 데이터 조회하기 **
        // [1] 향상된 for문(for-each) ---> hSet2 데이터 출력
        // [2] Iterator



        /*        * [1] Iterator (반복자) 사용
         *   - Iterator 객체 생성 : set_참조변수.iterator();
         *   - 데이터 유/무 판단 : iterator_참조변수.hasNext(); // 반복문 기준으로
         *   - 데이터 조회 : iterator_참조변수.next();*/

        for(Person person : hSet2){
            System.out.println(person);
        }

        System.out.println("-----------------------------------");

        Iterator<Person> it = hSet2.iterator();
        // * 데이터가 있는 지 확인
        while (it.hasNext()){
            Person p = it.next(); // 데이터를 일고 넘어가는
            System.out.println(p);
        }

        hSet2.iterator();




    }
}

package ch15;

import java.util.HashMap;
import java.util.Set;

public class MapRun {

    /*
    *
    *  * Map<K,v> : ket - value 형식으로 데이터를 관리하는
    *  * = > List Set과는 달리 Collection을 구현한 클래스는 아님
    *       (메소드가 일부 다음)
    *
    * */


    public static void main(String[] args) {

        HashMap<String,Snack> hashMap = new HashMap<>();

        // 데이터 추가 : put(K key, V value)
        hashMap.put("바나나킥",new Snack("바나나맛",1024));
        hashMap.put("도리토스",new Snack("바베큐",2048));
        hashMap.put("프링글스",new Snack("어니언앤샤워",4096));

        hashMap.put("도리토스2",new Snack("크림맛",2048));
        // 저장되는 순서가 유지 되지 않음
        // 키 값이 다르고 데이터 값이 동일하면 추가가 됨!

        hashMap.get("바나나킥");
        System.out.println(hashMap.get("바나나킥"));
        // get 키 값에 해당 데이터를 조회


        // 키 값에 해당하는 데이터를 찾아서 다시 전달한 데이터로 변경해주는 메소드
        // replace(K key, V new Value)

        // 키 목록 조회 : keySet() : Set<K>
        Set<String>keyList = hashMap.keySet();
        System.out.println(keyList);
        for (String key : keyList){
            System.out.println(key + " : " + hashMap.get(key));
        }





        System.out.println(hashMap);


        hashMap.replace("도리토2",new Snack("바베큐맛",512));


    }



}

class Snack{
    private String flavor;
    private  int calory;


    public Snack(String flavor, int calory){
        this.flavor = flavor;
        this.calory = calory;
    }

    @Override
    public String toString() {
        return "Snack{" +
                " 맛 '" + flavor + '\'' +
                ", 칼로리 : " + calory +
                '}';
    }
}

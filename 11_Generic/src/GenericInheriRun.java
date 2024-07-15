

class Parent<T>{
    T data; // T ---> Object
    // Object data

}
class Child1 extends Parent{
}
class Chlid extends  Parent<String>{
    // T ---> String
    // String data
}
class Child3<K> extends Parent<K>{
    // K data;
    // 상속 받은 타입 파라미터를 Child3 객체가 생성될 때 결정!
}
class Chlid4<M,N> extends Parent<M>{
     // T -> M

     N data2;
}
public class GenericInheriRun {
    public static void main(String[] args) {

        // data = "안녕하세요"

        Child3<String> ds = new Child3<>();
        ds.data = "안녕하세요";
        System.out.println(ds.data);

        // Child4 클래스 객체를 생성하여 데이터

        Chlid4<String,Integer> c4= new Chlid4<>();
        c4.data = "최종군";
        c4.data2 = 31;
        // c4.data = String.valueOf(31);
        // 술 도박 마약









    }
}





//  extends Fruit
public class MyFruit extends Fruit {



    public MyFruit(){}

    public MyFruit(String name, int price){
         super(name, price);
        //   부모 클래스 멤버/생성자에 접근할 때 super사용
        // - 부모클래스의 생성자 호출 super()
        // - 부모클래스의 멤버(메소드/변수) 접근 : super.멤버이름/메소드
        // setName(name);
        // setPrice(price);

    }

    // toString() 오버라이딩 :
    @Override
    public String toString() {
        // super. 안된다 * 메모
        // 상속을 받았어도 멤버 접근제한자 private인 경우는 직접 접근 불가하다
        return "내가 좋아하는 과일은 :" + getName() + super.toString();
    }
}

public class Fruit {


    private String name;
    private int price;

    // 기본생성자 / 모든 필드를 매개변수로 가지는 생성자

    // private 필드의 getter / setter

    public Fruit(){}

    public Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override  // Object 클래스이 정의된 메소드 :
    public String toString() {
        return " Fruit [" +
                " 이름 :" + name + '\'' +
                " 가격 : " + price +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

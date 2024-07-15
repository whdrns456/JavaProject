public class Product {



    private String name; // 제품명
    private  int price; // 가격


    public Product(){}


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }






    @Override
    public String toString() {
        return " [제품 : " +
                "제품 이름 : " + name + '\'' +
                " 가격 정보 : " + price +
                ']';
    }
}

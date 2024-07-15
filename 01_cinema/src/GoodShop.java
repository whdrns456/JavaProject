	import java.util.ArrayList;
	import java.util.Scanner;
public class GoodShop {

	public static void main(String[] args) {
	

		class Goods {
		    private String name;
		    private double price;
		    private int stock;

		    public Goods(String name, double price, int stock) {
		        this.name = name;
		        this.price = price;
		        this.stock = stock;
		    }

		    public String getName() {
		        return name;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public int getStock() {
		        return stock;
		    }

		    public boolean purchase(int quantity) {
		        if (quantity > stock) {
		            System.out.println("재고가 부족합니다.");
		            return false;
		        }
		        stock -= quantity;
		        return true;
		    }

		    @Override
		    public String toString() {
		        return name + " - 가격: " + price + "원, 재고: " + stock + "개";
		    }
		}

		class GoodsShop {
		    private ArrayList<Goods> goodsList;

		    public GoodsShop() {
		        this.goodsList = new ArrayList<>();
		    }

		    public void addGoods(Goods goods) {
		        goodsList.add(goods);
		    }

		    public void showGoods() {
		        System.out.println("굿즈 목록:");
		        for (int i = 0; i < goodsList.size(); i++) {
		            System.out.println((i + 1) + ". " + goodsList.get(i));
		        }
		    }

		    public void purchaseGoods(int index, int quantity) {
		        if (index < 0 || index >= goodsList.size()) {
		            System.out.println("잘못된 상품 번호입니다.");
		            return;
		        }
		        Goods selectedGoods = goodsList.get(index);
		        if (selectedGoods.purchase(quantity)) {
		            System.out.println("구매 완료: " + selectedGoods.getName() + " " + quantity + "개");
		        }
		    }
		}

		public class CinemaGoodsShop {
		    public static void main(String[] args) {
		        GoodsShop shop = new GoodsShop();
		        shop.addGoods(new Goods("영화 포스터", 5000, 10));
		        shop.addGoods(new Goods("영화 티셔츠", 20000, 5));
		        shop.addGoods(new Goods("영화 피규어", 15000, 2));

		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("영화관 굿즈샵");
		            System.out.println("1. 굿즈 목록 보기");
		            System.out.println("2. 굿즈 구매");
		            System.out.println("3. 종료");
		            System.out.print("선택: ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    shop.showGoods();
		                    break;
		                case 2:
		                    System.out.print("구매할 상품 번호: ");
		                    int goodsIndex = scanner.nextInt() - 1;
		                    System.out.print("구매할 수량: ");
		                    int quantity = scanner.nextInt();
		                    shop.purchaseGoods(goodsIndex, quantity);
		                    break;
		                case 3:
		                    System.out.println("시스템을 종료합니다.");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("잘못된 선택입니다.");
		            }
		        }
		    }
		}

	}

}

package practice2;

public class Variable02 {

	public static void main(String[] args) {
		
		// 대소문자가 구분된다 
		
		int num = 10;
		int nuM = 20;
		
		System.out.println(num);
		System.out.println(nuM);
		
		// 예약어를 사용하면 안 된다  
		// int class 
		
		// 숫자로 시작하면 안된다 
		// int 1age; 등 
		
		// 특수문자는 '_'와 '$'만 사용이 가능 
		// String sh_as;
		
		// 카멜케이스 : 소문자로 시작하여 다음 단어의 첫글자가 대문자로 작성 
		// ageOfVampire, 
		String userName; // 문법상 오류는 발생하지 않는다. 
		
		// 제품의(product) 번호(id) => 정수형 : 카멜케이스 만들기 
		int productId = 12345;
		System.out.println(productId);
		
		// 책(book) 제목(title)  = > 문자열 
		String bookTitle = "아무거나";
		System.out.println(bookTitle);
		
		
		
		
		
		
		
	}

}

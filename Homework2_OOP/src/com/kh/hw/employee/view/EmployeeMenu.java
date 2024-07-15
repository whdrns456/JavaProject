package com.kh.hw.employee.view;



import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;



public class EmployeeMenu {
	
		// 필드부 
		private Scanner sc = new Scanner(System.in);
		private EmployeeController  ec = new EmployeeController();
		
		
		public EmployeeMenu() {
			// 메인 메뉴를 출력하는 기본 생성자 : 
			
			while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 누르세요 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1: 			 // 사원 추가 
					insertEmp(); // 저장할 데이터를 사용자에게 받는 메소드 
				break;
				
			case 2:  // 사원 수정 updateEmp 메소드로 이동 
				updateEmp();
			break;
			
			case 3:  //  사원 삭제..deleteEmp()메소드로 이동 
				deleteEmp();
			break;
			
			case 4: 
				printEmp(); // 사원 출력 
			break;
			
			case 9: // 프로그램을 종료합니다 출력 후 프로그램 종료 
				System.out.println("프로그램을 종료합니다");
				
				return; // 생성자가 사용된 내역으로 이동이 된다.
				
			default:  // 
					System.out.println("잘못 입력했습니다. 다시 입력해주세요");	
			
		}
	}	
}
		
		// 메소드부 
		// 1. 사원 추가 메뉴 
		// 사용자가 1번을 누를 시 사원 추가 메뉴로 이동 
		
		public void insertEmp() {
			 // 저장할 데이터를 사용자에게 받는 메소드 
			System.out.print("사원 번호 :");
			int no = sc.nextInt();
			
			sc.nextLine(); // 단순 호출로 버퍼를 제거한다. 
			
			System.out.print("사원 이름 :");
			String name = sc.next();
			
			System.out.println("사원 성별 :");
			char gender = sc.next().charAt(0);
			// char형태로 만들기 gender = sc.next.charAt();
			
			System.out.print("전화 번호 : ");
			String phone = sc.next();
			//
			
			
			System.out.println("추가 정보를 더 입력하시겠습니다(y/n) :"  );
			char yn = sc.next().charAt(0);
			   
			// yn.toUpperCase().equals
			// Character.toUpperCase(yn) == 'Y'
			// if(yn == 'y'|| yn == 'Y')
			
			if(Character.toUpperCase(yn) == 'Y') {
				// 문자열의 값을 모두 대문자로 바꿔준다
				
				System.out.println("사원 부서 :");
				String dept = sc.next();
				
				System.out.println("사원 연봉 :");
				int salary = sc.nextInt();
				
				System.out.println("보너스 율 :");
				double bonus = sc.nextDouble();
				
				
				ec.add(no, name, gender, phone, dept, salary, bonus);
				// 추가할 메소드 5개 
			} else {
				
				// 기본 정보만으로 사원 추가 
				ec.add(no, name, gender, phone); 
				
			}
		}
		
		public void updateEmp() {
			
			// 수정할 데이터를 사용자에게 받는 메소드 
			
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다. :");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("메뉴 번호를 누르세요:");
			
			int menu = sc.nextInt();
			
			
			
			String message = "수정할  ";
			switch (menu) {
			case 1:
					message += "전화번호 : ";
				break;

			
			case 2:
				message += "사원 연봉 : ";
			break;
			
			case 3:
				message += "보너스 율 : ";
			break;
			
			case 9:
				System.out.println("메인으로 돌아갑니다 ");
			return;
			
			default:
				System.out.println("잘못 입력하셨습니다");
				return;
			}
			
			if(menu == 1) {
				String newPhone = sc.next();
				ec.modify(newPhone);
			} else if(menu == 2) {
				int newSal = sc.nextInt();
			}else if(menu == 3){
				double newBonus = sc.nextDouble();
				ec.modify(newBonus);
			}
			
			
			
			
			
		}
		
		public void deleteEmp() {
			// 삭제할 데이터를 사용자에게 받는 메소드.. 
			
			System.out.println("정말 삭제하시겠습니까? (y/n) :");
			char yn = sc.next().charAt(0);
			
			if(yn == 'y' || yn == 'Y') { // heap 메모리에 
				Employee result = ec.remove(); // 객체 result 선언 : 
			if(result == null) { //객체 result가 null이라면 삭제에 성공했습니다 
				System.out.println("삭제에 성공했습니다 ");
			}else { 
				System.out.println("삭제에 실패했습니다");
			}
			
			}
			
		}
		
		
		public void printEmp() {
			
			String info = ec.inform();
			if(info == null) {
				System.out.println("저장된 사원 정보가 없습니다 ");
			}else {
				System.out.println(info);
			}
		}
		
		
		
		
		
		
	

}

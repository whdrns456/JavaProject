package com.kh.practice.chap02_abstractNInterface;

public class Run {

	public static void main(String[] args) {
	
		
		PhoneController pc = new PhoneController();

		
		
		
	         String[] pc1 =  pc.method();
		
	       
	         for(String info : pc1) {
	        	 System.out.println(info);
	         }
	         
	         System.out.println("------------------");
	        for(int i = 0; i < pc1.length; i++) {
	     
	        	System.out.println(i + "]");
	         System.out.println(pc1[i]);
	         }
	        System.out.println("------------------");
				
		
		
		
		
		
		
		
		
	}

}
package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		Product product1 = new Product();
//		System.out.println(product1);
//		System.out.println("product1 아이디: " + product1.productId);
//		System.out.println("product1 이름: " + product1.productName);
//		System.out.println("product1 가격: " + product1.productPirce);
		product1.printProductInfo();
		
		Product product2 = new Product(10, "cnady", 1000);
		product2.printProductInfo();
		
		Product product3 = new Product(200 , "칙촉");
		product3.printProductInfo();
		product3.print();
		
	}

}

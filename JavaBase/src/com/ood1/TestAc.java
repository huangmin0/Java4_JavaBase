package com.ood1;

public class TestAc {
	String name ="张三丰";

	private void print() {
		System.out.println(name );
		
	}


	public static void main(String[] args) {
		Administrator admin1=new Administrator();
		admin1.name="zhangsan";
		admin1.password=123456;
		
		Administrator admin2=new Administrator();
		admin2.name="lisi";
		admin2.password=456789;
		
		Customer customer=new Customer();
		customer.score=1000;
		customer.cardType="黄金会员";
		
		
		admin1.show();
		admin2.show();
		customer.show();
		
		TestAc test=new TestAc();
		System.out.println("test.name默认值："+test.name);
		test.print();

	}

}

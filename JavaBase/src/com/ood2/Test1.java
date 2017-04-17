package com.ood2;

public class Test1 {

	public static void main(String[] args) {
		Master1 master1=new Master1();
		Dog1 dog1=new Dog1();
		Penguin1 penguin1=new Penguin1();
		
		
		
		Pet1 pet1=new Dog1();
		pet1.eat();
		
		Pet1 pet2=new Penguin1();
		pet2.eat();
		//领养宠物的方法
		Pet1 pet3=master1.getPet("Dog");
		pet3.eat();
		Pet1 pet4=master1.getPet("Penguin");
		pet4.eat();
		//陪动物玩耍
		master1.play(pet3);
		master1.play(pet4);
		
	}

}

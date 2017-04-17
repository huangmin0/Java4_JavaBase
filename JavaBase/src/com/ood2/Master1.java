package com.ood2;

public class Master1 {

	/*	public void feet(Dog1 dog1){
			dog1.eat();
		}
		public void feet(Penguin1 penguin1){
			penguin1.eat();
		}
	*/
public void feet(Pet1 pet){
	pet.eat();
}
public Pet1 getPet(String typeId){
	if(typeId.equalsIgnoreCase("dog")){
		Pet1 pet1=new Dog1();
		return pet1;
	}else if(typeId.equalsIgnoreCase("penguin")){
		Pet1 pet1=new Penguin1();
		return pet1;
	}
	return null;
	
}
public void play(Pet1 pet){
	if(pet instanceof Dog1){
		Dog1 dog1=(Dog1)pet;
		dog1.catchFlyDisc();
	}else if(pet instanceof Penguin1){
		Penguin1 penguin1=(Penguin1)pet;
		penguin1.swimming();
	}
}
}

package com.hm.javacore.datatype;
import java.util.Scanner;
public class LoopDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数");
		int num=input.nextInt();
		for(int i=0;i<num;i++){
			System.out.println("大话设计模式这本书真好！");
		}
	int j=0;	
while(j<num){
	System.out.println("大话设计模式这本书真好用");
	j++;
}
int i=0;
do{
	System.out.println("Java编程思想这本书真好");
	i++;
}while(i<num);

String[] strs={"AA","BB","CC"};
for (String string:strs){
System.out.println("数组的元素为:"+string);
}





















	}

}

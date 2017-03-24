package com.hm.javacore.datatype;

import java.util.Scanner;

public class PracticeText3 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个数");
	int num=input.nextInt();
    for (int i=0;i<num;i++){
    	for(int j=0;j<(2*num+1);j++){
    		if(j>=(num-1)-i&&j<=(num-1)+i){
    			System.out.print("*");
    		}else 
    		System.out.print(" ");
    	}
		System.out.println();
	}
	
	

}
}
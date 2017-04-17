package com.ood;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeText3
{

	public static void main(String[] args)
	{
		int num=0;
		int k=0;
		boolean isEx=false;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入2個正确的数值：");
			try {
				num = input.nextInt();
				k = input.nextInt();
				isEx =false;
				if(num<=0||k<0){
				isEx=true;
				}
			} catch (Exception e) {
				System.out.println("请重新输入2個正确的数值：");
				isEx = true;	
			}

		} while (isEx);
		for (int i = 0; i< num-1; i++)
		{
			for (int j = -1-k; j< 2 * num-3; j++)
			{
				if (j == (num - 2) - i|| j == (num - 2)+ i)
				{
					System.out.print("*");
				} 
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int m=1;m<=k;m++){
			System.out.print(" ");
			
		}
		for (int i=0;i<2*num-1;i++){
			System.out.print("*");
		}
	}
}
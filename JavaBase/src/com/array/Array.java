package com.array;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class Array
{
	public static void main(String[] args)
	{
		int[] score;
		score=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数组的十个元素：");
		
		for(int i=0;i<score.length;i++){
			score[i]=input.nextInt();
		}
		
		System.out.println("请输入十个数：");
		for(int i=0;i<score.length;i++){
		System.out.println("score[" +i +"] = " + score[i] + ";");
	}
		int sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
			System.out.println("avg="+(sum/score.length));
			
			int max=0;
			for(int i=0;i<score.length;i++){
				if(score[i]>max){
					max=score[i];
				}
			}
			System.out.println("最大值:"+max);
			int min=0;
			for(int i=0;i<score.length;i++){
				if (score[i]<min){
					min=score[i];
				}
			}
			System.out.println("最小值："+min);
		
		Arrays.sort(score);
		System.out.println("升序后逐个循环输出：");
		for (int i = 0; i < score.length; i++) {
			System.out.print( score[i] + " ");
		}
		System.out.println(" ");
		Arrays.sort(score);
		System.out.println("降序后逐个循环输出：");
		for (int i = 9; i < score.length&&i>=0; i--) {
			System.out.print( score[i] + " ");
		}
}
}
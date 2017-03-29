package com.array;

public class Array
{

	public static void main(String[] args)
	{
		int[] score ={60,70,80,90,95};
		int sum=0;
		double avg;
		for(int i=0;i<score.length;i++){
			sum=sum+score[i];
		}
		System.out.println("输出平均数："+(avg=sum/score.length));
	}
}

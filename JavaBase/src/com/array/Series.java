package com.array;

public class Series
{

	public static void main(String[] args)
	{
		int[] score={8,4,2,1,23,344,12,255};
		int sum=0;
		for (int i=0;i<score.length;i++){
			sum+=score[i];
			//System.out.println("score["+i+"]="+score[i]);
			
		}
		System.out.println("总和"+sum);
		System.out.println("平均数"+(sum/score.length));
		
	}

}

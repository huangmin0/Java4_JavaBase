package com.ood;

public class Youcanfangfa1 {
	public double calAvg(int[] scores){
		int sum=0;
		double avg=0.0;
		for(int i=0;i<scores.length;i++){
			sum+=scores[i];
		}
		avg=(double)sum/scores.length;
		return avg;

	
	}
	}

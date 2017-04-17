package com.ood;

import javax.print.attribute.standard.RequestingUserName;

public class Youcanfangfa2 {

	public int calMax(int[] scores) {
		int max=scores[0];
		for(int i=1;i<scores.length;i++){
			if(max<scores[i]){
				max=scores[i];
			}
		}
		
		return max;
}
}
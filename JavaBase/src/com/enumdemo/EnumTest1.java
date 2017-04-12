package com.enumdemo;

public enum EnumTest1
{
	MON(1),TUE(2),WED(3),THU(4),FRI(5){
		@Override
		public boolean isRest(){
			return true;
		}
		
	},
	SUN(0){
		public boolean isRest(){
			return true;
		}
		
	},
	STA(6){
		public boolean isRest(){
			return true;
		}
		
	};
	
	private int value;
	private EnumTest1(int value){
		this.value=value;
	}
	int getValue(){
		return value;
		
	}
	public boolean isRest(){//是否是休息日
		return false;
	}
}

package com.enumdemo;

import lombok.Getter;
import lombok.Setter;


public enum EnumPractice {
Monday(1,"星期一"),Tuesday(2,"星期二"),Wednesday(3,"星期三"),Thursday(4,"星期四"),Friday(5,"星期五"),Saturday(6,"星期六"),Sunday(7,"星期日");
	
	private int index;//索引
	
	private String desc;
	private EnumPractice(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}
	public String getIndex(){
		return "EnumPractice"+","+this.index;
		
	}
	public String getDesc(){
		return "EnumPractice"+","+this.desc;
	}

}
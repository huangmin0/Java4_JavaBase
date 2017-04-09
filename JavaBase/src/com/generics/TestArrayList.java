package com.generics;

import java.awt.DisplayMode;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Jack");
		list1.add("Rose");
		display(list1);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(22);
		list2.add(44);
		display(list2);
	}
		public static void display(ArrayList<?> list){
			for(Object object:list){
				System.out.println(object);
			}
		}

	}



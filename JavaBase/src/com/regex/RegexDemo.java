package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{
	public static void main(String[] args)
	{
		String line="dsnfjTYUHHjf36677 fsdfsdjf5";
		String pattern="([a-z]*)(\\d+)(\\D*)";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(line);
		if(m.find()){
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			System.out.println(m.group(3));
		
		}

	}

}

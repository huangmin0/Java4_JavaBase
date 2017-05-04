package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches3 {
	private static String REGEX = "dog";
	private static String INPUT = "The dog says meow." + "All dogs say meow.";
	private static String REPLACE = "cat";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		// get a matcher object
		Matcher m = p.matcher(INPUT);
		// INPUT = m.replaceFirst(REPLACE);//替換首次匹配
		INPUT = m.replaceAll(REPLACE);//替換所有匹配
		System.out.println(INPUT);
	}

}

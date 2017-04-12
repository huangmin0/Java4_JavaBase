package com.enumdemo;

import java.util.EnumMap;
import java.util.Map.Entry;

public class Test3_2
{

	public static void main(String[] args)
	{
		EnumMap<Test3_1,String> weekmap=new EnumMap(Test3_1.class);
		weekmap.put(Test3_1.MONDAY, "一");
		weekmap.put(Test3_1.THURDAY, "二");
		weekmap.put(Test3_1.WEDNESDAY, "三");
		weekmap.put(Test3_1.THURDAY, "四");
		weekmap.put(Test3_1.FRIDAY, "五");
		weekmap.put(Test3_1.SATURDAY, "六");
		weekmap.put(Test3_1.SUNDAY, "日");
for (Entry<Test3_1, String> entry : weekmap.entrySet())
{
	System.out.println(entry.getKey().getIndex()+"-----"+entry.getKey().getDesc()+"-----"+entry.getValue());
}
	}

}

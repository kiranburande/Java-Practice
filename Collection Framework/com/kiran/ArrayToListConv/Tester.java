package com.kiran.ArrayToListConv;

import java.util.List;

public class Tester 
{
	public static void main(String[] args) 
	{
		String str[] = {"Kiran","Pravin","Yash"};
		List<String> list = ArrayToList.convertToList(str);
		list.forEach(s->System.out.println(s));
	}
}

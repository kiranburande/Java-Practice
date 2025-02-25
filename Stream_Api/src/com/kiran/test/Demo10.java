package com.kiran.test;

import java.util.Arrays;
import java.util.List;

public class Demo10 
{
	public static void main(String[] args) 
	{
		 String []names = {"James", "Aryan", "Vibha", "Aniket"};
	      //First Letters: [J, A, V, A]
		 List<Character> list = Arrays.stream(names).map(str->str.charAt(0)).toList();
		 System.out.println("First Letters: "+list);
	}
}

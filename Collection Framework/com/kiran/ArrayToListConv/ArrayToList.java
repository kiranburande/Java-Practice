package com.kiran.ArrayToListConv;

import java.util.*;
import java.util.List;

public  class ArrayToList 
{
	
	public static List<String> convertToList(String[] inputArray)
	{
		 List<String> list = new ArrayList<>();
		for(String str : inputArray)
		{
			list.add(str);
		}
		return list;
	}
//	@Override
//	public String toString() {
//		return "ArrayToList []";
//	}
	
}

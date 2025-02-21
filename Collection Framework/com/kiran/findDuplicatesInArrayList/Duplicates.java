package com.kiran.findDuplicatesInArrayList;
import java.util.*;

public class Duplicates 
{
	private List<Integer> numberList = new ArrayList<>();
	

	public Duplicates() {
		super();
	}

	public Duplicates(List<Integer> numberList) {
		super();
		this.numberList = numberList;
	}

	public List<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}
	public List<Integer> getDuplicatesList()
	{
		if(numberList==null || numberList.isEmpty())
		{
			return null;
		}
		
		Set<Integer> uniqueEle = new HashSet<>();
		Set<Integer> duplicatesEle = new HashSet<>();
		
		for(Integer number :numberList)
		{
			if(!uniqueEle.add(number))
			{
				duplicatesEle.add(number);
			}
		}
		
		return new ArrayList<>(duplicatesEle);
	}
	
}

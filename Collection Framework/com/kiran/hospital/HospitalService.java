package com.kiran.hospital;

import java.util.*;

public class HospitalService 
{
	ArrayList<Hospital> list = new ArrayList<Hospital>();
	Random r1 = new Random();
	
	public int addHospital(Hospital h)
	{
		list.add(h);
		int hospitalCode=r1.nextInt(100,1000);
		
		return hospitalCode;
	}
	public Map<Integer,String> getHospitals()
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		for(Hospital h :list)
		{
			map.put(h.getHospitalCode(), h.getHospitalName());
		}
		return map;
	}
	
	public Hospital  getHospitalDetails(int hospitalCode)
	{
		for(Hospital h :list)
		{
			if(h.getHospitalCode()==hospitalCode)
				return h;
		}
		return null;
	}
	
}

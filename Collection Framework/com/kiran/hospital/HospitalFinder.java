package com.kiran.hospital;
import java.util.*;
public class HospitalFinder 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Cardiac");
		list.add("ENT");
		list.add("Ortho");
		list.add("Pediatric");
		list.add("Gastro"); 
		
		Hospital h1 = new Hospital("YASHODA",list,"MATHEWS","9848222222","Sec");
		Hospital h2 = new Hospital("PRIME",list,"AAA","9848222222","HYD");
		Hospital h3 = new Hospital("PATIL",list,"BBB","9848222222","AMEERPET");
		Hospital h4 = new Hospital("VIVEKANAND",list,"CCC","9848222222","LINGAMPALLI");
		Hospital h5 = new Hospital("THORAT",list,"DDD","9848222222","SR NAGAR");
		Hospital h6 = new Hospital("ASTER PRIME",list,"EEE","9848222222","MAITRIVANAM");
		
		HospitalService hs = new HospitalService();
		
		hs.addHospital(h1);
		hs.addHospital(h2);
		hs.addHospital(h3);
		hs.addHospital(h4);
		hs.addHospital(h5);
		hs.addHospital(h6);
		
		System.out.println(hs.getHospitals());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code");
		int a = sc.nextInt();
		System.out.println(hs.getHospitalDetails(a));
		
	}
}

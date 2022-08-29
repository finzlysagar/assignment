package com.assignments;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 

public class Main
{
	
 public static void main(String[] args) throws Exception  
	{  
	
    	String str = "USDEUR";
		String ccy1 = str.substring(0,str.length()/2);
		String ccy2 = str.substring(str.length()/2);
		
		Scanner sc = new Scanner(new File("/Finzly_Assignments/src/com/assignments/CurrencyPairs.csv"));
		ArrayList<String> ar = new ArrayList<String>();
		while (sc.hasNext())   
		{  
		ar.add(sc.next());
		}   
		ArrayList<String> dataStruct = new ArrayList<String>();
		System.out.println("Data Structure => ");
		for(int i =1; i<ar.size(); i++) {
			String[] s = ar.get(i).split(",");
			if(s[0].equals(ccy1) && s[1].equals(ccy2)) {
				dataStruct.add(ar.get(i));
				System.out.println(s[0]+" "+s[1] +" "+" "+s[2]+" "+s[3]+" "+s[4]+" "+s[5]);
			}
		}
		System.out.println("\nsorted Date structure => ");
		Collections.sort(dataStruct);
		for (String a : dataStruct) {
			System.out.println("\n"+a);
		}
		System.out.println("\nsorted CurrencyPair structure => ");
		Collections.sort(dataStruct);
		for (String a : dataStruct) {
			System.out.println("\n"+a);
		}
	}
	}



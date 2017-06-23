package com.geeks.forgeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		GFG gfg = new GFG();
		Scanner sc = new Scanner(System.in);
		int noofinputs =Integer.parseInt(sc.nextLine());
		String [] inStrings = new String[noofinputs];
		for(int i = 0; i < noofinputs; i++){
			System.out.println("Please enter number");
		 inStrings[i] = sc.nextLine();
		}
		sc.close();
		List<Integer> index;
		List<Character> values;
		List<String> finaloutput = new ArrayList<String>();
		String in;
		for(int i= 0; i<inStrings.length;i++){
			in= inStrings[i];
			index = new ArrayList<>();
			values = new ArrayList<>();
			for(int j = 0;j<in.length();j++){
				if (in.charAt(j)=='a'|| in.charAt(j)=='e' || in.charAt(j)=='i'||in.charAt(j)=='o'||in.charAt(j)=='u'||
						in.charAt(j)=='A'|| in.charAt(j)=='E' || in.charAt(j)=='I'||in.charAt(j)=='O'||in.charAt(j)=='U'){
					index.add(j);
					values.add(in.charAt(j));
				}
				
			}
			finaloutput.add(gfg.reversevowels(values, index, in));
			
		}
		System.out.println(finaloutput);
		}
		public String reversevowels(List<Character> values, List<Integer> index, String i){
			Collections.reverse(values);
			StringBuilder builder;
		
			
				builder=new StringBuilder(i);
				int k = 0;
				for(int loc : index){
					builder.setCharAt(loc, values.get(k));
					k++;
				}
				System.out.println(builder.toString());
			
			return builder.toString();	
			
			
		}
	}
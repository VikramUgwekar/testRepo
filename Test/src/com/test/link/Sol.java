package com.test.link;

import javax.swing.JOptionPane;

public class Sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wordCount = 0;
		int maxLength = 0;
		int emptyWord = 0;
		String sentence = JOptionPane.showInputDialog(null,
				"Please type a short sentence");

		System.out.println(sentence);

		String[] str = sentence.split("[.?!]"); 
for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

			String[] innerString = str[i].split(" ");
			for (int j = 0; j < innerString.length; j++) {
				//System.out.println(innerString[j]);
				if(innerString[j].equals("")){
					//emptyWord++;.
					break;
				}
				wordCount = innerString.length;
				//System.out.println(innerString.s);
				if (wordCount >= maxLength) {
					maxLength = wordCount;
				}
			}
		}
		System.out.println(maxLength);
	}

} 


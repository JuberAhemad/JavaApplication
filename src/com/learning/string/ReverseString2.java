package com.learning.string;

public class ReverseString2 {
	
	public static void main(String[] args) {
          String str = "abc";
          String rev="";
          System.out.println("Orginal  String is : "+str);
          char[] ch = str.toCharArray();
          
          for(int i=ch.length-1;i>=0;i--) {
        	     rev=rev+ch[i];
          }
          
          System.out.println("Reverse String is : "+rev);
          
	}
}

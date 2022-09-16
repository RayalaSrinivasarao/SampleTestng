package com.Test.Project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.platform.commons.util.StringUtils;
import org.testng.annotations.Test;



public class TestHelloworld {



	public void helloworldTest() {
		System.out.println("Hello parent");
		
	}
	
   public static void seperateupperandlowerchars(String input){
	   String temp = "";
	   String lowstr = "";
	   for (int i=0; i<input.length();i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				temp = temp+input.charAt(i);
			}else if(Character.isLowerCase(input.charAt(i))) {
				lowstr = lowstr+input.charAt(i);
			}
		
		}
		System.out.println(temp);
		System.out.println(lowstr);
	}
	
   public void reversestring(String input) {
	   String revstr = "";
	   for (int i = input.length()-1; i>=0; i--) {
		   revstr = revstr+input.charAt(i);
	   }
	   System.out.println(revstr);
	   
   }
   public void reversestringwithouteffectingdigits(String input) {
	  int len = input.length();
	  char[] revStr = new char[len];
	  int j = len-1;
	  for (int i =0; i<=j;) {
		  if(!Character.isAlphabetic(input.charAt(i))){
			  revStr[i] = input.charAt(i);
			  i++;
		  }else if(!Character.isAlphabetic(input.charAt(j))) {
			  revStr[j] = input.charAt(j);
			  j--;
		  }else {
			  revStr[j] = input.charAt(i);
			  revStr[i] =  input.charAt(j);
			  j--;
			  i++;
		  }
	  }
	   System.out.println(revStr);
	   
   }
   
   public void retrievewords(String input) {
	  Pattern p = Pattern.compile("[a-zA-Z]+");
	  Matcher m = p.matcher(input);
	  while (m.find()) {
		  System.out.println(m.group());
	  }
	   
   }
	
   
   
	public static void main(String[] args) {
		TestHelloworld obj = new TestHelloworld();
		String input = "Today is Tuesday";
		String inputwithspecialchars = "a, b@c";// "To2day2 3is T4u#$esd4ay";
		//seperateupperandlowerchars(input);
//		obj.reversestring(input);
		obj.reversestringwithouteffectingdigits(inputwithspecialchars);
		obj.retrievewords(input);
		//reverse string without effecting special chars
		String inputwithspecial = "Today @ is$ tue$%sda*y";
		// output = yadse @ ut$ siy$%ado*T
		
		
	}
}

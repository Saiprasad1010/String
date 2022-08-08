package stringdemo;

public class reverseString {

	public static void main(String[] args)  {    
//		         String string = "Dream big";    
//		         //Stores the reverse of given string    
//		         String reversedStr = "";    
//		             
//		         //Iterate through the string from last and add each character to variable reversedStr    
//		         for(int i = string.length()-1; i >= 0; i--){    
//		             reversedStr = reversedStr + string.charAt(i);    
//		         }    
//		             
//		         System.out.println("Original string: " + string);    
//		         //Displays the reverse of given string    
//		         System.out.println("Reverse of given string: " + reversedStr);
		
		
		String SS = "Saiprasad Patil";
		String reversedStr="";
		for (int i = SS.length()-1; i>=0; i--) {
			reversedStr = reversedStr + SS.charAt(i);
		}
		System.out.println("Original String:" + SS);
		System.out.println("Reversed of given string:" + reversedStr);
		
		String Nm = "Raviraj Patil";
		String reversed="";
		for (int i = Nm.length()-1; i>=0; i--) {
			reversed = reversed + Nm.charAt(i);
		}
		System.out.println("Original String:" +Nm);
		System.out.println("Reversed of given string:" +reversed);
	}

}

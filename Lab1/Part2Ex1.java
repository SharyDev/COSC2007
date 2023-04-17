import java.util.Scanner;
public class Part2Ex1{	 
	static boolean isPalindrome(String data) 
	{ 
		
	  if(data.length() == 0 || data.length() == 1)
	      return true; 
	        
	  if(data.charAt(0) == data.charAt(data.length()-1))
	      return isPalindrome(data.substring(1, data.length()-1));
	     return false;
	 }   
	 
	 public static void main(String args[]) 
	  { 
	     Scanner inp = new Scanner(System.in);
	     System.out.println("Enter the String :");
	     String data = inp.nextLine();  

	     if (isPalindrome(data)) 
	         System.out.println(data + " is palindrome"); 
	     else
	         System.out.println(data + " is not a palindrome"); 
	  }     
	
}

/*
 Course Name: COSC2007P(LAB) - Data Structures II 
 Name: Shahroz Abbas
 
 */
import java.util.*;
public class Part2Ex2 {
	
	    static boolean Operator(char a)
	    {
	        switch (a) {
	        case '+':
	        case '-':
	        case '/':
	        case '*':
	            return true;
	        }
	        return false;
	    }
	 
	    static String Conv(String data)
	    {
	        Stack<String> s = new Stack<String>();
	 
	        int length = data.length();
	 
	        length = length -1;
	        for (int i = length; i >= 0; i--)
	        {
	           
	            if (Operator(data.charAt(i)))
	            {
	              
	                String temp1 = s.peek();
	                s.pop();
	                String temp2 = s.peek();
	                s.pop();
	                
	                String temp = temp1 + temp2 + data.charAt(i);
	                
	                s.push(temp);
	            }
	 	           
	            else {
	                
	                s.push(data.charAt(i) + "");
	            }
	        }
	 
	        return s.peek();
	    }
	 
	    public static void main(String args[])
	    {
	        String data = "*-A/BC-/AKL";
	        System.out.print("Postfix : " + Conv(data));
	    }
	
}

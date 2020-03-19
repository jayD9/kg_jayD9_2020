package main;

import java.util.*;

public class Main {


	public static void main(String[] args) {
			
			String str1 = new String(args[0]);
			String str2 = new String(args[1]);
			boolean x = one2One(str1,str2);
			System.out.println(x);
			
					
	}

	 static boolean one2One(String str1, String str2) {
		 	int size1 = str1.length(); 
	        int size2 = str2.length(); 

	        if(size1 != size2) 
	            return false; 
	        int[] array1 = new int[123]; 
	        Arrays.fill(array1, -1); 
	        
	        Boolean[] array2 = new Boolean[123]; 
	        Arrays.fill(array2, Boolean.FALSE); 

	        for (int i = 0; i < size2; i++) 
	        {  
	        	System.out.println("str char at i = "+str1.charAt(i));
	            if (array1[str1.charAt(i)] == -1) 
	            { 
	                if (array2[str2.charAt(i)] == true) 
	                    return false; 
	                array2[str2.charAt(i)] = true; 
	                array1[str1.charAt(i)] = str2.charAt(i); 
	            }
	        } 
	        return true; 
		
	}

}

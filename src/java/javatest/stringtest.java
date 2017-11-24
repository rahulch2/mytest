/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Administrator
 */
public class stringtest {
        public static void main(String args[]) {
	        char ch;
                int ab[]={2,3,4,5,4,3,2};
                System.out.println("lenght : "+ab.length);
                
                
                
                
        String test2 = "abcd";
	        String test = new String("abcd");
                
              System.out.println("lenght : "+    test.length());
        if(test.equals(test2)) {
        
            if(test == test2)
                ch = test.charAt(0);
	            else
	                ch = test.charAt(1);	           
	        }
	        else {
            if(test == test2)
                ch = test.charAt(2);
            else                
                ch = test.charAt(3);
        }
	        System.out.println(ch);
	    }
//for(int i = 1; i < 4; i++)
//  for(int j = 1; j < 4; j++)
//    if(i < j)
//       assert i!=j : i; 

     //   }
}

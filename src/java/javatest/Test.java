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

class Exc0 extends Exception { } 
class Exc1 extends Exc0 { } /* Line 2 */
public class Test 
{  
    public static void main(String args[]) 
    { 
        try 
        {  
            throw new Exc1(); /* Line 9 */
        } 
        catch (Exc0 e0) /* Line 11 */
        {
            System.out.println("Ex0 caught"); 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}
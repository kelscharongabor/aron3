/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aron3;

/**
 *
 * @author aron
 */
public class aron3 {

    public static void main(String[] args) {  
        if (args.length == 0) { 
       // System.out.println(args.length);        
        System.out.println("Nincs érték megadva.");
        } else {   
            for(String arg: args) { 
            int num = Integer.parseInt(arg);
            prime(num);
            //System.out.println(args + " args.");
            }
         //   System.out.println(args.length);
         //   System.out.println(args[0]);
        }
    
    
    
    }    
    public static void prime(int numm) {                   
        boolean flag = false;
        for(int i = 2; i <= numm/2; ++i)
        {            
            if(numm % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(numm + " Prím.");
        else
            System.out.println(numm + " Nem Prím.");
    }
    
}

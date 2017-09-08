/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproducts;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author amolsidhu
 */
public class Arrayproducts {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int intArray[] = {2,4,10};
        
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(intArray)));
        
    }
    
    public static fibonacci(int n){
        
    }
    
    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {
        int productSoFar =1;

        //edge case
        if(intArray.length <2){
            throw new IllegalArgumentException("intArray must be atleast 2 numbers");
        }
        
         //BEFORE index
         
        int productOfAllIntsExceptAtIndex[]= new int[intArray.length];
       
       
        for(int i=0; i<intArray.length;i++){
            //astore the productofAllints before index i into product so far
            productOfAllIntsExceptAtIndex[i] = productSoFar;
            //then we multopy by only one number 
            productSoFar *= intArray[i];
        }
        //productsoFar here will have the product of all ints before index
        
        
        //AfterIndex
      
        //redefine product so far so we skip the one @ the index and only look at ones after it
        productSoFar=1;

        //walk through array in reverse
        for(int i=intArray.length-1;i>=0;i--){
            //multiply the productsoFar(before index) by  products after index to get total
            productOfAllIntsExceptAtIndex[i]= productOfAllIntsExceptAtIndex[i] * productSoFar;
            
            productSoFar*= intArray[i];
        }
        return productOfAllIntsExceptAtIndex;   
}
  
}

   
    
    

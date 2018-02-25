//************************************************************
// Array.java
//
// CSIT 111 Final  
// Problem 4B: Rewrite Program using fill and sort method  
// By Monti Karlo Lameg
//************************************************************ 

import java.util.Arrays;
public class Array
{
   public static void main(String[] args)
   {
      int[]  nums = new int[]{ 99, -10, 100123, 18, -978, 
                      5623, 463, -9, 287, 49 };
      
      System.out.print("Original array is:");
      System.out.println(Arrays.toString(nums)); 
                      
               
      System.out.print("Sorted array is:");
      Arrays.sort(nums);
      for (int i = 0; i < 10; i++)
         System.out.print(" " +nums[i]+",");
   } 
}

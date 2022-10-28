package com.learningDSA;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     
	     int n=in.nextInt();
	     
	     int[] arr=new int[n];
	     int target=in.nextInt();
	     
	     for(int i=0;i<n;i++) {
	    	 arr[i]=in.nextInt();
	     }
	     
	     System.out.println(searchTarget(arr,target));
	     
	     in.close();

	}
	
	static boolean searchTarget(int[] arr, int target) {
		if(arr.length==0)
			return false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return true;
		}
		return false;
			
	}

}

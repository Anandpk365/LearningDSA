package com.learningDSA;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int target=in.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
		     arr[i]=in.nextInt();	
		}
		
		System.out.println(searchTarget(arr,target));
		in.close();

	}
	
	static boolean searchTarget(int[] arr, int target) {
		if(arr.length==0)
			return false;
		
		int s=0;
		int l=arr.length-1;
		
		while(s<=l) {
			int m=s+(l-s)/2;
			
			if(arr[m]>target)
				l=m-1;
			else if(arr[m]<target)
				s=m+1;
			else
				return true;
		}
		return false;
	}

}

package com.learningDSA;
import java.util.*;

public class CeillingSearch {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int n=in.nextInt();
		int target=in.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		
		System.out.println(searchCheillingNumber(arr,target));
		in.close();

	}
	
	static int searchCheillingNumber(int[] arr, int target) {
		if(arr.length==0||arr[arr.length-1]<target)
			return -1;
		
		int s=0;
		int e=arr.length-1;
		
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(arr[m]>target)
				e=m-1;
			else if(arr[m]<target)
				s=m+1;
			else
				return arr[m];
		}
		return arr[s];
	}

}

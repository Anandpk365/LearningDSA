package com.learningDSA;
import java.util.* ;

public class FloorNumberSearch {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n=in.nextInt();
	    int target=in.nextInt();
	    
	    int[] arr=new int[n];
	    
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=in.nextInt();
	    }
	    
	    System.out.println(floorNumber(arr,target));
	    
	    in.close();

	}
	
	static int floorNumber(int[] arr, int target) {
		int s=0;
		int e=arr.length-1;
		
		if(arr.length==0||arr[0]>target)
			return -1;
		
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(arr[m]<target)
				s=m+1;
			else if(arr[m]>target)
				e=m-1;
			else
				return arr[m];
		}
		return arr[e];
	}

}

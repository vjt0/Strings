package manau;

import java.util.ArrayList;

public class Multiple_Space {
	public static void removespace(String str) {
		System.out.println(str.replaceAll("\s+", " "));
		
	}
   public static void  sum() {
	   int arr[]= {1,2,4,3};
	   int totalsum=10;
	   int rightsum=totalsum;
	   int leftsum=0;
	   
	   for(int i=1;i<arr.length;i++) {
		   leftsum+=arr[i-1];
		   rightsum=totalsum-leftsum-arr[i];
		   if(leftsum==rightsum) {
			   System.out.println(arr[i]);
		   }
		   
	   }
   }
	public static void main(String[] args) {
		String str="My     name s      javassssa         ";
		
		
		sum();
		}
	}


package manau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Runa {
	
	
	public static void sortstring() {
		String [] names= {"Vijay","Tomar","Shrikant"};
		List<String> list = new ArrayList<String>(Arrays.asList("Vijay","Tomar","Shrikant","Ajay"));
		Collections.sort(list,Collections.reverseOrder(null));
		list.forEach((n)->System.out.println(n));
		
		
	}
	
	
	public static void duplicate() {
		int[] ar = { 10, 1, 3, 1, 8, 4, 2 ,2,3};
		Set<Integer>set=new HashSet<Integer>();
		for(int i:ar) {
			if(set.add(i)==false) {
				System.out.println("Duplicate is "+i);
				
			}
			
		}
	}

	public static void main(String[] args) {
		//duplicate();
		//sortstring();
		int[] ar = {  4, 15,8,9,11,19, };
		int max = 0;
		int smax = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			} else {
				if (ar[i] > smax)
					smax = ar[i];
			}
			
			}
		if(smax==0) {
			smax=ar[ar.length-2];}
	
			System.out.println(max +" "+ smax);

		// TODO Auto-generated method stub

	}

}

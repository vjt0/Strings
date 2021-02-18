package manau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Person {
	
	
	
	
	
	
	
	
	
	
	
	
	public static void srev() {
		Scanner scan=new Scanner(System.in);
		String  i=scan.nextLine();
		String rev;
		char[]arr=i.toCharArray();
		for(int n=arr.length-1;n>=0;n--) {
			System.out.print(arr[n]);
		}
	}
	
	
	public static void reverse() {
		int reverse=0;
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
while(i!=0) {
	
	int value=i%10;
	reverse=reverse*10+value;
	i=i/10;
	
}System.out.print(reverse);
	}
	
	public static void main(String[] args) {
		//reverse();
		srev();
		
		
//Collections.sort(list,(o1,o2)->o1.compareToIgnoreCase(o2));

		//list.forEach((o1)->System.out.println(o1.Lname));
		//Collections.sort(list, (o1,o2) -> -1* o1.Lname.compareToIgnoreCase(o2.Lname));
		
		//Collections.sort(list, Comparator.comparing(Person::Fname).thenComparing(Person::Lname));
		//list.forEach((o1)->System.out.println(o1.Fname+"  "+o1.Lname));
		// TODO Auto-generated method stub

	}

}

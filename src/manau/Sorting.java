package manau;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	
	public int rollno;
	public String name;
public static void   sort() {
	List<Sorting>list=new ArrayList<Sorting>();
	Sorting s=new Sorting();
	s.rollno=-34567;
	s.name="xyz";
	list.add(s);
	Sorting s1=new Sorting();
	s1.rollno=-123;
	s1.name="abc";
	list.add(s1);
	Sorting s2=new Sorting();
	s2.rollno=-9874567;
	s2.name="xyz";
	list.add(s2);
	Sorting s3=new Sorting();
	s3.rollno=-4534;
	s3.name="abc";
	list.add(s3);
	
	Collections.sort(list,(o1,o2)->-1*((o1.rollno-o2.rollno)));
	list.forEach(o1->System.out.println(o1.rollno + o1.name ));
	
}
	public static void main(String[] args) {
		

String []str={"Geeks For Geeks", "Friends", "Dear", "Is", "Superb"};

sort();
	}

}

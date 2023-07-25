package colloection_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import in.co.basics.For_Each_loop;

public class MarksheetComparatorTest {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(new Marksheet("harsh", "1"));
		list.add(new Marksheet("sanjay", "4"));
		list.add(new Marksheet("sourabh", "1"));
		list.add(new Marksheet("hritik", "1"));
		list.add(new Marksheet("shali", "2"));
		list.add(new Marksheet("yash","5"));
		list.add(new Marksheet("rahul", "10"));
	//	System.out.println(list);
		
		orderByname name=new orderByname();
		Collections.sort(list, name);
		
	orderByrollno rollno=new orderByrollno();
		Collections.sort(list, rollno);
	
	for (Object obje : list) {
		System.out.println(obje);
		
		}
		
	
	}

}

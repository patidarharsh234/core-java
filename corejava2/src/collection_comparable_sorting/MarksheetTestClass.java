package collection_comparable_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MarksheetTestClass {
	public static void main(String[] args) {
		
		
		
		ArrayList list=new ArrayList();
		
		list.add(new Marksheet("harsh", "1"));
		list.add(new Marksheet("sanjay", "4"));
		list.add(new Marksheet("sourabh", "1"));
		list.add(new Marksheet("hritik", "1"));
		list.add(new Marksheet("shali", "2"));
		list.add(new Marksheet("rahul", "5"));
	//	System.out.println(list);
		
		Collections.sort(list);
		for (Object obj : list) {
			System.out.println(obj);
		
		}
		
	}

}

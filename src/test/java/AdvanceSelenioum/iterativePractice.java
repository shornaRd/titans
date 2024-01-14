package AdvanceSelenioum;

import java.util.ArrayList;
import java.util.Iterator;

public class iterativePractice {
	
	public static void main(String [] args) {
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("Shorna");
		mylist.add("hwy");
		mylist.add("i am ok");
		mylist.add("how are you");
		mylist.add("i am fine");
		
		Iterator<String> i = mylist.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		
	}

}

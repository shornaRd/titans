package AdvanceSelenioum;

import java.util.ArrayList;

public class PracticeForEachLoop {

	public static void main(String[] args) {
		
		
		ArrayList<String> mylist = new ArrayList<>();
		
		mylist.add("shorna");
		mylist.add("hwy");
		mylist.add("i am ok");
		mylist.add("how are you");
		mylist.add("i am fine");
		
		System.out.println(mylist);
		for(String items:mylist) {
			
			System.out.println(items);
		}

	}

}

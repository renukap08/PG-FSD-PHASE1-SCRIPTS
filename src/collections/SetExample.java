package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new TreeSet<>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		
		set.add("three");
		
		for ( String item: set) {
			System.out.println("Item: " + item);
		}
	}
	
}

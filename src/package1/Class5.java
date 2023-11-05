package package1;

import java.util.HashSet;

public class Class5 {

	public static void main(String[] args) {
		
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash set: "+h_set);
		/*boolean t = h_set.isEmpty();	
		
		System.out.println(t);*/
		
		System.out.println("checking the above array list is empty or not! "+h_set.isEmpty());
		
		System.out.println("remove all the elements from hash set: "+h_set.removeAll(h_set));

	}

}

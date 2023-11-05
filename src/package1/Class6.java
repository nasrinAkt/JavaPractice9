package package1;

import java.util.HashSet;

public class Class6 {

	public static void main(String[] args) {
		
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		
		System.out.println("Original Hash set contains: "+h_set);
		
		h_set.clear();
		System.out.println("Hash set contains: "+h_set);

	}

}

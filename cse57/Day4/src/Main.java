import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String args[]) {
		
		// implementation of list
		List data = new ArrayList();
		data.add("Hello"); // it accept the String as a object
		data.add(007); // it accept int as a wrapper class
		data.add(1.33f);
		data.add("Hello");
		data.add(false);
		
		// normal for loop for printing elements
		for(int i=0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
		System.out.println();
		
		// using iterator method for printing elements
		Iterator i = data.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		// using enhanced for loop for printing elements
		/**
		 * for loop can able to lead to index exception,
		 * but for each loop does not leads to exception
		 */
		for(Object element : data) {
			System.out.println(element);
		}
		System.out.println();
		
		// implementation of sets
		Set set = new HashSet();
		set.add("Hello");
		set.add("Hello");
		set.add(123);
		
		System.out.println("Set implementation");
		for(Object obj : set) {
			System.out.println(obj);
		}
	}

}
import java.util.PriorityQueue;

public class MainPriority {
	public static void main(String args[]) {
		
		// implementation of priority queue
		/**
		 * while implementing priority queue using String as generic,
		 * then String will implement Comparable interface which by 
		 * default use ascii values to set priority
		 */
		PriorityQueue<String> pr = new PriorityQueue<>();
		pr.add("winter");
		pr.add("is");
		pr.add("coming");
		
		pr.forEach(System.out::println);
		System.out.println(pr.peek());
		pr.poll();
		System.out.println(pr.peek());
	}
}

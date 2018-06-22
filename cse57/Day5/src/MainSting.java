import java.util.HashSet;
import java.util.Set;

public class MainSting {

	public static void main(String[] args) {
		
		//String input = "In this one, we think we've reached the main verb when we get to raced, but instead we are still inside a reduced relative clause.  Reduced relative clauses let us say, the speech given this morning instead of the speech that was given this morning.";
		String input = "hello world hello ayan world saha";
		String modInput[] = input.split(" ");
		
		Set<String> data = new HashSet<>();
		for(String a: modInput)
			data.add(a);
		data.forEach(System.out::println);
		
//		for(String i : data)
//			System.out.print(i + " ");
	}

}

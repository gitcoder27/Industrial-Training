import java.util.*;

public class CountDistinctWords {

	public static void main(String[] args) {
		String input = "in this one we think we've reached the main verb when we get to raced but instead we are still inside a reduced relative clause reduced relative clauses let us say the speech given this morning instead of the speech that was given this morning";
		
		String [] modInput = input.split(" ");
		
		Set<String> data = new HashSet<>();
		int count = 0;
		
		for(String a : modInput)
			data.add(a);
		
		for(String i: data) {
			for(int j=0; j<modInput.length; j++) {
				if(i.hashCode() == modInput[j].hashCode())
					count++;
			}
			System.out.println(i + " = " + count);
			count = 0;
		}
		
		
		
	}

}

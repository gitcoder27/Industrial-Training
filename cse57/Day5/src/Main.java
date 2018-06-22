import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using generic so that objects return from the list will be of string type
		List<String> data = new ArrayList();
		data.add("Jon Snow");
		data.add("Ned Stark");
		
		// we are able to use toUpperCase method on data as it is generic 
		// and defined as Stringv    
		System.out.println(data.get(0).toUpperCase());
	}

}

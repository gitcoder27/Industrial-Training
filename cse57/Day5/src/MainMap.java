import java.util.HashMap;
import java.util.Map;

public class MainMap {
	public static void main(String args[]) {
		
		Map<Integer, String> data = new HashMap<>();
		data.put(1, "one");
		data.put(2, "two");
		
		System.out.println(data.get(2));
	}
}

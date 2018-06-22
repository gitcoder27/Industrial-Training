/**
 * Singleton design for which is used so that it will ensures that only one 
 * object will be create of a class
 * @author Ayan
 */

public class Student {
	
	// creating a single static object so that everytime when object for 
	// this class will be same
	
	//private static Student student = new Student();
	
	/* private constructor is used so that no other can instantiate the object 
	 * of that class.
	 */
	private static Student obj = null;
	
	private Student () {
	}
	
	public static Student getInstance() {
		if(obj == null)
			return obj = new Student();
		else
			return obj;
	}
	
	public static void main(String args[]) {
		Student s1 = Student.getInstance();
		System.out.println(s1.hashCode());
		
		Student s2 = Student.getInstance();
		System.out.print(s2.hashCode());
	}
}

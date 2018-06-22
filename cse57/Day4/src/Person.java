
public class Person {
	String fname;
	String lname;
	int age;
	
	public Person(String fname, String lname, int age) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person that = (Person) obj;
		if (this.fname.equals(that.fname)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Hello";
	}
	
	public static void main(String agrs[]) {
		Person p1 = new Person("Jon", "Snow", 50);
		Person p2 = new Person("Jon", "Stark", 17);
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());
	}

}

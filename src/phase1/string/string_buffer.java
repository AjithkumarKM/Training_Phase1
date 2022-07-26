package phase1.string;

public class string_buffer {

	public static void main(String args[]){
		StringBuffer s = new StringBuffer("Started Java");
		System.out.println(s);
		
		s.append("Phase1");
		System.out.println(s);
		
		s.delete(2, 5);
		System.out.println(s);

//		int a = s.indexOf("Java");
//		System.out.println(a);
		
		s.replace(5, 9, "Python");
		System.out.println(s);
		
		s.insert(4, "language");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		System.out.println(s.charAt(9));
	}
}

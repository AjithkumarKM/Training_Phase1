package phase1.constructors;

class student{
	String name;
	int age;
	char section, gender;
	int sub1, sub2, sub3;

	student(){
		sub1 = 0;
	}
	
	student(String name, int age, char section, char gender, int sub2, int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
	}
	student(String name, int age, char section, char gender, int sub1, int sub2, int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	void display(){
		System.out.println("\nThe student detail is ");
		System.out.println(this.name + " " + this.age + "  " + this.section + "  "+ this.gender );
		System.out.println("The marks obtained are ");
		System.out.println(this.sub1 + "  " +this.sub2 + "  " + this.sub3 + "  " + getTotal() + "  " + getPercent());
	}
	
	int getTotal(){
		return this.sub1 + this.sub2 + this.sub3;
	}
	
	float getPercent(){
		return (this.sub1 + this.sub2 + this.sub3)/300.0f * 100;
	}
}

public class Student_data {

	public static void main(String args[]){
		student s1 = new student("Ajith",21,'A','M',84,88,95);
		student s2 = new student("Kavi",20,'B','M',92,97);
		student s3 = new student("Shalini",18,'A','F',83,91);
		student s4 = new student("Priya",20,'B','F',77,86,69);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}

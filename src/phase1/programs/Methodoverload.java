package phase1.programs;

public class Methodoverload {
	int calculate(int a, int b){
		return a+b;
	}
	int calculate(int r){
		return (int)3.14*r*r;
	}
	int calculate(float a, int b){
		return (int)(a*b);
	}
	int calculate(double a){
		return (int)(a*a);
	}
	
	public static void main(String[] agrs){
		Methodoverload obj1 = new Methodoverload();
		int add = obj1.calculate(3,4);
		int circle = obj1.calculate(3);
		int rect = obj1.calculate(2.5f,3);
		int sq = obj1.calculate((double)4);
		System.out.println("Addition is: " + add);
		System.out.println("Cicle is: " + circle);
		System.out.println("Rectangle is: "+ rect);
		System.out.println("Square is: " + sq);
	}
}

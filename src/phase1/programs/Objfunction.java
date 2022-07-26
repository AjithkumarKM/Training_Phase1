package phase1.programs;

public class Objfunction {

	public int area(int l,int b){
		return l*b;
	}
	public static void main(String[] args){
		Objfunction rect1 = new Objfunction();
		int area = rect1.area(12,6);
		System.out.println("The area of the rectangle is " + area);
	}
}

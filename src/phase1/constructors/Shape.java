package phase1.constructors;

public class Shape {

	int side;
	int length, breadth;
	float radius;
	int d1,d2;
	int base, height;
	
	Shape(){
		d1 = 4;
		d2 = 6;
		base = 8;
		height = 12;
	}
	
	Shape(int l){
		side = l;
	}
	
	Shape(int l, int b){
		length = l;
		breadth = b;
	}
	
	Shape(float r){
		radius = r;
	}
	
	void square(){
		System.out.println("Area os square is : " + (side * side));
	}
	
	void rectangle(){
		System.out.println("Area os square is : " + (length * breadth));
	}
	
	void circle(){
		System.out.println("Area os square is : " + (3.14 * radius * radius));
	}
	
	void otherShapes(){
		System.out.println("Area of rhombus is : " + (0.5*d1*d2));
	}
	
	void otherShapes(int a){
		System.out.println("Area of triangle is : " + (0.5*base*height));
	}
	
	public static void main(String args[]){
		Shape s1 = new Shape(4);
		s1.square();
		Shape s2 = new Shape(6,5);
		s2.rectangle();
		Shape s3 = new Shape(3.5f);
		s3.circle();
		new Shape().otherShapes();
		new Shape().otherShapes(4);
	}
}

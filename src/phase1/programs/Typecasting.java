package phase1.programs;

public class Typecasting {

	public static void main(String[] args){
		int a = 56;
		float f = a;
		int b = (int)f;
		
		System.out.println("Implicit conversion value is " + f);
		System.out.println("Explicit Convertion value is " + b);
		
		double d2 = 100.04;
        long l2 = (long)d2;
        int i2 = (int)l2;
        float f2 = (float)d2;
        System.out.println("Double value "+d2);
        System.out.println("Long value "+l2);
        System.out.println("Int value "+i2);
        System.out.println("Float2 value "+f2);
        
        double d3 = 10000.1234456788;
        float f3 = (float)d3;
        System.out.printf("Float3 value: %.2f",f3);
	}
}


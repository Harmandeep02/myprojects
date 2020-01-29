
public class Example {
	public static void main(String[] args) {
		Abc o1 = new Abc();
		o1.add(2, 3);
		o1.add1(3,3);
		
	}

}
class Abc{
	int c;
	public int add(int a , int b){
		System.out.println("hello");
		int c = a+b;
		System.out.println(c);
		return c;
	}
	public double add1(int a , int b){
		System.out.println("hello");
		double c = a+b+0.0;
		System.out.println(c);
		return c;
		
		
	}
}

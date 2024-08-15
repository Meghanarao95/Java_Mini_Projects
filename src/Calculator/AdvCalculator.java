package Calculator;

//1. inheritance

public class AdvCalculator extends SimpleCalculator {

	// 2.Constructor
	// default
	public AdvCalculator() {

		// 3. super(3,4);
		System.out.println("In default constructor of AdvCalculator");
		System.out.println("**********************");

	}

	// 2. Constructor
	// parameterised
	public AdvCalculator(int n1, int n2) {
		// 3. super(3,4);
		this();
		System.out.println("In parameterized constructor of AdvCalculator");
		System.out.println("**********************");

	}

	// 4. this keyword

	int n1;
	int n2;

	// 3. super with variable
	int n3 = 100;
	int n4 = 500;

	// 4. Encapsulation
	private int number;

	public void setNumber(int number) {

		this.number = number;
	}

	public int getNumber() {
		return number;

	}

	public int square(int n1) {

		System.out.println("Square method from AdvCalculator invoked");
		int x = n1 * n1;
		System.out.println(x);
		System.out.println("**********************");
		return x;

	}

	public int cube(int n1) {
		System.out.println("Cube method from AdvCalculator invoked");
		int y = n1 * n1 * n1;
		System.out.println(y);
		System.out.println("**********************");
		return y;

	}
	// 5. Polymorphism
	// method overriding

	public int add(int n1, int n2) {

		this.n1 = n1;
		this.n2 = n2;

		System.out.println("add method from AdvCalculator invoked");
//		int z = n1 + n2 - 1;
//		System.out.println(z);
//		return z;
		System.out.println(this.n3);
		System.out.println(super.n3);
		int result = super.add(n1, n2) - 1;
		System.out.println("**********************");
		return result;

	}

	// method overloading
	public int mod(int n1, int n2) {
		System.out.println("Mod method from AdvCalculator invoked");
		int w = n1 % n2;
		System.out.println(w);
		System.out.println("**********************");
		return w;

	}

	public int mod(int n1, int n2, int n3) {
		System.out.println("Mod method from AdvCalculator invoked");
		int w1 = n1 % n2 % n3;
		System.out.println(w1);
		System.out.println("**********************");
		return w1;

	}

	public void print() {
		// local var
		int n4 = 600;

		System.out.println("this n4 -> " + this.n4);
		System.out.println("n4 -> " + n4);
		System.out.println("**********************");

	}

	public static void main(String[] args) {

		// A. child object refers to child class (it can access methods of both parent
		// and child)
		AdvCalculator advCalcOne = new AdvCalculator(3, 4);

		// 1. method overriding example - where child class add method is invoked
		// int res = advCalcOne.add(1, 2);

		// System.out.println("results of child add method is -> " + res);
		// 2. parent method is invoked
		// advCalcOne.div(10, 2);

		// B. only parent class methods are invoked.
		// SimpleCalculator simpleCalc = new AdvCalculator();
		// simpleCalc.add(2, 4, 6);

		// C. Only PARENT CLASS METHODS ARE INVOKED
		// SimpleCalculator simpleCalctwo = new SimpleCalculator();
		// simpleCalctwo.mul(4, 5);

		// D. child object refers to child class (this is not possible)
		// advCalcTwo.add(1, 2);

//		System.out.println("Super with variable :" + advCalcOne.add(1, 3));	
//		advCalcOne.print();		
//		System.out.println("n4 value using advCalcOne object --> " + advCalcOne.n4);
//		
		// Encapsulation
		// advCalcOne.setNumber(23);
		// System.out.println(advCalcOne.getNumber());
	}

}

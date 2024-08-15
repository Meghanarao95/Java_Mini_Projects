package Calculator;

public class SimpleCalculator extends AbstractCalculator implements InterfaceCalculator {

	// constructor
	public SimpleCalculator() {

		System.out.println("In default constructor of SimpleCalculator");

		System.out.println("**********************");

	}

	// parameterised constructor
	public SimpleCalculator(int n1, int n2) {

		System.out.println("In parameterized constructor of SimpleCalculator");
		System.out.println("**********************");

	}

	// super keyword
	int n3 = 120;

	public int add(int n1, int n2) {

		System.out.println("add method with two parameters from SimpleCalculator invoked");

		int z = n1 + n2;
		System.out.println("Add method of parent class :" + z);
		System.out.println("**********************");
		return z;

	}

	// method overloading

	public int add(int n1, int n2, int n3) {
		System.out.println("add method   with three parameters from SimpleCalculator invoked");
		int z = n1 + n2 + n3;
		System.out.println(z);
		System.out.println("**********************");
		return z;

	}

	public int sub(int n1, int n2) {

		System.out.println("sub method from SimpleCalculator invoked");
		int z = n1 - n2;
		System.out.println(z);
		System.out.println("**********************");
		return z;

	}

	public int mul(int n1, int n2) {

		System.out.println("mul method from SimpleCalculator invoked");
		int z = n1 * n2;
		System.out.println(z);
		System.out.println("**********************");
		return z;
	}

	public int div(int n1, int n2) {
		System.out.println("div method from SimpleCalculator invoked");
		int z = n1 / n2;
		System.out.println(z);
		System.out.println("**********************");
		return z;

	}

	// 6. Abstraction

	// Abstract class
	public void cos() {

		System.out.println("In Abstract method of abstract class(AbstractCalculator)and the value is " + Math.cos(90));
		System.out.println("**********************");
	}

	// Interface
	public void tan() {
		System.out.println("In Abstract method of Interface(InterfaceCalculator)and the value is " + Math.tan(90));
		System.out.println("**********************");
	}

	public void cot() {
		System.out.println("In Abstract method of Interface(InterfaceCalculator)and the value is " + Math.atan(90));
		System.out.println("**********************");

	}

	public static void main(String[] args) {

		// // A. only parent class methods are invoked.
		SimpleCalculator simpleCalc = new SimpleCalculator();

		simpleCalc.add(3, 4);

		simpleCalc.add(3, 4, 6);

		simpleCalc.sub(5, 2);

		simpleCalc.mul(3, 4);

		simpleCalc.div(10, 2);

		// B. only parent class methods are invoked.
		SimpleCalculator simpleCalcthree = new AdvCalculator();
		simpleCalcthree.add(2, 4, 6);

		// 6. to call AbstractCalculator class's non abstract method
		simpleCalc.sin();
		simpleCalc.cos();

		// 6. to call variables from abstract class
		System.out.println("before " + simpleCalc.a);

		// 6. to edit the variable from abstract class
		simpleCalc.a = 25;
		System.out.println(" after " + simpleCalc.a);

		// to call variables from Interface
		System.out.println("before " + simpleCalc.b);

		// 6. to edit the variable from Interface - cannot be done as by default,
		// variables in interface are static and final
		// simpleCalc.b =100;

		System.out.println(" after " + simpleCalc.b);
		// C. child object refers to child class (it can access methods of both parent
		// and child)
		AdvCalculator advCalcOne = new AdvCalculator();
		advCalcOne.add(2, 8);

		// D. child object refers to child class (this is not possible)
		// AdvCalculator advCalcTwo = new SimpleCalculator();
		// advCalcTwo.add(1, 2);

		// 7.Lambda Expression with functional Interface

		FunctionalInterfacewithLambda obj = () -> System.out.println("In Functional Interface with lambda expression");
		
		obj.show();

	}

}

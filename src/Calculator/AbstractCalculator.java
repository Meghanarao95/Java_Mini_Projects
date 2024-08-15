package Calculator;

abstract class AbstractCalculator {
	
	int a=10;
	

	public void sin() {

		System.out.println("In Abstract class implementation for sin");
		System.out.println(Math.sin(90));
	}

	public abstract void cos();
}

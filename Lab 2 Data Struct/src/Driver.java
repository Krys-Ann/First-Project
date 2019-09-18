
public class Driver {

	public static void main(String[] args) {
		RecursiveMathLib recursionLibrary 
		= new RecursiveMathLib();
		
		IterationMathLib iterationLibrary
		= new IterationMathLib();
		
		System.out.println("---- Recursion ----");
		runTestCode(recursionLibrary);
		System.out.println("---- Iteration ----");
		runTestCode(iterationLibrary);
		

	}
	
	public static void runTestCode(MathLib library) {
		System.out.println("GCD of 4,2 = " 
				+library.gcd(4,2));

		System.out.println("ACK of 9,1 = " 
				+library.ack(4,2));
		
		System.out.println("FIB of 22= " 
				+library.fib(4));
		
		System.out.println("Hanoi of 10 = " 
				+library.hanoi(4));
	}
	
}

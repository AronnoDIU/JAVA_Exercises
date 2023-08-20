package ExceptionHandling;

/**
 * 
 * @author Aronno
 *
 */

/*
 * Try statements can be implicitly via calls to methods.
 */
public class MethodNestedTry {

	static void nestedTry(int a) {
		try { // Nested try block

			/*
			 * If one command-line arg is used, then a divided-by-zero exception will be
			 * generated by the following code.
			 */

			if (a == 1)
				a = a / (a - a); // Divided by zero

			/*
			 * If two command-line args are used, then generate an out-of-bounds exception.
			 */

			if (a == 2) {
				int c[] = { 1 };
				c[42] = 99; // Generated an out-of-bounds exception.
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
	}

	public static void main(String[] args) {

		try {
			int a = args.length;

			/*
			 * If no command-line args are present, the following statement will generate a
			 * divided-by-zero exception.
			 */
			int b = 42 / a;
			System.out.println("a = " + a);

			nestedTry(a);
		} catch (ArithmeticException e) {
			System.out.println("Divided by 0: " + e);
		}

	}

}
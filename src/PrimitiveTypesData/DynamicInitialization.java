package PrimitiveTypesData;

/**
 * 
 * @author Aronno
 *
 */

//Demonstrate Dynamic Initialization
public class DynamicInitialization {

	public static void main(String[] args) {
		
		double a = 3.0, b = 4.0;
		
		//C is dynamically initialized
		double c = Math.sqrt(a * a + b * b);
		
		System.out.println("Hypotenuse is "+c);
		

	}

}
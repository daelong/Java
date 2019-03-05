
public class Main {
	//5! = 5x4x3x2x1
	public static int Factorial(int number) {
		if(number == 1);
		{
			return 1;
		}
		else
		{
			return number * Factorial(number -1);
		}
			
	}
	
	public static void main(String[] args) {
	System.out.println(Factorial(10));
	}

}

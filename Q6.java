package lmda.Assignment.anurag;
interface Function
{
	int factorial(int n);
}
public class Q6 {

	public static void main(String[] args) {
		Function ab=(x)->{
			 int result = 1;
	        for (int i = 1; i <= x; i++) {
	            result *= i;
	        }
	        return result;
	    
		};
		System.out.println(ab.factorial(5));
	}

}

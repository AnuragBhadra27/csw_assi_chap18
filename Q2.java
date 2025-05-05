interface Calculator{
	int calculate(int x,int y);
}
public class Q2 {

	public static void main(String[] args) {
		Calculator cadd= (x,y)->{return x+y;};
		Calculator csub= (x,y)->{return x-y;};
		Calculator cmul= (x,y)->{return x*y;};
		Calculator cdiv= (x,y)->{
			/*try {
				return x/y;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				return 0;
			}*/
				return x/y;
			
		};
		
		try {
		System.out.println("Addition is "+cadd.calculate(10, 2));
		System.out.println("Subtraction is "+csub.calculate(10, 2));
		System.out.println("Multiplication is "+csub.calculate(10, 2));
		System.out.println("Division is "+cdiv.calculate(10, 2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
}

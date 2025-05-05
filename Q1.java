package lmda.Assignment.anurag;
interface StringProcessor{
	int process(String str);
}
public class Q1 {

	public static void main(String[] args) {
		StringProcessor ab=(str)->{
			return str.length();
			};
		String s="iter";
		System.out.println("Length of "+ s + " is "+ab.process(s));
	}

}

package lmda.Assignment.anurag;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		ArrayList <String> ab = new ArrayList<>();
		ab.add("Apple");
		ab.add("Avocado");
		ab.add("Pear");
		ab.add("Grapes");
		ab.add("Watermelon");
		 Collections.sort(ab, (str1, str2) -> Integer.compare(str2.length(), str1.length()));	
		 for(String str:ab) {
			 System.out.println(str);
		 }
	}
	



}

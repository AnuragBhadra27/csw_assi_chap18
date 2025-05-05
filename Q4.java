package lmda.Assignment.anurag;
import java.util.*;
interface Shape{
	
	double area();
	default void printArea() {
		 System.out.println("The area is: " + area());
	}
}
public class Q4 {

	public static void main(String[] args) {
		Shape cir=()->{
			double r=2.5;
			return Math.PI*r*r;};
		Shape sqr=()->{
			double r=2.5;
			return r*r;};
		Shape rec=()->{
			double r=2.5;
			double l=6.5;
			return r*l;};
		
		cir.printArea();
		sqr.printArea();
		rec.printArea();
	}

}

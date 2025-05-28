package practicearrays;
import java.util.*;
public class equalarraysornot {
public static void main(String[] args) {
	int a[]= {1,2,3};
	int b[]= {3,2,1};
	boolean r=Arrays.equals(a,b);
	if(r) {
		System.out.println("equals");
	}
	else {
		System.out.println("not equals");
	}
}
}

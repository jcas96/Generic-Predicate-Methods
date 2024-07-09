import java.util.function.Predicate;
public class PredicateMethodsGeneric {
	
	//Result function that uses predicate and T to run whether a argument is true or false
	public static <T>void result(Predicate<T> p, T arg) {
		//Uses Predicate test function to check if true or false
		if(p.test(arg)) {
			System.out.printf("The Predicate is true for %S\n", arg);
		}
		else {
			System.out.printf("The Predicate is false for %S\n", arg);
		}
	}

	public static void main(String[] args) {
		Predicate<Integer>p1 =x->x==5;
		for(int x=4;x<7;x++) {
			result(p1,x);
			result(y->y%2==0,x);
		}
		
		
		Predicate<String>p3 = x->x.charAt(0)=='H';
		result(p3, "Hello");
		result(p3, "Good Bye");

	}

}

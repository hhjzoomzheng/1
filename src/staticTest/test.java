package staticTest;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NameAlreadyBoundException;

public class test{
	public static  List<String> name = new ArrayList<>();
	 
	 static {
		 
	 }


	public static void main(String[] args) {
		
		System.out.println(test.name);
		System.out.println(test.name);
	}
	
}

 class Test3 {
	
	public static void main(String[] args) {
		test test = new test();
		System.out.println(test.name);
	}
}
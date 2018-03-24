package oop.Polymorphism;

public class ExecuteTest {
	public static void main(String[] args) {
		TestingInteger Testint=new TestingInteger();
		System.out.println("The value of c is: "+ Testint.TestInteger(15, 46));
		System.out.println("The value of b is: "+ Testint.TestInteger(30, "you have seen output, congrats! code executed"));
		System.out.println("The value of z is: "+ Testint.TestInteger(12, 30, 50, 40, 30));
	
	
		Test2 overriding=new Test2();
		System.out.println("The value of z is: "+ overriding.TestInteger(12, 30, 50, 40, 30));
		
	}
}

package oop.Polymorphism;

public class TestingInteger {

		public int TestInteger (int a, int b) {
			int c = a*b/2;
			return c;
		}
		public int TestInteger (int a, String as) {
			int b= a;
			System.out.println(as);
			return b;
	
		} 
		public int TestInteger (int a, int b, int c, int d, int e) {
			int z= a+b+c+d+e;
			return z;
		}
	

}

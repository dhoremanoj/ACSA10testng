package abc;

public class Dr1 {

	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		System.out.println("============");
		A a1 = b1;
		a1.test();//method shadowing
	}

}

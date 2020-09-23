package abc;

public class Dr2 {

	public static void main(String[] args) {
		
		Laila l1 = new Leela();//upcasting
		System.out.println(l1.age);
		System.out.println("========================");
		Leela l2 = (Leela) l1;
		System.out.println(l2.age);//variable shadowing

	}

}

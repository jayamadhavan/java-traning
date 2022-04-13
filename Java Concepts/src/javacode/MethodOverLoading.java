package javacode;

public class MethodOverLoading {

	int a = 10;
	String Name = "Apple";
	int b = 20;
	int c = 15;
	String Name1 = "Carrot";

	void fruit() {
		System.out.println("Fruit collection");
		System.out.println(a);
		System.out.println(Name);
	}

	void Vegetables() {
		System.out.println("Vegetable collection");
		System.out.println(b);
		System.out.println(c);
		System.out.println(Name1);

	}

	MethodOverLoading() {
		System.out.println("Default Method");
		System.out.println(a);
		System.out.println(Name);

	}

	MethodOverLoading(int d, int e, String name1) {
		System.out.println(d);
		System.out.println(e);
		System.out.println(Name1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading obj = new MethodOverLoading();
		System.out.println();
		new MethodOverLoading(20, 15, "Carrot");
		System.out.println();

		System.out.println("-------------------");

		obj.fruit();
		System.out.println();

		obj.Vegetables();
		System.out.println((20 + 15) + "Name");
	}

}

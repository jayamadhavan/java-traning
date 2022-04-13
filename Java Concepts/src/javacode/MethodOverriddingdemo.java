package javacode;

public class MethodOverriddingdemo {

	void details2(int b, String name1, int c) {

		int sum = b + c;
		System.out.println(sum);
		System.out.println(name1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriddingdemo overriding = new MethodOverriddingdemo();
		overriding.details2(10, "adding", 30);

	}

}

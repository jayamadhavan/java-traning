package javacode;

public class GSdemo1 extends GSdemo {

	void bank2() {
		System.out.println("Account Holder Detils");
		super.bank();
	}

	public static void main(String[] args) {
		GSdemo1 obj = new GSdemo1();
		obj.bank();
		System.out.println("-------");

		obj.bank2();
		System.out.println("-------");
		obj.setAcNum(34214);
		obj.setName("Lakshmi");
		obj.bank();

	}

}

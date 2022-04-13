package javacode;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> Name = new LinkedList<String>();
		Name.add("jaya");
		Name.add("manju");
		Name.add("Suba");
		Name.add("Nithiya");
		System.out.println(Name);
		Name.getFirst();
		System.out.println("removelastName :" + "Nithiya");
		Name.removeLast();
	}

}

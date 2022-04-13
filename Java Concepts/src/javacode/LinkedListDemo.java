package javacode;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> name = new LinkedList<String>();
		name.add("Rajesh");
		name.add("john");
		name.add("Vimal");
		name.add("Roshan");

		System.out.println(name);
		name.getFirst();
		System.out.println("get first :" + name);
		name.getLast();
		System.out.println(name);

//		name.addFirst("RK Raj");
//		System.out.println("after add first:"+name);
//		name.addLast("Vinayakraj");
//		System.out.println("Ater add last:"+name);
//		System.out.println("---------------------");
//		System.out.println(name);
//		name.removeFirst();
//		System.out.println("After removefirst:"+name);
//		name.removeLast();
//		System.out.println(name);
//		System.out.println("------B/W Method Difference------");
//		System.out.println("After removelast:"+name.removeLast());
//		name.remove(0);
//		System.out.println("Remove index of zero:"+name);
//		System.out.println("---------------------------");
//		System.out.println(name);

	}

}

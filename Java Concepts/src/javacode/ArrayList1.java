package javacode;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> flower = new ArrayList<>();
		flower.add("Rose");
		flower.add("Lilly");
		flower.add("SunFlower");

		System.out.println(flower);
		System.out.println(flower.size());
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println(flower.contains("Rose"));
		System.out.println(flower.contains("Mullai"));
		System.out.println("index of get(2):" + flower.get(2));
		System.out.println("-------Index methods-----------");
		System.out.println(flower.indexOf("Lilly"));
		System.out.println(flower.indexOf("SunFlower"));
		System.out.println(flower.indexOf("Roja"));
		System.out.println(flower);
		System.out.println(flower.lastIndexOf("SunFlower"));
		System.out.println(flower.contains(null));
		System.out.println(flower.indexOf("RJ"));
	}

}

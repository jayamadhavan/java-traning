package javacode;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> car = new ArrayList<String>();
		car.add("TATA");
		car.add("Maruthi");
		car.add("Ford");
		car.add("Benz");
		car.add("Ferrari");
		System.out.println(car);
		System.out.println(car.size());
		System.out.println("********for loop********");
		for (int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
		System.out.println(car);
		car.add(1, "voloswagon");
		System.out.println(car);
//		car.clear();
//		System.out.println(car);
		for (String i : car) {
			System.out.println(i);
		}
		System.out.println(car.contains("TATA"));
		System.out.println(car.contains("MG"));
		System.out.println("index of get(2):" + car.get(2));
		System.out.println("-------Index methods-----------");
		System.out.println(car.indexOf("TATA"));
		System.out.println(car.indexOf("Ford"));
		System.out.println(car.indexOf("MG"));
		System.out.println(car);
		System.out.println(car.lastIndexOf("Ferrari"));
		System.out.println("-----------Integer-----------");

		ArrayList<Integer> value = new ArrayList<Integer>();

		value.add(10);
		value.add(15);
		value.add(20);
		value.add(25);
		value.add(30);
		System.out.println(value);
		value.remove(3);
		value.add(3, 55);
		System.out.println(value);
		value.remove(2);
		System.out.println(value);

		for (Integer i : value) {
			System.out.println(i);
		}

		Collections.sort(value);
		System.out.println(value);
		Collections.sort(car);
		System.out.println(car);

	}

}

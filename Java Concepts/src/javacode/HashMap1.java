package javacode;

import java.util.HashMap;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> car = new HashMap<Integer, String>();
		car.put(01, "BMW");
		car.put(02, "VolVo");
		car.put(03, "Bense");
		car.put(04, "RD");
		System.out.println(car);
		for (Integer carname : car.keySet()) {
			System.out.println(carname);
		}
	}
}

package javacode;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Double, Double> decimal = new HashMap<Double, Double>();
		decimal.put(1.0, 55.5);

		HashMap<Double, String> detail = new HashMap<Double, String>();
		detail.put(6.5, "vishal");

		System.out.println(decimal);
		System.out.println(detail);
		System.out.println("#$##$#$#$#$#$#$#$#$#$#$#$");

		HashMap<Integer, String> car = new HashMap<Integer, String>();
		car.put(01, "TATA");
		car.put(02, "Maruthi");
		car.put(03, "Ford");
		car.put(04, "BMW");

		System.out.println(car);
		System.out.println(car.get(03));

		for (Integer carname : car.keySet()) {
			System.out.println(carname);
		}
		System.out.println("--------------");
		for (String carname : car.values()) {
			System.out.println(carname);
		}

		HashMap<String, String> city = new HashMap<String, String>();
		city.put("TamilNadu", "Chennai");
		city.put("Kerala", "Kochi");
		city.put("Telugana", "Hyderabad");
		city.put("Andhra pradesh", "Amaravathi");

		System.out.println(city);
		System.out.println(city.get("TamilNadu"));
		System.out.println("-=-=-=-=-=key-=-=-=-=-=-");
		for (String city1 : city.keySet()) {
			System.out.println(city1);
		}
		System.out.println("-------value--------");
		for (String city1 : city.values()) {
			System.out.println(city1);
		}
		System.out.println("/*/*/*//*/*/*/*/*/*/");
		System.out.println(city.remove("Kerala"));
		// ***System.out.println(city.remove("Tamil Nadu","Chennai"));
	}

}

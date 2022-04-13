package javacode;


	public class MethodOverloadingdemo {

		int a = 10;
		String name = "RK";
		int b;
		String name1 = null;
		int c;

		void details() {
			System.out.println("Default Method");
			System.out.println(a);
			System.out.println(name);
		}

		void details1(int b, String name1) {
			System.out.println("2-Parameterized Method");
			System.out.println(b);
			System.out.println(name1);
		}

		void details2(int b, String name1, int c) {
			System.out.println("3-Parameterized Method");
			System.out.println(b);
			System.out.println(name1);
			System.out.println(c);
		}

		MethodOverloadingdemo() {
			System.out.println("default constructor");
			System.out.println(a);
			System.out.println(name);
		}

		MethodOverloadingdemo(int b, String name1) {
			System.out.println("2-Parameterized constructor");
			System.out.println(b);
			System.out.println(name1);
		}

		MethodOverloadingdemo(int b, String name1, int c) {
			System.out.println("3-Parameterized constructor");
			System.out.println(b);
			System.out.println(name1);
			System.out.println(c);
		}

		public static void main(String[] args) {
			// For calling construtors:

			MethodOverloadingdemo obj = new MethodOverloadingdemo();
			System.out.println();
			new MethodOverloadingdemo(85, "rajesh");
			System.out.println();
			new MethodOverloadingdemo(95, "kannan", 65);

			System.out.println("--------------------");

			// For calling Methods:

			obj.details();
			System.out.println();
			obj.details1(85, "rajesh");
			System.out.println();
			obj.details2(95, "kannan", 65);

		}

	}


	

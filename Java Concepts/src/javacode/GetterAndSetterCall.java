package javacode;

public class GetterAndSetterCall extends GetterAndSetter {

	void studentdetails2() {
		System.out.println("SchoolName:Tips");
		super.studentdetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterAndSetterCall obj = new GetterAndSetterCall();
		obj.studentdetails();
		System.out.println("-------------------");

		obj.studentdetails2();
		System.out.println("--------------");

		obj.setStudentname("Shaambav");
		obj.setId(12345);
		obj.studentdetails();
	}

}

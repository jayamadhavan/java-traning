package javacode;

public class GetterAndSetter {

	private String studentname = "Tharun";
	private int id = 15142;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	GetterAndSetter() {
		studentname = getStudentname();
		id = getId();
	}

	void studentdetails() {
		System.out.println("studentname :" + studentname);
		System.out.println("id :" + id);
	}

}

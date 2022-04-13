package javacode;

public class DesktopG_S {

	private int AcNO = 1245698;
	private String password = "PASSWORD";

	public int getAcNO() {
		return AcNO;
	}

	public void setAcNO(int acNO) {
		AcNO = acNO;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	DesktopG_S() {
		AcNO = getAcNO();
		password = getPassword();
	}

	void bank() {
		System.out.println(AcNO);
		System.out.println(password);
	}

}


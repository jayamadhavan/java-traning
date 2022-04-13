package javacode;

public class DesktopGSCallTryCatch extends DesktopG_S {
	
	void bank2() {
		System.out.println("AC holder Name: RK");
		super.bank();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesktopGSCallTryCatch obj = new DesktopGSCallTryCatch();
		obj.bank();
		System.out.println("-------------");
		obj.bank2();
		System.out.println("-------------");
		obj.setAcNO(789456);
		obj.setPassword("GetterandSetter");
		obj.bank();
		

	}

}

package javacode;

public class GSdemo {
	public int AcNum = 12345;
	public String Name = "Jaya";
	
	public int getAcNum() {
		return AcNum;
	}

    public void setAcNum(int acNum) {
		AcNum = acNum;
	}

    public String getName() {
		return Name;
	}

    public void setName(String name) {
		Name = name;
	}
    GSdemo() {
    	AcNum = getAcNum();
    	Name = getName();
    }
   
    void bank() {
    	System.out.println(AcNum);
    	System.out.println(Name);
    }
    
}

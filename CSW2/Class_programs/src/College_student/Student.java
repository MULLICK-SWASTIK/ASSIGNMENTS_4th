package College_student;


public class Student extends College {
	private String stu_name, branch;
	private long regdno;
	
	public String getStu_name(){
		return stu_name;
	}
	
	public String getBranch(){
		return branch;
	}
	
	public long getRegdno(){
		return regdno;
	}
	
	public void display() {
		System.out.println("College name: "+getCol_name()+
				"\nAddress: "+getAddress()+
				"\nNo. of branches: "+no_branch+
				"\nStudent name: "+stu_name+
				"\nSelected branch: "+branch+
				"\nRegd. no.: "+regdno);
	}
	
	Student(String col_name, String address, int no_branch, String stu_name, String branch, long regdno){
		super(col_name, address, no_branch);
		this.stu_name=stu_name;
		this.branch=branch;
		this.regdno=regdno;
	}
	
}

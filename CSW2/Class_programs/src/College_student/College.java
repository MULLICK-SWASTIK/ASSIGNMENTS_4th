package College_student;

public class College {
	private String col_name, address;
	protected int no_branch;
	public String getCol_name(){
		return col_name;
	}
	public String getAddress(){
		return address;
	}
	College(String col_name, String address, int no_branch){
		this.col_name=col_name;
		this.address=address;
		this.no_branch=no_branch;
	}
}

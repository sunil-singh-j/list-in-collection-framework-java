package demo;

//public class Student implements Comparable<Student> {// for comparable
public class Student  {
	private String name;
	private String phone ;
	private int sid;
	
	
	
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.sid-o.sid;
//	}
	
	
	
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", sid=" + sid + "]\n";
	}
	public Student(String name, String phone, int sid) {
		super();
		this.name = name;
		this.phone = phone;
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}

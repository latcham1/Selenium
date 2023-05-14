
public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("id value"+ id);
	}
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("id and name is: "+ id + ", "+name);
	}
	public void getStudentInfo(String emailid, long phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("email & phoneNumber is: "+ emailid + ", "+phoneNumber);
	}
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(001);
		stud.getStudentInfo(002, "Latcham");
		stud.getStudentInfo("a@b.com", 9094020939l);
	}
}

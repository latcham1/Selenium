package may23;
class Student
{
	String name;
	int age;
}
public class Page49Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stubru
		Runtime r= Runtime.getRuntime();
Student s1= new Student();
Student s2= new Student();
Student s3= new Student();
s1=s3;
s3=s2;
s2=null;

System.out.println(r.);
r.gc();
	}

}

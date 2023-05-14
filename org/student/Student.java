package org.student;

import org.department.Department;

public class Student extends Department{
	 void studentName() {
		// TODO Auto-generated method stub
System.out.println("studentName from Student child class");
	}
	  void studentDept() {
		// TODO Auto-generated method stub
System.out.println("studentDept  from Student child class");
	}
	   void studentId() {
		// TODO Auto-generated method stub
System.out.println("studentId from Student child class");
	}
	   public static void main(String[] args) {
		Student stud = new Student();
		stud.studentDept();stud.studentDept();stud.studentId();
		stud.deptName();
		stud.collegeName();stud.collegeCode();stud.collegeRank();
	}
}

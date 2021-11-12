package org.college;
//child class
public class College {
public void collegeName() {
	System.out.println("name saveetha");
	

}
     public void collegeCode() {
		System.out.println("code 999");
       System.out.println("j");
	}
     
     public void collegeRank() {
		System.out.println("rank 5 ");

	}
   
      public static void main(String[] args) {
		College nd = new College ();
		nd.collegeCode();
		nd.collegeName();
		nd.collegeRank();
		Student jd = new Student ();
		jd.studentDept();
		jd.studentId();
		jd.studentNmae();
		Hostel jk = new Hostel ();
		jk.hostelName();
		Dept bb = new Dept  ();
		bb.depthName();
	}
}

package SampleArrayprograms;

import java.util.*;
class Students{
	String name;
	int rollno;
	int marks;
	
}
public class Student {

	public static void main(String[] args) {
		Students s1 =new Students();
		Students s2 =new Students();
		Students s3 =new Students();
		
		s1.name="devika";
		s1.rollno=24;
		s1.marks=100;
		
		s2.name="meenu";
		s2.rollno=39;
		s2.marks=70;
		
		s3.name="amitha";
	    s3.rollno=50;
		s3.marks=80;
	 Students studentarray[]=new Students[3];
	 studentarray[0]=s1;
	 studentarray[1]=s2;
	 studentarray[2]=s3;
	 for(int i=0;i<studentarray.length;i++)
	 {
		 System.out.println(studentarray[i].name +" : "  + studentarray[i].rollno+ " : " + studentarray[i].marks );
			
	}

}
}

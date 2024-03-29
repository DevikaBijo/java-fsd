package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{    
	 int id;    
	 String name;    
	 Person(int id, String name) {    
	  this.id = id;    
	  this.name = name;    
	 }    
	}    
	class Student extends Person{    
	 String course;    
	 int fee;    
	 public Student(int id, String name, String course, int fee) {    
	  super(id,name);    
	  this.course=course;    
	  this.fee=fee;    
	 }    
	}    
	public class Sampleserialization  
	{    
	 public static void main(String args[])  
	 {    
	    try{        
	  Student s1 =new Student(211,"ravi","Engineering",50000);      
	  FileOutputStream fout=new FileOutputStream("D:\\new.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();        
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e)
	    {
		  System.out.println(e);
	    }    
	  try{
		  
	  FileInputStream fin=new FileInputStream("D:\\new.txt");
	  ObjectInputStream in=new ObjectInputStream(fin);   
	  Student s1=(Student)in.readObject();    
	  System.out.println(s1.id+" "+s1.name+" "+s1.course+" "+s1.fee);        
	  in.close();    
	  }catch(Exception e){System.out.println(e);}    
	 }    
	}  
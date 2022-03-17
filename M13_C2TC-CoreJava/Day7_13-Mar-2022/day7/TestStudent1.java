//program of initialize object through reference variable

package day7;

class Student
{
	int id;
	String name;
}
class TestStudent1 
{
	public static void main(String[] args)
	{
		// creating objects
		Student s1= new Student();
		Student s2= new Student();
		
		//initializing objects by reference 
		s1.id =1007;
		s1.name= "Aniket";
		s2.id= 1010;
		s2.name= "Vinay";
	
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}
}

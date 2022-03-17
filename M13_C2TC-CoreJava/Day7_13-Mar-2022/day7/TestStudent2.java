//program of initialize object through method

package day7;

class Student1
{
	int rollno;
	String name;
	void insertRecord(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void displayInfo()
	{
		System.out.println(rollno+" "+name);
	}
}
class TestStudent2
{
	public static void main(String[] args)
	{
		Student1 s1= new Student1();
		Student1 s2= new Student1();
		
		// called insert method
		s1.insertRecord(1011,"Rutik"); 
		s2.insertRecord(1020,"Siddhesh");
		
		//called display method
		s1.displayInfo();
		s2.displayInfo();
	}
}

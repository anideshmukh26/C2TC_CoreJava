// program of instance variable

package day4;


public class Student
{
	String name;
	int marks;
	 
	public Student (String studentName)
	{
		name = studentName;
	}
	
	public void setMarks(int studentMarks) 
	{
		marks = studentMarks;
	}
	
	public void printStudent()  // This method prints the student details
	{
		System.out.println("Name: " + name );
		System.out.println("Marks:" + marks);
	}
	 
	public static void main(String args[])
	{
		// initialization of object
		Student SOne = new Student("Rushi");
		Student STwo = new Student("Siddhu");
		Student SThree = new Student("Vedant");
		 
		// instance variable giving reference of objects
		SOne.setMarks(69);
		STwo.setMarks(90);
		SThree.setMarks(75);
		 
		SOne.printStudent();
		STwo.printStudent();
		SThree.printStudent();
	 
	}
}
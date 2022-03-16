// Example of Constructor program (no-argument & parameterized)

package day3;

class Person
{
	int age;
	int height;
	String name;
	
	public Person()  // No-argument constructor   
	{
		System.out.println("Initialization using no-argument constructor");
	    age = 25;
	    height = 160;
	    name = "Aniket";
    }
	
	public Person(int a, int h, String n) // Parameterized constructor
	{
		System.out.println("Initialization using parameterized constructor");
        age = a;
        height = h;
        name = n;
    }     
	
	public static void main(String [] args)
	{                    
		Person p1 = new Person(); // call no-argument constructor 
        p1.print();
        Person p2 = new Person(23,170,"Harshal"); // call parameterized constructor           
        p2.print();
    }
	
	void print()
	{                    
		System.out.println("age = "+age+", height = "+height+", name = "+name);
    }  
}
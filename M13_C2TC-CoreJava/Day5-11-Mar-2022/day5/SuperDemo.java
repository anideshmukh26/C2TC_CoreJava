// Example of super keyword

package day5;


class Superclass  //parent class
{
   int num = 10;
}
class Subclass extends Superclass   // child class
{
    int num = 20; // same num variable declare as superclass
    
    void printNumber()
    {
    	System.out.println(super.num); // super keyword access the variable of superclass (parent class)
    }
}

class SuperDemo
{
    public static void main(String args[])
    {
		Subclass obj= new Subclass();
		obj.printNumber();	
    }
}
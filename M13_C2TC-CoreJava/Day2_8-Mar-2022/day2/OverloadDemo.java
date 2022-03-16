// Method Overloading program for calculating area of different geometrical shapes

package day2;

class Overload
{
    void area(int x)
    {
        System.out.println("the area of the square is "+x*x+" sq units");
    }
    void area(int x, int y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class OverloadDemo 
{
     public static void main(String args[]) 
	{
	   Overload ob = new Overload();
	   ob.area(10);
	   ob.area(5,8);
	   ob.area(4.5);
        }
}

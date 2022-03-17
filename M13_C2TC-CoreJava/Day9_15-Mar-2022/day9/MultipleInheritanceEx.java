// program of Multiple Inheritance (Diamond Problem)

package day9;

class A
{
	void msg()
	{
		System.out.println("Hello");
	}
}
class B
{
	void msg()
	{
		System.out.println(" Welcome");
	}
}
class MultipleInheritanceEx extends A,B // child class extends both parent A & B class i.e not supported in java through class
{
	public static void main(String[] args)
	{
		MultipleInheritanceEx obj= new MultipleInheritanceEx();
		obj.msg(); // msg method invoked
	}
}

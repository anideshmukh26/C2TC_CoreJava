// Inheritance & Method Overriding Program for calculating area of different geometrical shapes

package day2;

class GeometricalShape  // parent/base/super class
{  
   
     public int length = 7;  
}  

class Square extends GeometricalShape   // square (child class) inherit the properties of GeometricalShape (Parent class) with extends keyword  
{  
     void area()  //area method  
     {  
          int area = length * length;   
          System.out.println("Area of square : "+area+ "sq units");  
     }  
}  
  
class Rectangle extends GeometricalShape   
{  
     void area() //method overriding
     {    
          int breadth = 5;  
          int area = length * breadth;   
          System.out.println("Area of rectangle : "+area+ "sq units");  
     }  
}  
  
class Circle extends GeometricalShape   
{  
     void area()  
     {    
          float area = 3.14f * length * length;  
          System.out.println("Area of circle : "+area+ "sq units");  
     }  
}  
  

class InheritanceDemo  // class with main method 
{  
     public static void main(String[] args)  
     {   
    	 //instantiation of objects of class child class
          Square sq = new Square(); 
          Rectangle rec = new Rectangle();  
          Circle cir = new Circle();  
             
          // calculating area by calling objects
          sq.area();  
          rec.area();  
          cir.area();  
     }  
} 
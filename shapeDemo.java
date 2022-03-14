/* Create an abstract base class called Shape which stores two double type 
values i.e. dimension of shape that could be used to compute the area of 
figures. Derive two specific classes called Triangle and Rectangle from the 
base Shape. Use the base class constructor for initializing data members. Add 
one member method double area () to compute and display area of shapes. 
Write Java program to implement run time polymorphism by using Dynamic 
Method Dispatch mechanism*/


abstract class Shape
{   double dim1,dim2;

    Shape(double a, double b)
    {   
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Triangle extends Shape
{
    public Triangle(double a,double b)
    {
        super(a,b);
    }

    double area()
    {
        return 0.5*dim1*dim2;
    }
}

class Rectangle extends Shape
{
    public Rectangle(double a,double b)
    {
        super(a,b);
    }

    double area()
    {
        return dim1*dim2;
    }
}

public class shapeDemo
{
    public static void main(String args[])
    {
            Rectangle r1 =  new Rectangle(1.1, 1.5);
            Triangle t1 = new Triangle(3, 6);

            Shape s1;

            s1 = r1;
            System.out.println("Area of rectangle "+s1.area());

            s1 = t1;
            System.out.println("Area of triangleangle "+s1.area());


    }
}
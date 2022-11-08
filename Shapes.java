import java.util.*;
abstract class Shape{
	 abstract void NumberOfSide();
}

class Rectangle extends Shape{
int sides = 4;
void NumberOfSide(){
	System.out.println("Number of Rectangle sides = "+sides);
}
}
class Triangle extends Shape{
int sides = 3;
void NumberOfSide(){
	System.out.println("Number of Triangle sides = "+sides);
}
}
class Hexagon extends Shape{
int sides = 6;
void NumberOfSide(){
	System.out.println("Number of Hexagon sides= "+sides);
}
}
public class Shapes{
	public static void main(String args[]){
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Hexagon s3 = new Hexagon();
		s1.NumberOfSide();
		s2.NumberOfSide();
		s3.NumberOfSide();
	}
}

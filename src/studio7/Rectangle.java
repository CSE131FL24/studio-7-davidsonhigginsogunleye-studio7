package studio7;

public class Rectangle { //the class we create is the type

	private double length;
	private double width;
	private double area;
	private double perimeter;
	private boolean isSquare;

	
	public Rectangle(double length, double width) { //only one constructor per class
		//this is the constructor
		this.length = length;
		this.width = width;
	}

	
	public double area() { //method
		//this is the method that we create to run the instance variable, area
		
		this.area = this.length * this.width; //anything instance variable related should have "this."
		return this.area; //give the user the area
	}


	public double perimeter() { //method
		this.perimeter = (this.length * 2) + (this.width * 2); //"this."
		return this.perimeter; //give the user the perimeter
	}
	
	
	public boolean isSquare() { //method
		if (this.length == this.width) {
			this.isSquare = true;}
		else {
			this.isSquare = false;  //since a boolean is automatically set to false, we don't need the else statement since if it is already untrue, it will default to false
		}
		return this.isSquare;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle numberOne = new Rectangle(3,5.5); //we created a new rectangle using the new type, rectangle
		System.out.println(numberOne.area()); //we must write the () to indicate that we are calling a method, not the instance variable
		System.out.println(numberOne.perimeter());
		System.out.println(numberOne.isSquare());
	}

}

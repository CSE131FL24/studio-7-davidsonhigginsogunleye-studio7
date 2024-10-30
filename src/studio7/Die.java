package studio7;

public class Die {

	private int sides;
	private int rollVal;
	
	public Die(int sides) { //this is the constructor
		this.sides = sides; //set the instance variable to a value
	}
			
	public int roll() { //method for what we are rolling
		this.rollVal = (int) ((Math.random()*this.sides)+1);
		return this.rollVal;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die numberOne = new Die(8);
		Die numberTwo = new Die(13);
		
		System.out.println("You rolled a " + numberOne.roll() + "!  *<|XD");// when we recall a method dont't forget to do the "name.method()"
		System.out.println("Now, you rolled a " + numberTwo.roll() + "...  T-T");
	}

}

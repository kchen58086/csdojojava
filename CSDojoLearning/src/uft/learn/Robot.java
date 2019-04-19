package uft.learn;

public class Robot {
	String Name;
	String Colour;
	int weight;
	Robot lookingAt;
	
	Robot(String name, String colour, int weight){
		this.Name = name;
		this.Colour = colour;
		this.weight = weight;// weight doesn't conflict even though they have the same name
							// because this. refers to the objects atribute, not the 
							// function in the 

	}
	
	public void introduceSelf() {
		System.out.println("My name is " + this.Name); // note this. is referring to the object
													// not the function if function had a 
													// String variable as Name
	}
	
}

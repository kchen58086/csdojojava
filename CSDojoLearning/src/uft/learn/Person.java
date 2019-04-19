package uft.learn;

public class Person {
	String Name;
	String Personality;
	boolean isSitting;
	Robot robotOwned;
	
	Person(String n, String p, boolean i){
		this.Name = n;
		this.Personality = p;
		this.isSitting = i;
	}
	
	public void sitDown() {
		this.isSitting = true;
	}
	
	public void standUp() {
		this.isSitting = false;
	}
}

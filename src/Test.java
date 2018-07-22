
public class Test {
	public static void main(String args[]) {
		Cow c1 = new Cow("cow 1st");
		Cow c2 = new Cow("cow 2nd");
		
		System.out.println("Total of cow: " + Cow.getCount());
	}
}
class Cow {
	private String name;
	private static int numOfCows = 0; 		// Static variable
	
	public Cow(String theName) {
		this.name = theName;
		numOfCows++;
		System.out.println("Cow #" + numOfCows + " created.");
	}
	
	public static int getCount() {			// Static methor
		return numOfCows;
	}
}

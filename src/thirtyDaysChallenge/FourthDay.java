package thirtyDaysChallenge;

public class FourthDay {
	private int age;	
	  
	public FourthDay(int initialAge) {
  		// Add some more code to run some checks on initialAge
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0");
			age = 0;
		} else age = initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
		String judge;
		
		if (age < 13) judge = "You are young";
        else if (age > 13 && age < 18) judge = "You are a teenager";
        else judge =  "You are old";
		
        System.out.println(judge);
	}

	public void yearPasses() {
  		// Increment this person's age.
		age += 1;
	}
}

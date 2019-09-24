package thirtyDaysChallenge;

public class TwelfthDay {

}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
    private int[] scores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String Name, String lastName, int identification, int[] testScores) {
        super(Name, lastName, identification);
        this.scores = testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        int sum = 0;
        char grade = 'T';

        for (int i=0; i<scores.length; i++) {
            sum += scores[i];
        }

        int avg = sum / scores.length;

        if (avg>=90) {
            grade = 'O';
        } else if (avg>=80) {
            grade = 'E';
        } else if (avg>=70) {
            grade = 'A';
        } else if (avg>=55) {
            grade = 'P';
        } else if (avg>=40) {
            grade = 'D';
        } else {
            grade = 'T';
        }

        return grade;
    }
}
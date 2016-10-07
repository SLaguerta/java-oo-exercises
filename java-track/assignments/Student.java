
public class Student {
	private String firstName;
	
	private String lastName;
	
	private int studentID;
	
	private double GPA;
	
	private int credits;
	
	public Student (String firstName, String lastName, int studentID){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		
	}
	
	public Student studentInit (String firstName, String lastName, int studentID, int credits, double GPA){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = credits;
		this.GPA = GPA;
	}
	
	public String getName(){
		
		return this.firstName + " " + this.lastName;
	}
	
	public int getStudentID(){
		
		return this.studentID;
	}
	
	
	public double getGPA(){
		return GPA;
	}
	
	public int getCredits(){
		return credits;
		
	}
	
	public String getClassStanding(){
		if (this.credits <= 30){
			return "Freshman";
		}else if (this.credits <= 60){
			return "Sophomore";
		}else if (this.getCredits() <= 90){
			return "Junior";
		}else return "Senior";
		
	}
	
	public double submitGrade(int credits, double gpatotal){
		//quality score= num of credits for a course*grade of a course 
		//newgpa = sum of all quality scores divided by total number of credits
	}
	
	
	
	
	public String toString(){
		return "Name: " + this.firstName + " " + this.lastName + ", " + this.studentID;
	}

}

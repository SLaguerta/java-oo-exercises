
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
	
	public void studentInit(String firstName, String lastName, int studentID, int credits, double GPA){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = credits;
		this.GPA = GPA;
	}

	public Student(String firstName, String lastName, int studentID, int credits, double GPA){
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
		if (this.credits < 30){
			return "Freshman";
		}else if (this.credits < 60){
			return "Sophomore";
		}else if (this.credits < 90){
			return "Junior";
		}else return "Senior";
		
	}
	
	public void submitGrade( double courseGrade, int courseCredits){
		//quality score= num of credits for a course*grade of a course 
		//newgpa = sum of all quality scores divided by total number of credits
		double qualityScore = courseGrade*courseCredits;
		double qualitySubtotal = this.GPA*this.credits;
		this.credits += courseCredits;
		qualitySubtotal += qualityScore;
		
		
		double newGPA = qualitySubtotal/this.credits;
		
		this.GPA = (double) Math.round(newGPA*1000.0)/1000.0;
		
	}
		
	public double computeTuition(){
		//leftover after 15 credits
		double perCredit = (this.credits%15)*1333.33;
		//for every 15 credits
		double perSemester = (this.credits/15)*20000;
		double tuition = perCredit + perSemester;
		return tuition;
	}
		
	public Student createLegacy(Student parentOne, Student parentTwo){
		return new Student(
				parentOne.getName(),
				parentTwo.getName(),
				parentOne.getStudentID() + parentTwo.getStudentID(),
				Math.max(parentOne.getCredits(), parentTwo.getCredits()),
				(parentOne.getGPA() + parentTwo.getGPA())/2 );
	}
	
	public String toString(){
		return "Name: " + this.firstName + " " + this.lastName + ", " + this.studentID;
	}

}

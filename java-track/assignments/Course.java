
public class Course {
	private String name;
	private int credits;
	private int remainingSeats;
	private Student[] studentRoster;
	
//	public Course (String name, int credits, int remainingSeats, Student[] studentRoster){
//		//Student[] studentRoster = {new Student()};
//		this.name = name;
//		this.credits = credits;
//		this.remainingSeats = remainingSeats;
//		this.studentRoster = new Student[remainingSeats];
//		
//	}
	
	public Course (String name, int credits, int remainingSeats){
		this.studentRoster = new Student [remainingSeats];
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
	}

	public void courseInit(String name, int credits, int remainingSeats){
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public int getRemainingSeats(){
		return this.remainingSeats;
	}
	
	public Student[] getStudentRoster(){
		return this.studentRoster;
	}
	
	public Boolean addStudent(Student newStudent){
		
		if(this.remainingSeats == 0){
				return false;
		}
		for (int i = 0; i< studentRoster.length; i++) {
			if (studentRoster[i] instanceof Student && studentRoster[i].getName() == newStudent.getName()){
				return false;
			}
		
		}
		studentRoster[studentRoster.length - this.remainingSeats] = newStudent;
		remainingSeats--;
		
		return true;
		
	}

	public double averageGPA(){
		double sumOfGPA = 0.0;
		int numberOfStudents = 0;
		for(int i =0; i<studentRoster.length; i++){
			if (studentRoster[i] instanceof Student){
			sumOfGPA += studentRoster[i].getGPA();
			numberOfStudents ++;
			}
		}
		return sumOfGPA/numberOfStudents;
	}
	
	public String toString(){
		return "Name: " + this.name + " " + this.credits + ", " + this.remainingSeats;
	}
}
	//instanceof student


public class Robot {
	private String name;
	//position is x,y
	private int xPosition;
	private int yPosition;
	private int speed;
	private String orientation; 
	
	public Robot (String name, int xPosition, int yPosition, int speed, String orientation){
		this.name = name;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public String getName(){
		return this.name;
	}
	public int getXPosition() {
		
		return this.xPosition;
	}
	
	public int getYPoisition() {
		
		return this.yPosition;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public String getOrientation(){
		return this.orientation;
	}
	
	//move the robot
	
	public void move(int newSpeed){
		this.speed =newSpeed;
		if(this.orientation.equals("North")||this.orientation.equals("north")){
			this.yPosition+=this.speed;
		}
		else if(this.orientation.equals("South")||this.orientation.equals("south")){
			this.yPosition-=this.speed;
		}
		else if(this.orientation.equals("East")||this.orientation.equals("east")){
			this.xPosition+=this.speed;
		}
		else if(this.orientation.equals("West")||this.orientation.equals("west")){
			this.xPosition-=this.speed;
		}
		else{
			return;
		}
	}
	
	public void move(){
		if(this.orientation.equals("North")||this.orientation.equals("north")){
			this.yPosition+=this.speed;
		}
		else if(this.orientation.equals("South")||this.orientation.equals("south")){
			this.yPosition-=this.speed;
		}
		else if(this.orientation.equals("East")||this.orientation.equals("east")){
			this.xPosition+=this.speed;
		}
		else if(this.orientation.equals("West")||this.orientation.equals("west")){
			this.xPosition-=this.speed;
		}
		else{
			return;
		}
	}
	
	public void rotate(String newOrientation){
		this.orientation = newOrientation;
	}
	
	//calculate distance from other robot
	//distance between two points formula
	public void distance(Robot secondRobot){
		double xDiff = secondRobot.getXPosition()-this.xPosition;
		double yDiff = secondRobot.getYPoisition()-this.yPosition;
		double sqXDiff = xDiff * xDiff; // or Math.pow(xDiff, 2)
		double sqYDiff = yDiff * yDiff; // or Math.pow(yDiff,2)
		double sumOfSqares = Math.abs(sqXDiff+sqYDiff);
		double distance = Math.round(Math.sqrt(sumOfSqares)*100) / 100;
		System.out.println("The distance between " + this.name + " and " + secondRobot.getName() + " is " + distance);
		
	}
	
	
	public String toString(){
		return "Name: " + this.name + " Position: (" + this.xPosition + "," + this.yPosition + ") Speed: " + this.speed + " Orientation: " + this.orientation;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot myRobot = new Robot("Sandra", 0,0,0, "east");
		System.out.println(myRobot);
		myRobot.move(1);
		System.out.println(myRobot);
		Robot yourRobot = new Robot("Gary", 0,0,0,"west");
		System.out.println(yourRobot);
		myRobot.distance(yourRobot);

	}
	

}

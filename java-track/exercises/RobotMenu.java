import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;

	public static void main(String[] args) {
		
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do{
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 6);		

	}
	
	public RobotMenu(){
		
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu(){
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a new robot");
		System.out.println("2. Display a list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		int selection = s.nextInt();
		while (selection<0 || selection> 6){
			System.out.println("Invalid option, please try again:");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection){
		if(selection==1){
			createRobot();
		}
		else if(selection==2){
			displayRobots();
		}
		else if(selection==3){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Please enter a speed: ");
			int speed = s.nextInt();
			while(speed<1){
				System.out.println("Invalid input: Robot's speed must be a positive value");
				speed = s.nextInt();
			}
			r.move(speed);
			System.out.println("Here is the robot's status after moving: ");
			System.out.println(r);
		}
		else if(selection == 4){
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Which direction would you like the robot to face? (north, south, east, west)");
			String newOrientation = s.next();
			r.rotate(newOrientation);
			System.out.println("Robot's orientation has been changed: ");
			System.out.println(r);
		}
		else if(selection == 5){
			displayRobots();
			System.out.println("Select first Robot: ");
			Robot r = selectRobot();
			System.out.println("Select second robot: ");
			Robot s = selectRobot();
			double distance = r.distance(s);
			System.out.println("The sistance between the two robots is " + distance);
		}
	}

	
	private void displayRobots(){
		for(int i = 0; i < robots.size(); i++){
			System.out.println((i + 1) + ".) " + robots.get(i));
		}
	}
	
	private Robot selectRobot(){
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size()){
			System.out.println("Invalid selection, please try again:");
			selection = s.nextInt();
		}
		return robots.get(selection -1);
	}
	
	private void createRobot(){
			System.out.println("Please enter the name of the robot:");
			String name = s.next();
			/**while (name != ""){
				System.out.println("Invalid value. Please enter a name: ");
				name = s.next();
			}**/
			
			System.out.println("Please enter x-coordinate of robot: ");
			int xpos = s.nextInt();
		
			System.out.println("Please enter y-coordinate of robot: ");
			int ypos = s.nextInt();
			
			System.out.println("Please enter a speed for robot: ");
			int speed  = s.nextInt();
			while(speed<0){
				System.out.println("Speed must be a positive integer. Try again: ");
				speed = s.nextInt();
			}
			
			System.out.println("Please enter orientation for robot (north, south, east, or west): ");
			String orientation = s.next();
			robots.add(new Robot (name, xpos, ypos, speed, orientation));
			
		}
	}



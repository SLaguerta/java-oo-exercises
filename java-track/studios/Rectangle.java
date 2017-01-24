
public class Rectangle {
	
	private int length;
	private int width;

	
	public Rectangle (int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getArea(){
		return this.length*this.width;
	}
	
	public int getPerimeter(){
		return (2*this.length) + (2*this.width);
	}
	
	public String isSquare(){
		if (this.length != this.width)
		{
			return "This is just a rectangle.";
		}
		else{
			return "This rectangle is also a square!";
		}
	}
	
	public String compareArea(Rectangle other){
		if (this.getArea() > other.getArea()){
			return "First rectangle is larger than the other!";
		} else if (this.getArea() == other.getArea()){
			return "The rectangles are of equal area!";
		} else{
			return "First rectangle is smaller than the other!";
		}
	}
	
	public String toString(){
		return "Length= " + this.length + " Width= " + this.width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle firstRectangle = new Rectangle(7,8);
		System.out.println(firstRectangle);
		System.out.println(firstRectangle.getArea());
		System.out.println(firstRectangle.getPerimeter());
		System.out.println(firstRectangle.isSquare());
		Rectangle secondRectangle = new Rectangle(5,5);
		System.out.println(secondRectangle.isSquare());
		System.out.println(firstRectangle.compareArea(secondRectangle));
		Rectangle thirdRectangle = new Rectangle(8,7);
		Rectangle fourthRectangle = new Rectangle(20,20);
		System.out.println(firstRectangle.compareArea(fourthRectangle));
		System.out.println(firstRectangle.compareArea(thirdRectangle));
	}

}

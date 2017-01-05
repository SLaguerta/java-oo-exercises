
public class Fraction {
	
	private int num;
	private int denom;
	
	public Fraction(int num, int denom){
		this.num = num;
		this.denom = denom;
	}
	
	//getters
	public int getNum(){
		return this.num;
	}
	
	public int getDenom(){
		return this.denom;
	}
	
	//add another fraction to itself, returning a new fraction that represents the sum
	public Fraction add(Fraction secondFraction){
		if(this.denom==secondFraction.getDenom()){
			int sumOfNums = this.num + secondFraction.getNum();
			Fraction newFraction = new Fraction(sumOfNums, this.denom);
			return newFraction;
		}
		else{
			int commonDenom = this.denom*secondFraction.getDenom();
			int newNum1 = (commonDenom / this.denom)*this.num;
			int newNum2 =(commonDenom/secondFraction.getDenom())*secondFraction.getNum();
			int sumOfNums = newNum1 + newNum2;
			Fraction newFraction = new Fraction(sumOfNums, commonDenom);
			return newFraction;
		}
	}
	
	//multiply itself by another fraction, returning new fraction product
	public Fraction multiply(Fraction secondFraction){
		int newNum = this.num * secondFraction.getNum();
		int newDenom = this.denom * secondFraction.getDenom();
		Fraction newFraction = new Fraction(newNum, newDenom);
		return newFraction;
	}
	
	//fraction should be able to simplify itself, returning a simplification
	//find GCD with modulo?
	
	public int gcd(int x, int y){
		int factor = y;
		while(y != 0){
			factor = y;
			y = x % y;
			x = factor;
		}
		return x;
	}
				
	public Fraction simplify(){

		int gcd = gcd(this.num, this.denom);
		int newNum = this.num/gcd;
		int newDenom = this.denom/gcd;
		Fraction newFraction = new Fraction(newNum, newDenom);
		return newFraction;
		
	}
	
	
	
/*public void reciprocal(){
		System.out.println("The reciprocal of this fraction is " + this.denom + "/" + this.num);
	}
*/
	
	public Fraction reciprocal(){
		Fraction recipFraction = new Fraction(this.denom, this.num);
		return recipFraction;
	}


public String toString(){
	return num + "/" + denom;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction myFraction = new Fraction(2, 4);
		System.out.println(myFraction);
		System.out.println(myFraction.reciprocal());
		Fraction yourFraction = new Fraction(4,5);
		System.out.println(myFraction.add(yourFraction));
		System.out.println(myFraction.multiply(yourFraction));
		System.out.println(myFraction.gcd(2,4));
		System.out.println(yourFraction.simplify());
		System.out.println(myFraction.simplify());
	}

}


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
	//take the reciprocal of itself, returning that value as a new fraction
	//fraction should be able to simplify itself, returning a simplification
	
	//add fractions
	
	
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
		Fraction myFraction = new Fraction(1, 3);
		System.out.println(myFraction);
		System.out.println(myFraction.reciprocal());
		Fraction yourFraction = new Fraction(4,5);
		System.out.println(yourFraction.reciprocal());
		System.out.println(myFraction.add(yourFraction));
	}

}

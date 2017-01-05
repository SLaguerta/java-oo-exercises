
public class BaseballPlayer {
	
	
	private String name;
	private int jerseyNumber;
	private String bats; //left, right, or ambidextrous
	private int gamesPlayed;
	private int runs;
	private int rbis;
	private int hits;
	
	
	/*public BaseballPlayer(String name, int jerseyNumber, String bats, int gamesPlayed){
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.bats = bats;
		this.gamesPlayed = gamesPlayed;
		
	}*/
	public BaseballPlayer(String name, int jerseyNumber, String bats, int gamesPlayed, int runs, int hits, int rbis){
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.bats = bats;
		this.gamesPlayed = gamesPlayed;
		this.runs =runs;
		this.hits = hits;
		this.rbis = rbis;
	}
	
	/*public BaseballPlayer(String name, int jerseyNumber, String bats, int gamesPlayed, int runs, int rbis){
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.bats = bats;
		this.gamesPlayed = gamesPlayed;
		this.runs =runs;
		this.rbis = rbis;
	}*/
	
	//getters
	public String getName(){
		return this.name;
	}
	
	public int getJerseyNumber(){
		return this.jerseyNumber;
	}
	
	public String getBats(){
		return this.bats;
	}
	
	//setters game:hits, rbis, 
	
	public void gameStats(int runs, int hits, int RBI){
		this.gamesPlayed ++;
		this.runs = this.runs + runs;
		this.hits = this.hits + hits;
		this.rbis = this.rbis + RBI;
	}
	
	
	
	//toString
	public String toString(){
		return "Name: " + this.name + "; Jersey Number: " + this.jerseyNumber + "; Bats: " + this.bats + "; Games Played: "
			+ this.gamesPlayed + "; Total Runs: " + this.runs + "; Total Hits: " + this.hits + "; Total RBIs: " + this.rbis;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer kolten = new BaseballPlayer("Kolten Wong", 16, "Left", 121, 39, 75, 23);
		System.out.println(kolten);
		kolten.gameStats(7, 8, 1);
		System.out.println(kolten);

	}

}

package MiniGame;

public class UserData {
	private String name;
	private double record;
	private String gameKind;
	private int typingSentence;
	private int gameCount;
	
	public UserData(String newName) {
		this.name = newName;
	}
	
	public void setGameKind(int newKind){
		switch(newKind){
		case 1:
			this.gameKind = "TypingGame";
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setGameRecord(double record){
		this.record = record;
	}
	
	public double getGameRecord() {
		return this.record;
	}
	
	public int getTypingSentence(){
		return this.typingSentence;
	}
	public void setTypingSentence(int number){
		this.typingSentence = number;
	}
	
	public int getGameCount(){
		return this.gameCount;
	}
	public void setGameCount(int count){
		this.gameCount = count;
	}
	
	public void print(){
		AppView.outputLine("이름 : " + name + ", 게임종류 : " + gameKind + ", 기록 : " + record);
	}

}

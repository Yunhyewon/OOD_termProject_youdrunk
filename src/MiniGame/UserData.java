package MiniGame;
import app.AppView;
//유저의 이름과 게임종류, 게임기록, TypingGame 실시했을때 게임의 횟수와 문장의 번호를 저장한다.
public class UserData {
	private String name;
	private double record;
	private String gameKind;
	private int typingSentence; // TypingGame 실시했을때 문장의 번호
	private int gameCount; // TypingGame 실행횟수
	
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

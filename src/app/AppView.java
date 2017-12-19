package app;

import java.util.Random;
import java.util.Scanner;
import Store.*;
import Drink.*;
import MixDrink.MakeMixList;
import MiniGame.*;

public final class AppView {
	private static Scanner scanner = new Scanner(System.in);
	static Random rand = new Random();
	static UserDataBase dataBase = new UserDataBase();

	static Store st;
	static Drink dr;
	static MakeMixList ml = new MakeMixList(); 
	static Minigame mg = new Minigame();
	private AppView() {

	}

	public static void outputLine(String aString) {
		System.out.println(aString);
	}

	public static void output(String aString) {
		System.out.print(aString);
	}

	public static int ThemaChoice() {
		int a;
		while (true) {
			AppView.output("->");
			a = AppView.scanner.nextInt();
			if(0 <= a && a <= 4){
				return a;
			}
			else{
				AppView.output("1에서 4까지의 수를 입력하시오.");
			}
		}
	}
	public static int menuDrinkList(){
		AppView.outputLine("---------------Drink List---------------");
		AppView.outputLine("1.Soju 2.Beer 3.Wine 4.Wisky");
		AppView.output("->");
		int userInput = scanner.nextInt();
		switch(userInput){
		case 1:
			dr = new SojuList();
			break;
		case 2:
			dr = new BeerList();
			break;
		case 3:
			dr = new WineList();
			break;
		case 4:
			dr = new WiskyList();
			break;
		}
		dr.printDrinkList();
		dr.viewDetailData();
		
		return userInput;
	}

	public static void PlayingGame(){
		String name;
		int gameKind;
		UserData user;
		double recordGap;
		int num = 0;
		
		AppView.output("플레이어의 이름을 입력하세요 : ");
		name = scanner.next();
		if(dataBase.userSearch(name)){
			if(dataBase.getDataBase()[dataBase.indexSearch(name)].getGameCount()%2 == 1){ // 게임횟수가 홀수일때
				num = dataBase.getDataBase()[dataBase.indexSearch(name)].getTypingSentence();
				user = dataBase.getDataBase()[dataBase.indexSearch(name)];	
			}
			else{ // 짝수일때
				user = dataBase.getDataBase()[dataBase.indexSearch(name)];	
			}
		}
		else{
			user = new UserData(name);
			num = rand.nextInt(5);
		}

		AppView.outputLine("");

		AppView.output("플레이 할 게임을 선택하세요 (1. TypingGame) : ");
		Minigame game = new Minigame();
		gameKind = scanner.nextInt();
		user.setGameKind(gameKind);
		user.setTypingSentence(num);

		if (user.getGameCount()%2 == 1) {
			recordGap = game.TypingGame(num) - user.getGameRecord();
			
			AppView.outputLine("전 후 비교 결과 : ");
			System.out.printf("%.2f",recordGap);
			if(recordGap <= 1){
				AppView.outputLine(" 오우 아직 안취하셨네요~");
			}
			else if(recordGap < 3){
				AppView.outputLine(" 취했네 취했어~");
			}
			else{
				AppView.outputLine(" 제대로 취했네~ 집가세요^~^");
			}
			outputLine("");
		}
		else{
			user.setGameRecord(game.TypingGame(num));
			user.print();
		}
			
		user.setGameCount(user.getGameCount()+1);
		dataBase.addData(user);
	}

	public static int menuStoreList(){
		AppView.outputLine("---------------Store List---------------");
		AppView.outputLine("1. Pocha 2. Room 3. Hof 4. Izakaya 5. Wine&Liquor");
		AppView.outputLine("6. Meet 7. SeaFood 8. Jumak 9. Chicken");
		AppView.output("->");
		int userInput = scanner.nextInt();	
		switch (userInput) {
		case 1:
			st = new Pocha();
			break;
		case 2:
			st = new Room();
			break;
		case 3:
			st = new Hof();
			break;
		case 4:
			st = new Izakaya();
			break;
		case 5:
			st = new WineAndLiquor();
			break;
		case 6:
			st = new Meat();
			break;
		case 7:
			st = new SeaFood();
			break;
		case 8:
			st = new Jumak();
			break;
		case 9:
			st = new Chicken();
			break;
		default:
			break;
		}
		st.storeName();
		st.detailStore();
		
		return userInput;
	}
	public static void menuMixDrinkList(){
		AppView.outputLine("---------------MixDrink List---------------");
		ml.printMixList();
		ml.detailMixList();
	}
}

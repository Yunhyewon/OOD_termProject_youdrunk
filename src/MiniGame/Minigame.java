package MiniGame;

import java.util.*;

import app.AppView;

public class Minigame {
	int userInput;
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	public double TypingGame(int randomNum) {
		String enter = "";
		String sentence = "";
		String typing;
		double result;
		double temp;
		int num;

		num = randomNum;

		switch (num) {
		case 0:
			sentence = "은지는 존기탱";
			break;
		case 1:
			sentence = "혜원이는 존예";
			break;
		case 2:
			sentence = "컴공 존예 존귀 혜원 은지";
			break;
		case 3:
			sentence = "은지는 존기탱";
			break;
		case 4:
			sentence = "??? : 나는 그냥 이 세계에서 존기탱인데";
		}

		AppView.outputLine("< 타자 게임을 시작합니다. >");
		AppView.outputLine("< 제시되는 단어를 입력하세요. >");
		AppView.output("< 게임을 시작하려면 Enter키를 누르세요. >");

		enter = input.nextLine();
		if (enter.length() != 0) {
			while (enter.length() != 0) {
				enter = input.nextLine();
			}
		}

		long start = System.currentTimeMillis();
		AppView.outputLine("---------------------------------------------------------");
		AppView.outputLine("<제시어>	" + sentence);

		AppView.output("<입력>	");
		typing = input.nextLine();

		while (!sentence.equals(typing)) {
			AppView.outputLine("틀렸습니다. 다시 입력하세요.");
			AppView.outputLine("입력 : ");
			typing = input.nextLine();
		}
		AppView.outputLine("---------------------------------------------------------");
		AppView.outputLine("정답입니다.");

		long end = System.currentTimeMillis();

		temp = ((end - start) % 1000) / 10;
		result = (end - start) / 1000 + temp / 100;

		AppView.outputLine("time : " + result);
		AppView.outputLine("< 타자 게임을 종료합니다.>");

		return result;
	}

	public void calculate(String name) {
		UserDataBase dataBase = new UserDataBase();
		UserData user;
		int num;
		if (dataBase.userSearch(name)) {
			if (dataBase.getDataBase()[dataBase.indexSearch(name)].getGameCount() % 2 == 1) { // 게임횟수가
																								// 홀수일때
				num = dataBase.getDataBase()[dataBase.indexSearch(name)].getTypingSentence();
				user = dataBase.getDataBase()[dataBase.indexSearch(name)];
			} else { // 짝수일때
				user = dataBase.getDataBase()[dataBase.indexSearch(name)];
			}
		} else {
			user = new UserData(name);
			num = random.nextInt(5);
		}
		AppView.outputLine("");
	}
	public void compare(String name){
		UserDataBase dataBase = new UserDataBase();
		UserData user = null;
		int num = 0;
		double recordGap;
		if (user.getGameCount()%2 == 1) {
			recordGap = TypingGame(num) - user.getGameRecord();
			
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
			AppView.outputLine("");
		}
		else{
			user.setGameRecord(TypingGame(num));
			user.print();
		}
			
		user.setGameCount(user.getGameCount()+1);
		dataBase.addData(user);
		
	}
}

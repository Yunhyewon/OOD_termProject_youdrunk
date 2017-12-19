package MiniGame;
import java.util.*;
import app.AppView;
public class Minigame {
	int userInput;
	
	// 미니게임 중 타이핑 게임 구현
	// 같은 유저가 게임을 두 번 실행할 경우 두 번 다 같은문장이 와야하기 때문에 
	// 외부에서 랜덤한 수를 정하고 그 수를 토대로 TypingGame을 두번 해야 한다.
	// 그러므로 이 TypingGame 메소드의 매개변수로 랜덤한 수를 받아오게 구현했다.
	public double TypingGame(int randomNum) {
		String enter = "";
		String sentence = "";
		String typing;
		double result;
		double temp;
		int num;
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		num = randomNum;
		
		switch(num){
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
			break;
		case 5:
			sentence = "객체 지향 설계 좋은 강의 감사드립니다 :)";
			break;
		case 6:
			sentence = "객체 지향 설계 시험 너무 어려워요 ㅠㅠ";
			break;
		case 7:
			sentence = "세젤예 조교님 고생많았어요";
			break;
		}
		
		AppView.outputLine("< 타자 게임을 시작합니다. >");
		AppView.outputLine("< 제시되는 단어를 입력하세요. >");
		AppView.output("< 게임을 시작하려면 Enter키를 누르세요. >");
		
		enter = input.nextLine();
		if(enter.length() != 0){
			while(enter.length() != 0){
				enter = input.nextLine();
			}
		}
		
		long start = System.currentTimeMillis();
		AppView.outputLine("---------------------------------------------------------");
		AppView.outputLine("<제시어>	" + sentence);
		
		AppView.output("<입력>	");
		typing = input.nextLine();
		
		while(!sentence.equals(typing)){
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

}

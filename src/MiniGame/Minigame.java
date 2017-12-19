package MiniGame;
import java.util.*;

public class Minigame {
	int userInput;
	
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
		}
		
		System.out.println("< 타자 게임을 시작합니다. >");
		System.out.println("< 제시되는 단어를 입력하세요. >");
		System.out.print("< 게임을 시작하려면 Enter키를 누르세요. >");
		
		enter = input.nextLine();
		if(enter.length() != 0){
			while(enter.length() != 0){
				enter = input.nextLine();
			}
		}
		
		long start = System.currentTimeMillis();
		System.out.println("---------------------------------------------------------");
		System.out.println("<제시어>	" + sentence);
		
		System.out.print("<입력>	");
		typing = input.nextLine();
		
		while(!sentence.equals(typing)){
			System.out.println("틀렸습니다. 다시 입력하세요.");
			System.out.print("입력 : ");
			typing = input.nextLine();
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("정답입니다.");
		
		long end = System.currentTimeMillis();
		
		temp = ((end - start) % 1000) / 10;
		result = (end - start) / 1000 + temp / 100;
		
		System.out.println("time : " + result);
		System.out.println("< 타자 게임을 종료합니다.>");
		
		return result;
	}

}

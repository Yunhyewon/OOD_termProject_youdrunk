package MixDrink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import app.AppView;

public class MakeMixList {
	Scanner input = new Scanner(System.in);
	public void printMixList() {
		File CS = new File("MixDrink.txt");
		while (true) {
			AppView.outputLine("----------MixDrink list ----------");
			try {
				BufferedReader input = new BufferedReader(new FileReader(CS));
				String s;
				while ((s = input.readLine()) != null) {
					System.out.println(s);
				}
			} catch (FileNotFoundException e) {
				AppView.outputLine("No file.");
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}
	}

	public void detailMixList(){
		while (true) {
			AppView.outputLine("----------MixDrink list choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("고진감래- 콜라 + 맥주 + 소주");
				AppView.outputLine("-'고생 끝에 낙이 온다'라는 뜻의 사자성어를 이용한 폭탄주이다. 처음엔 쓰지만 마지막엔 달콤한 맛이 매력");
				break;
			case 2:
				AppView.outputLine("메로나주 - - 메로나 + 소주 + 사이다");
				AppView.outputLine("-메로나를 컵에 넣고 약간의 소주와 사이다를 넣어 만든 폭탄주. 달달한 맛에 여성들에게 인기가 많다.");
				break;
			case 3:
				AppView.outputLine("예거밤 - 예거마이스터 + 에너지드링크");
				AppView.outputLine("- 예거마이스터라는 양주와 에너지드링크를 섞은 술로 예거를 1/3정도, 에너지드링크를 2/3정도 섞어 마시는 술이다.");
				break;
			case 4:
				AppView.outputLine("깔루아 밀크 - - 깔루아 + 우유 + 에스프레소");
				AppView.outputLine("- 에스프레소는 생략 가능하다. 커피우유 맛이 나는 칵테일로 달콤한 편이며 부드러운 맛이 매력적인 술.");
				break;
			case 5:
				AppView.outputLine("사과에 이슬 - - 소주 + 사과맛 탄산음료");
				break;
			case 6:
				AppView.outputLine("링겔주 - - 소주 + 매화주");
				AppView.outputLine("- 소주와 매화주를 서로 병 입구 부분을 맞대어 만드는 술로 조금씩 섞일 때 기포가 발생하는 것이 링겔과 비슷하여 이름 붙여진 술");
				break;
			case 7:
				AppView.outputLine("아메리쏘주 - 아메리카노 + 소주");
				AppView.outputLine("- 아메리카노의 양에 따라서 다양하게 맛을 조절 가능하다.");
				break;
			case 8:
				AppView.outputLine("하몽 - 자몽에이슬 + 하이트");
				AppView.outputLine("- 달달한 자몽 맛이 나는 소맥");
				break;
			case 9:
				AppView.outputLine("후라보노 - 순하리 사과 + 콜라");
				AppView.outputLine("- 신기하게도 후라보노 맛이 나는 술");
				break;
			case 10:
				AppView.outputLine("쏘토닉 - 소주 + 토닉워터");
				AppView.outputLine("- 소주와 토닉워터를 1:1 비율로 섞는 여자에게도 부담 없는 술");
				break;
			case 11:
				AppView.outputLine("밀키스주 - 소주 + 맥주  + 사이다");
				AppView.outputLine("- 신기하게 밀키스 맛이 나는 술. 소주 맥주 사이다를 1:2:2 비율로 섞어준다.");
				break;
			case 12:
				return;
			}
			
			AppView.outputLine("다른 폭탄주의 정보를 보려면 1, 처음으로 돌아가려면 0을 입력하세요");
			int num2 = input.nextInt();
			if(num2 == 0){
				return;
			}else if(num2 == 1){
				printMixList();
			}
		}
	}
}

package Drink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import app.AppView;


public class BeerList implements Drink {
	int userInput;
	Scanner input = new Scanner(System.in);

	public void printDrinkList() {
		File CS = new File("BeerList.txt");
		while (true) {
			AppView.outputLine("----------Beer list ----------");
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

	public void viewDetailData() {

		while (true) {
			AppView.outputLine("---------Beer choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine(
						"오비라거 – 5도 , 잡미.잡향을 뽑아 내는 호오리 공법을 도입하여 순하고 부드러운 맛이 나고, 깨끗한 뒷맛 뿐만 아니라 첫잔의 상쾌한 맛을 마지막까지 느낄 수 있는 맥주");
				break;
			case 2:
				AppView.outputLine("클라우드 – 5도 ,100% 몰트로 만들어 물을 타지 않은 맥주!");
				break;
			case 3:
				AppView.outputLine("드라이 - 4.8도 , 단맛이 없는 맥주(당분함량도가 적음) 발효도를 90%정도로 높여 보리에 들어있는 엑기스를 적게 함.");
				break;
			case 4:
				AppView.outputLine("카스 - 4.5도, 비열처리 프레쉬 공법으로 제조된 카스는 맥주 본래의 맛을 그대로 살리면서 저장성을 높인 제품");
				break;
			case 5:
				AppView.outputLine("하이트 – 4.3도, 물 맛 좋은 천연 암바수로 만들어 깨끗한 맛을 좋아하는 사람들이 찾는 맥주");
				break;
			case 6:
				AppView.outputLine("레드락 – 5도, 국내 최초의 적맥주로 향이 독특하고 기존의 맥주보다 색이 진함. 최고급 암바 몰트를 사용하여, 진하면서도 부드러운 맛이 일품");
				break;
			case 7:
				AppView.outputLine("아사히 – 5도, 부드럽고 순한 맛이 좋고 맥주의 최대 약점인 지린맛이 덜한 맥주");
				break;
			case 8:
				AppView.outputLine("하이네켄 – 5도, 필스너스타일에서 구현되는 쓴맛이 강조되어 있는 것이 특징");
				break;
			case 9:
				AppView.outputLine("삿포로 – 5도 , 일본에서 아사히와 함께 유명한 맥주, 실버컵이 유명함");
				break;
			case 10:
				AppView.outputLine("기린 이치방 – 5도, 일본맥주로 첫(이치방) 즙만을 짜내 (시보리)사용한 100%보리 맥주");
				break;
			case 11:
				AppView.outputLine("엑스필 – 4도, 탄수화물류를 최소화 하는 공법으로 제조함으로써 칼로리를 낮춰 깨끗한 맛을 느낄 수 있음.");
				break;
			case 12:
				AppView.outputLine("산미구엘 – 5도, 필리핀 맥주로 특이하게도 옥수수 맥에서 뽑아 내기 때문에 끝에 특유의 옥수수 구수함을 느낄 수 있음.");
				break;
			case 13:
				AppView.outputLine("기네스 – 4.2도 , 기존의 스타우트 스타일과는 다르게  부드러운 느낌이 있는 맥주");
				break;
			case 14:
				AppView.outputLine("예거필스 – 4.9도, 오스트리아 필젠 지방맥주로 사브홉을 이용해 홉의 깊이있는 쓴 맛과 황금빛이 특징");
				break;
			case 15:
				AppView.outputLine("듀벨 – 8.5도, 이스트가 살아있는 병속 발효 맥주!");
				break;
			case 16:
				AppView.outputLine("크루저 – 5도, 블루베리·라즈베리·파인애플 맛으로 상큼한 청량감과 와인의 풍미를 느낄 수 있는 맥주");
				break;
			case 17:
				AppView.outputLine("호가든 – 4.9도, 오렌지 껍질이 첨가 된걸로 향도 강하고 맛도 독특합니다. 간혹 잔디나 풀맛 심한경우는 세제 맛을 느낄 수 도 있음");
				break;
			case 18:
				AppView.outputLine(
						"머드쉐이크 – 4도 , 보드카의 일종으로, 마실때는 특유의 술맛을 느끼지 못하고 냉커피나 초코라떼의 맛이 남(카푸치노, 초코, 카멜 등의 맛이 있음)");
				break;
			case 19:
				AppView.outputLine("코로나 – 4.5도 , 멕시코산 맥주로 투명한 병과 레몬을 넣어 마시는 것이 특징");
				break;
			case 20:
				AppView.outputLine("DNA – 5도 , 끝에 특유의 단맛으로 맛있는 술!");
				break;
			case 21:
				AppView.outputLine("카프리 – 4.2도 , 국산 맥주중 하나로 순하면서도 부드러운 맛이 일품");
				break;
			case 22:
				AppView.outputLine("벡스 – 5도, 특유의 씁쓸한 맛이 남는 맥주");
				break;
			case 23:
				return;
			}
			
			AppView.outputLine("다른 맥주의 정보를 보려면 1, 처음으로 돌아가려면 0을 입력하세요");
			int num2 = input.nextInt();
			if (num2 == 0) {
				return;
			} 
			else if (num2 == 1) {
				printDrinkList();
			}
		}
	}
}
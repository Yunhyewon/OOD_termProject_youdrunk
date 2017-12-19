package Drink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import app.AppView;

public class WineList implements Drink{
	int userInput;
	Scanner input = new Scanner(System.in);

	public void printDrinkList() {
		File CS = new File("WineList.txt");
		while (true) {
			AppView.outputLine("----------Wine list ----------");
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
			AppView.outputLine("---------Wine choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine(
						"비냐 란자 레드 - 품종 ; 템프라니요, 11도, 생산지 : 스페인, 부드러운 탄닌의 밸런스와 부드러운 여운을 보여주는 이 와인은 달콤한 맛이 잘 살아 있어 와인을 처음 드시는 분들도 쉽게 즐길 수 있는 미디엄 스위트 레드 와인");
				break;
			case 2:
				AppView.outputLine(
						"그란 띠에라 레드 – 품종 : 템프라니요, 11도, 생산지 : 스페인, 부드러운 탄닌의 밸런스와 부드러운 여운을 보여주는 이 와인은 달콤한 맛이 잘 살아 있어 와인을 처음 드시는 분들도 쉽게 즐길 수 있는 미디엄 스위트 레드 와인");
				break;
			case 3:
				AppView.outputLine("토레스 마스 라 플라나 – 품종 : 까베르네 쇼비뇽 , 14.5도, 생산지 : 스페인 , 레드 와인");
				break;
			case 4:
				AppView.outputLine("옐로우 테일 까베르네 쇼비뇽 – 품종 : 까베르네 쇼비뇽 , 13.5도, 생산지 : 호주, 레드 와인");
				break;
			case 5:
				AppView.outputLine("투핸즈, 엔젤스 쉐어 쉬라즈 – 품종 : 쉬라즈, 15도, 행산지 : 호주, 레드 와인");
				break;
			case 6:
				AppView.outputLine("G7 까베르네 쇼비뇽 – 품종 : 까베르네 쇼비뇽, 13도, 생산지 : 칠레, 레드 와인");
				break;
			case 7:
				AppView.outputLine("몬테스 알파 까베르네 쇼비뇽 - 품종 : 까베르네 쇼비뇽 + 멜롯, 14.5도, 생산지 : 칠레, 레드 와인");
				break;
			case 8:
				AppView.outputLine(
						"디아블로 까베르네 쇼비뇽 – 품종 : 까베르네 쇼비뇽, 13.5도, 생산지 : 칠레, 잘 익은 산딸기와 자두의 맛, 세련되고 부드러운 탄닌의 우아한 조화, 긴 여운이 인상적인 와인. 맨체스터 유나이티드 공식 와인으로 유명하다. 레드 와인");
				break;
			case 9:
				AppView.outputLine(
						"푸두  - 품종 : 까베르네쇼비뇽 + 쉬라즈, 12.5도 , 생산지 : 칠레체리, 자두와 어우러진 미디엄 바디로 편하게 즐길 수 있는 캐쥬얼 레드 와인 ");
				break;
			case 10:
				AppView.outputLine("1865 싱글 빈야드 까르미네르 – 품종 : 까르미네르, 14.5도, 생산지 : 칠레, 레드 와인");
				break;
			case 11:
				AppView.outputLine("무똥 까데 레드 – 품종 : 메를로 + 까베르네쇼비뇽 + 까베르네프랑 , 14도, 생산지 : 프랑스, 레드 와인");
				break;
			case 12:
				AppView.outputLine("도멘 뒤 프린스 루즈 – 품종 : 쉬라즈 + 그르나슈, 13.5도, 생산지 : 프랑스, 레드 와인");
				break;
			case 13:
				AppView.outputLine("장 발몽 까베르네 쇼비뇽 – 품종 : 까베르네쇼비뇽, 12.5도, 생산지 : 프랑스, 레드 와인");
				break;
			case 14:
				AppView.outputLine(
						"비냐 란자 화이트 – 품종 : 아이렌, 10.5도, 생산지 : 스페인, 드라이하지 않고 단맛이 잘 살아 있는 미디엄 스위트 와인으로 와인을 처음 접하시는 분들도 쉽게 즐길 수 있는 화이트와인.");
				break;
			case 15:
				AppView.outputLine("레알 꼼빠니아 드 비노스, 블랑코 – 품종 : 마카베오, 12.5도, 생산지 : 스페인, 화이트와인");
				break;
			case 16:
				AppView.outputLine("G7 샤르도네 - 품종 : 샤르도네, 13.5도, 생산지 : 칠레, 화이트와인");
				break;
			case 17:
				AppView.outputLine("1865 싱글빈야드 소비뇽 블랑 – 품종 : 쇼비뇽 블랑, 13.5도, 생산지 : 칠레, 화이트와인");
				break;
			case 18:
				AppView.outputLine("군트럼 리슬링 로얄 블루 – 품종 : 리슬링, 9.5도, 생산지 : 독일, 화이트와인");
				break;
			case 19:
				AppView.outputLine("알베르 비쇼, 샤블리 – 품종 : 샤르도네, 12.9도, 생산지 : 프랑스, 화이트와인");
				break;
			case 20:
				AppView.outputLine("무똥 까데 화이트 – 품종 : 쇼비뇽블랑 + 셀미론 + 뮈스깔델, 13도, 생산지 : 프랑스, 화이트와인");
				break;
			case 21:
				AppView.outputLine("칸티, 모스카토 다스티 – 품종 : 모스카토, 5.5도, 생산지 : 이탈리아, 화이트와인");
				break;
			case 22:
				AppView.outputLine(
						"산테로 모스카토 스푸만테 – 품종 : 모스카토, 6.5도, 생산지 : 이탈리아, 신선하고 상큼한 과일의 산미와 기분좋은 꽃향기와 우아한 감미를 함께 갖추고 있는 화이트와인");
				break;
			case 23:
				AppView.outputLine("클라우디 베이, 쇼비뇽 블랑 – 품종 : 쇼비뇽 블랑, 14도, 생산지 : 뉴질랜드, 화이트와인");
				break;
			default:
				break;
			}
			AppView.outputLine("다른 와인의 정보를 보려면 1, 처음으로 돌아가려면 0을 입력하세요");
			int num2 = input.nextInt();
			if (num2 == 0) {
				return;
			} else if (num2 == 1) {
				printDrinkList();
			}
			
		}
	}
}

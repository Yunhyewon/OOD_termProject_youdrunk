package Drink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import app.AppView;

public class SojuList implements Drink{
	int userInput;
	Scanner input = new Scanner(System.in);
	
	public void printDrinkList() {
		File CS = new File("SojuList.txt");
		while (true) {
			AppView.outputLine("----------Soju list ----------");
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
			AppView.outputLine("---------Soju choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine(
						"참이슬 – 클래식 20.1도, 프레쉬 17.8도 서울·인천·경기 소주, 천연대나무 숯으로 정제해 빚은 소주 미네랄이 풍부하며 깨끗하고 깔끔한 맛이 특징");
				break;
			case 2:
				AppView.outputLine("좋은데이 – 16.9도, 울산·경남 소주 , 지리산 산청암반수로 만든 물좋은 소주!, 알콜향이 강하지 않아 부드러움");
				break;
			case 3:
				AppView.outputLine("과일소주 – 좋은데이(복숭아, 석류, 블루베리, 자몽, 유자, 파인애플 – 13.5도");
				AppView.outputLine("- 순하리(유자, 복숭아, 블루베리, 석류, 자몽 – 13.5도");
				break;
			case 4:
				AppView.outputLine("진로제이 – 18.5도, 국내 최저 1032m의 해양심층수를 함유한 고품질의 웰빙 소주");
				break;
			case 5:
				AppView.outputLine("잎새주 – 17.8도, 전라도 소주 , 메이플 시럽 함유, 지하 253m천연암반수");
				break;
			case 6:
				AppView.outputLine("O2린 – 17.8도, 대전·충남 소주 , 산 속에서 술을 마시면 숙취가 빨리 깬다는 사실에서 아이디어를 얻어 특허를 낸 소주");
				break;
			case 7:
				AppView.outputLine("처음처럼 – 17.5도, 강원 소주. 최초로 알칼리 환원수를 사용!");
				break;
			case 8:
				AppView.outputLine("대장부 – 21도, 100%우리 쌀로 빚은 정통 증류식 소주");
				break;
			case 9:
				AppView.outputLine("한라산 – 21도, 제주도 소주 , 100% 알칼리성 천연 암반수를 바다 밑 심층수로 자연여과된 천연소주!");
				break;
			case 10:
				AppView.outputLine("한라산물맑은 소주 – 20.2도, 제주도 소주");
				break;
			case 11:
				AppView.outputLine("올레 – 17.5도, 제주도 소주, 제주산 밭벼로 만든 증류수 원액을 섞었으며 한라산 조릿대 숯 여과로 더욱 깨끗하게 만든 소주");
				break;
			case 12:
				AppView.outputLine("푸른밤 긴밤 – 20.1도, 제주도 소주, 감미료맛 좋아하시는 분께 추천하는 소주");
				break;
			case 13:
				AppView.outputLine("푸른밤 짧은밤 – 16.9도, 제주도 소주, 첨가물의 맛으로 승부하는 그냥 순한 소주");
				break;
			case 14:
				AppView.outputLine("C1 – 16.9도, 부산 소주, 고급식물성 감미료인 토마틴을 첨가해 특유의 풍미가 느껴짐");
				break;
			case 15:
				AppView.outputLine(
						"봄봄 – 16.7도, 국내 최초로 소주의 제조과정 중 음악을 들려주는 공법을 도입한 음향진동숙성 공법을 채택해 알코올과 물 분자간의 결합력을 강화하여 맛이 더 부드럽고 깔끔한 것이 특징");
				break;
			case 16:
				AppView.outputLine("제이 – 18.5도, 진로에서 나온 소주로 천연미네랄이 살아잇는 해양심층수를 함유한 소주");
				break;
			case 17:
				AppView.outputLine("더블루 – 17.9도 , 파란색으로 겉모양이 예쁘고, 100%천연암반수를 사용하여 냉동여과와 산소 주입을 시킨 소주");
				break;
			case 18:
				AppView.outputLine("즐거워예 – 16.7도, 천연원료 토마틴으로 더 부드럽고 아침까지 깨끗한 소주");
				break;
			case 19:
				AppView.outputLine("맛있는 참 – 16.9도 , 세계 품평회에서 금메달을 수상한 소주로 맛이 부드럽고 목넘김이 좋음");
				break;
			case 20:
				AppView.outputLine("시원한 청풍 – 18도, 충북 소주, 초정수로 만들고 100%천연암반수로 미네랄이 풍부한 소주");
				break;
			case 21:
				AppView.outputLine("화이트 – 19.9도 , 경남 소주 , 자연을 담은 깨끗한 소주");
				break;
			case 22:
				AppView.outputLine("하이트 -  19.5도, 전북 소주, 맥반석으로 한번 참숯으로 또 다시 한번 걸러 부드러움! 아미노산을 첨가해 생리활성에 도움");
				break;
			case 23:
				AppView.outputLine("독도소주 – 18도, 독도 소주, 울릉도 바닷속 650m에서 취수한 해양심층수가 함유되어 있어서 더 부드럽고 깨끗함");
				break;
			case 24:
				AppView.outputLine("아홉시반 – 17.5도 , 사라진소주...");
				break;
			case 25 :
				return;
			default:
				break;
			}
			AppView.outputLine("다른 소주의 정보를 보려면 1, 처음으로 돌아가려면 0을 입력하세요");
			int num2 = input.nextInt();
			if(num2 == 0){
				return;
			}else if(num2 == 1){
				printDrinkList();
			}
		}
	}
}

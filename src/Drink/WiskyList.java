package Drink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import app.AppView;

public class WiskyList implements Drink{
	int userInput;
	Scanner input = new Scanner(System.in);

	public void printDrinkList() {
		File CS = new File("BeerList.txt");
		while (true) {
			AppView.outputLine("----------Wisky list ----------");
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
			AppView.outputLine("---------Wisky choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine(
						"스카치 블루 – 도수 40도, 21년산과 6년산 원액을 블렌딩한 것이 특징, 스트레이트를 즐기는 한국인의 입맛에 맞추기 위한 것, 가벼우면서도 보디감이 있고 톡 쏘는 첫맛, 부드러운 뒷맛");
				break;
			case 2:
				AppView.outputLine(
						"잭다니엘 – 도수 40도, 미국의 대중적인 위스키, 위스키 맛이 가장 좋다는 13.5도가 유지되는 석회암층을 통과한 물로 제조했고, 알코올 증류 즉시 3m 높이의 단풍나무 숯과 통과해 걸러내는 목탄 숙성법으로 제조, 부드럽고 달콤한 맛과 향의 맛의 특징");
				break;
			case 3:
				AppView.outputLine("딤플 – 도수 40도, 대중적인 이미지로 스카치 특유의 맛은 약한편, 전형적인 스카치 위스키의 강한맛");
				break;
			case 4:
				AppView.outputLine("윈저 – 도수 40도, 마일드하며 스카치 특유의 맛이 약하고 첫맛은 조금 거칠지만 뒷맛은 부드러움");
				break;
			case 5:
				AppView.outputLine("조니워커 블랙 – 도수 40도, 온더록으로는 맛이 약하므로 스트레이트로 깔끔하게 즐기는 편이 나음. 첫맛은 거칠지만 전체적으로 중후한 멋이 느껴짐");
				break;
			case 6:
				AppView.outputLine("스윙 – 도수 43도, 강한 원료의 맛이 숙성되면서 부드러워진 맛");
				break;
			case 7:
				AppView.outputLine(
						"조니워커 블루 – 도수 43도, 라이트한 맛과 보디감이 적절한 조화를 이뤘고, 머금었을 때는 부드럽게 감기지만 목을 타고 넘어가는 느낌은 묵직하고 향기로움");
				break;
			case 8:
				AppView.outputLine("J&B JET – 도수 40도, 마일드한 맛은 동급 최강, 목넘김이 부드럽고 보디감도 좋음. 달콤하고 균형이 잘 잡힌 스카치");
				break;
			case 9:
				AppView.outputLine("J&B RESERVE – 도수 40도, 제트보다 보디가 더 발달되어있고, 숙성된 단맛이 부드러움을 한층 가미했음");
				break;
			case 10:
				AppView.outputLine(
						"짐빔 화이트 – 도수 40도, 코에서 뿜어져 나오는 향이 강하고 목넘김이 힘들어 스트레이트보다 칵테일용, 콘 위스키의 대명사로 첫맛은 달지만 목넘김이 거칠음");
				break;
			case 11:
				AppView.outputLine("짐빔 블랙 – 도수 43도, 화이트에 비해 향이 강하고 보디가 강함, 콘 향이 덜 나며 성숙한 맛이남");
				break;
			case 12:
				AppView.outputLine("로얄 샬루트 – 도수 40도, 보디가 적당하고 부드러운 맛이 살아남, 부드러운 첫 맛에 균형이 잘 잡힘");
				break;
			case 13:
				AppView.outputLine("시바스 리갈 12 – 도수 40도, 숙성연도 12년스카치 맛과 향은 잘 살아나지만 부드러움이 다른 제품에 비해 떨어짐. 향과 맛이 모두 강함");
				break;
			case 14:
				AppView.outputLine("시바스 리갈 18 – 도수 40도, 숙성년도 18년, 12년산에 부족한 맛이 가미됐고, 향은 강하지만 뒷맛은 부드러움");
				break;
			case 15:
				AppView.outputLine("크라운 로얄 – 도수40도, 첫맛은 마일드하지만 뒷맛이 강해 우리나라 입맛에 잘 어울림, 부드러운 첫 맛, 짜릿한 뒷맛이 소수를 위한 특별한맛");
				break;
			case 16:
				AppView.outputLine(
						"패스포드 – 도수 40도, 코가 훅 하고 느껴지는 맛이 있고 뒷맛이 흐려 한국인에게 어울리는 스카치, 강렬한 이미지이지만 뒷맛을 깔끔하게 처리한 맛");
				break;
			case 17:
				AppView.outputLine("썸씽 스페셜 – 도수 40도, 보디도 적당하고 오크 향이 적당히 퍼져 편안함. 강한 첫맛, 깔끔한 뒷만");
				break;
			case 18:
				AppView.outputLine(
						"클렌피딕 12 – 도수 40도, 숙성 연도 12년 맥아(보리)만을 증류시켜 만든 몰트 위스키로, 향은 부드럽지만 약간 독한 맛의 퓨어, 목넘김이 좋은편");
				break;
			case 19:
				AppView.outputLine("클렌피딕 18 – 도수 40도, 12년산에 비해 목넘김이 훌륭하고 보디가 있고, 향이 약간 독하고 넘어가는 느낌이 부드러우면서도 묵직함");
				break;
			case 20:
				AppView.outputLine(
						"발렌타인 17 – 도수 43도, 판매량에서 세계 1위, 국내 1위를 기록하고 있는 술로, 소프트한 맛은 우수하지만 보디감이 부족함. 그윽한 부드러움에 목 넘김이 향긋함");
				break;
			case 21:
				AppView.outputLine(
						"캐나디안 클럽 6 – 도수 40도, 호밀, 옥수수, 보리에서 얻어진 특유의 부드럽고 가벼운 맛으로 북미 지역의 대중 위스키, 향이 약하고 맛은 대중적이며 편안함");
				break;
			case 22:
				AppView.outputLine("캐나디안 클럽 12 – 도수 40도, 6년산에 비해 보디가 좀 더 강한편, 부드러움이 더해짐");
				break;
			case 23:
				AppView.outputLine(
						"임페리얼 – 도수40도, 발렌타인의 블렌더 로버트 힉스가 직접 블렌딩을 책임져 맛과 향에서 발렌타인에 버금가는 부드러움을 지향, 마시기 편한 대중 위스키");
				break;
			case 24:
				AppView.outputLine("랜슬럿 12 – 도수 40도, 셰리 오크통에서 숙성된 원액으로 부드러운 향을 풍김, 코로 진하게 뿜어져 나오는 것이 특징.");
				break;
			case 25:
				AppView.outputLine("발렌타인 30 – 도수 43도, 딱 한 모금에 맛과 향을 모두 느낄 수 있고, 피니시가 훌륭함");
				break;
			case 26:
				AppView.outputLine(
						"커티삭 6 – 도수 40도, 스카치 위스키치고 코에서 뿜어져 나오는 향이 강한 편이지만 목 넘김은 괜찮음, 단맛, 신맛 등이 다채롭고 목에서 넘어갈 때 쓴맛이 강하다.");
				break;
			case 27:
				AppView.outputLine("커티삭 12 – 6년산보다 거친 맛이 부드럽게 정제되면서 개성이 뚜렷해짐");
				break;
			default:
				break;
			}
			AppView.outputLine("다른 위스키의 정보를 보려면 1, 처음으로 돌아가려면 0을 입력하세요");
			int num2 = input.nextInt();
			if (num2 == 0) {
				return;
			} else if (num2 == 1) {
				printDrinkList();
			}
			
		}
	}
}

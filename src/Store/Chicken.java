package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Chicken implements Store{
	Scanner input = new Scanner(System.in);

	public void storeName() {
		File CS = new File("ChickenStore.txt");
		while (true) {
			AppView.outputLine("----------Chicken store list ----------");
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

	public void detailStore() {
		while (true) {
			AppView.outputLine("---------ChickenStore choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 블랙꼬끄, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("요거베리 치킨 - 17000, 허니어니언 뿔레 치킨 - 17000, 크리미 어니언 치킨 - 17000 "
							+ ",꼬끄칠리 치킨 - 17000, 델리간장/매콤간장 - 17000, 후라이드 - 17000, 양념/매운양념/간장 - 17000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로145번길 24(고기골목)");
				}
				break;
			case 2:
				AppView.outputLine("You choice 꼬꼬아찌, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("숯불양념 - 18000, 숯불 소금구이 - 17000, 숯불 반반 - 18000, 후라이드- 17000, 후라이드 양념 - 18000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동 408-2");
				}
				break;
			case 3:
				AppView.outputLine("You choice 썸치킨, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크리스피치킨(포장) - 7900, 크리스피치킨 반마리/순살반바마리 - 5900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로 151번길 10");
				}
				break;
			case 4:
				AppView.outputLine("You choice 칠구치킨, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크리스피  - 8000, 양념치킨 - 9900, 간장치킨 - 9900, 옛날통닭 - 8000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동 18번길 88");
				}
				break;
			case 5:
				AppView.outputLine("You choice 멜로우멜로디, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine(
							"순살치킨 - 13900, 오리엔탈 어니언치킨 - 14900, 칠리치즈 치킨 - 15900, 오리엔탈 파닭치킨 - 14900, 스노우 어니언 치킨 - 15900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동 410-9 2층");
				}
				break;
			case 6:
				AppView.outputLine("You choice 아웃닭, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine(
							"오리지날 프린스튼 후라이드 치킨 - 16900, 오리지날 레드펀 양념치킨 - 17900, 스펜서 매운 양념치킨 - 17900, 마틴 간장치킨 - 17900, 케인즈 갈릭 치킨 - 17900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로 141번길 12 1층");
					
				}
				break;
			case 7:
				AppView.outputLine("You choice 닭섬, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크리스피 후라이드 - 14900, 양념 - 15900, 간장 15900,  까르보나라치킨 - 16900, 핑크치킨 - 17900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동 425-15");
					
				}
				break;
			case 8:
				AppView.outputLine("You choice 부어치킨, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크리스피 치킨 10000, 양념치킨 - 11500, 맛쇼킹 순살치킨 - 13000, 델리치킨 11500");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로 155번길 20");
					
				}
				break;
			case 9:
				AppView.outputLine("You choice 교원파닭, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("교원파닭 -13900, 후라이드파닭 -14900, 마늘간장파닭 - 14900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로 151번길 7");
				}
				break;

			case 10:
				return;

			}
			AppView.outputLine("You want to see another store input 2");
			int num2 = input.nextInt();
			if (num2 == 2) {
				storeName();
			}
		}
	}

}

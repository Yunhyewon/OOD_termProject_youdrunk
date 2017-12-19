package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Pocha implements Store {
	Scanner input = new Scanner(System.in);

	@Override
	public void storeName() {
		File CS = new File("PochaStore.txt");
		while (true) {
			AppView.outputLine("----------Pocha list ----------");
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

	@Override
	public void detailStore() {
		while (true) {
			AppView.outputLine("---------Pocha choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 사적인 포차, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000, 마약닭볶음탕 15000, 사적인콩불 12000, 포테이토믹스 8000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동로18번길 98");
					
				}
				break;
			case 2:
				AppView.outputLine("You choice 한신포차, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 4000, 맥주 4000, 한신닭발 15000, 해물모둠볶음 18000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 21 킹스크로소빌딩");
					
				}
				break;
			case 3:
				AppView.outputLine("You choice 국민 야시장, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 4000, 맥주 4000, 막걸리 4000, 매콤제육볶음 2900, 국민촌돼지찌개 2900, 김치전 2900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 46");
					
				}
				break;
			case 4:
				AppView.outputLine("You choice 삼구포차, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 4000, 맥주 4000, 왕계란말이 3900, 맑은오뎅탕 3900, 오돌뼈볶음 3900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 45");
					
				}
				break;
			case 5:
				AppView.outputLine("You choice 포차어게인, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000, 닭한마리 20000, 돼지두부찌개 18000, 옛날통닭 12000, 골뱅이무침 15000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 25");
					
				}
				break;
			case 6:
				AppView.outputLine("You choice 숲, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000, 계란찜 6000, 콘치즈 6000, 감자튀김 12000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 39");
					
				}
				break;
			case 7:
				AppView.outputLine("You choice 달빛포차, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 4000, 맥주 4000, 계란말이 4500, 두부김치 3900, 옛날통닭 6900, 촌돼지짜글이 6900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 46");
					
				}
				break;
			case 8:
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

package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Meat implements Store {
	Scanner input = new Scanner(System.in);

	@Override
	public void storeName() {
		File CS = new File("MeatStore.txt");
		while (true) {
			AppView.outputLine("----------Meat store list ----------");
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
			AppView.outputLine("---------Meat store choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 곱창고, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("곱창모듬구이 9900, 특양모듬구이 11900, 한우곱창구이 13900, 한우대창구이 12900,"
							+ "막창구이 12900, 창고밥 2900  소주 4000, 맥주 4000, 청하 4000, 16학번 윤혜원 알바하는 가게");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 40");
					
				}
				break;
			case 2:
				AppView.outputLine("You choice 아저씨, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("꽃삼겹 8000, 새우롤 6500, 아저씨모듬 15000, 소주 3500, 맥주 4000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로145번길 22");
					
				}
				break;
			case 3:
				AppView.outputLine("You choice 청춘육회, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("한우육회 15000, 한우고추장육회 15000, 소주 3500, 맥주 4000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 13");
					
				}
				break;
			case 4:
				AppView.outputLine("You choice 족발덕후, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("족발소 19000, 족발중 24000, 족발대 29000, 소주 2500, 맥주 3000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동로18번길 81");
					
				}
				break;
			case 5:
				AppView.outputLine("You choice 연탄을 찾는 사람들, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("막창구이 9000, 생삼겹살 10000, 소갈비살 27000, 안창살 33000, 소주 4000, 맥주 5000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 49");
					
				}
				break;
			case 6:
				AppView.outputLine("You choice 동대문 막창, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("돼지막창 12000, 갈매기살 12000, 항정살 12000, 소주 3500, 맥주 4000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 34");
					
				}
				break;
			case 7:
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

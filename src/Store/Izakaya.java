package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Izakaya implements Store {
	Scanner input = new Scanner(System.in);

	@Override
	public void storeName() {
		File CS = new File("IzakayaStore.txt");
		while (true) {
			AppView.outputLine("----------Izakaya list ----------");
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
			AppView.outputLine("---------Izakaya choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 고래, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000, 마루 18000, 준마이 30000, 간바레오또상 32000, 오뎅 1500, 새우튀김 10000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로163번길 43");
					
				}
				break;
			case 2:
				AppView.outputLine("You choice 하쿠바야시장, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine(
							"소주 4000, 맥주 4000, 센300 6000, 준마이750 27000, 타코소라와사비 5000, 하쿠바부대찌개 5000, 하쿠바고로케 7000, 호르몬야끼 9000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 46");
				}
				break;
			case 3:
				AppView.outputLine("You choice 우주소년단, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000, 미니오뎅탕 8000, 오코노미야끼 8000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 농대로15번길 24");
				}
				break;
			case 4:
				AppView.outputLine("You choice 미소라, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000, 레몬소주 4000, 호가든 6000 모듬꼬치6종 14000, 오뎅탕 15000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 45");
				}
				break;
			case 5:
				AppView.outputLine("You choice 동경야시장, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 4000, 맥주 4000, 간바레오또상 30000, 날치알타코와사비 3000, 나가사끼짬뽕 9000, 베이컨숙주볶음 7000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동로18번길 62");
				}
				break;
			case 6:
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

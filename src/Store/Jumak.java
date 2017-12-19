package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Jumak implements Store {
	Scanner input = new Scanner(System.in);

	@Override
	public void storeName() {
		File CS = new File("JumakStore.txt");
		while (true) {
			AppView.outputLine("----------Jumak list ----------");
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
			AppView.outputLine("---------Jumak choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 그옛날풍경, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("쌀막걸리 3500, 꿀막걸리 4500, 알밤막걸리 4500, 부추전 4000, 김치전 5500, 녹두전 6000, 두부두루치기 8000, 야채계란말이 5000, 김치찌개 12000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로 141");
				}
				break;
			case 2:
				AppView.outputLine("You choice 주전자, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("산천어 4000, 유자 4000, 소주 3000, 맥주 3500, 해물파전 12000, 모듬전 13000, 두부김치 12000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동로18번길 78");
					
				}
				break;
			case 3:
				AppView.outputLine("You choice 돌아온 김삿갓, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("막걸리 3500, 꿀막걸리 4500, 소주 3500, 맥주 4000, 60cm계란말이 12000, 커블보쌈 15000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 16");
					
				}
				break;
			case 4:
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

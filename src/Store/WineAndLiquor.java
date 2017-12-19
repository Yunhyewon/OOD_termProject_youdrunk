package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class WineAndLiquor implements Store {
	Scanner input = new Scanner(System.in);

	@Override
	public void storeName() {
		File CS = new File("Wine&LiquorStore.txt");
		while (true) {
			AppView.outputLine("---------- WineAndLiquor list ----------");
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
			AppView.outputLine("--------- WineAndLiquor choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 사막의 하얀 꽃, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("칵테일 7000, 와인한잔 6000, 맥주 5000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 25");
					
				}
				break;
			case 2:
				AppView.outputLine("You choice 럭키스트라이크, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("스카이모스카토&토닉 8000, 깔루아밀크 8000, 하와이언펀치 8000, 기네스 6000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 40");
					
				}
				break;
			case 3:
				AppView.outputLine("You choice 마틴 bar, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("블랙러시안 8000, 잭콕 8000, 준벅 7000, 오렌지키스 7000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 21");
					
				}
				break;
			case 4:
				AppView.outputLine("You choice 55와인포차, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("와인최저 15000, 오일파스타 9000, 청포도리코타치즈샐러드 12000, 안창스테이크 22000 14학번 현도훈 알바하는 가게");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 어은로57번길 51");
					
				}
				break;
			case 5 :
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
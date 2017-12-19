package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Room implements Store {
	Scanner input = new Scanner(System.in);

	@Override
	public void storeName() {
		File CS = new File("RoomStore.txt");
		while (true) {
			AppView.outputLine("----------Room list ----------");
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
			AppView.outputLine("---------Room choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 샤오차이나, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("춘티엔 14000, 샤티엔 14000, 칠리새우 16000, 소주 4000, 맥주 4000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 25");
					
				}
				break;
			case 2:
				AppView.outputLine("You choice 하루해, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("소주 3500, 맥주 4000 매화수 4000 카프리 4000 산딸기 소주 9000  오꼬노미야끼 15000  가마보고 오뎅탕 16000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 38");
					
				}
				break;
			case 3:
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
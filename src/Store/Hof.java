package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
import app.AppView;
import java.util.Scanner;

public class Hof implements Store {
	Scanner input = new Scanner(System.in);

	public void storeName() {
		File CS = new File("HofStore.txt");
		while (true) {
			AppView.outputLine("----------Hof list ----------");
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
		File hof = new File("HofDetail.txt");
		while (true) {
			AppView.outputLine("---------Hof choice ---------- return is 0");
			AppView.output("->");
			int num = input.nextInt();
			switch (num) {
			case 0:
				return;
			case 1:
				AppView.outputLine("You chice 리얼펍, You want to see price and position input 1, return input 0");
				int num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine(
							"크림생맥주 2500, 자몽맥주 4000, 호가든로제 6000, 블랑1664 7000, 로제떡볶이 6000, 달콤감자 4000, 마른오징어 7000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 14");
					AppView.outputLine("You want to see another store input 2");
					int num2 = input.nextInt();
					if (num2 == 2) {
						storeName();
					}
				}
				break;
			case 2:
				AppView.outputLine("You choice 슈퍼바스켓, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크림생맥주 2500, 시나몬꿀맥주 3500, 자몽생맥주 4500, 버터갈릭포테이토 5000, 나쵸앤딥 4000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 34");
				}
				break;
			case 3:
				AppView.outputLine("You choice 빠삭, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크림생맥주 2500, 더치비어 4500, 자몽맥주 4500, 웨지감자 5000, 치즈스틱 2500, 로제떡볶이 5500");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로155번길 26");
				}
				break;
			case 4:
				AppView.outputLine("You choice 벙커90, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("버드와이저 2900, 클라우드 2900, 호가든 5900, 순살모듬치킨 7900, 독일전통소세지 12900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 39");
				}
				break;
			case 5:
				AppView.outputLine("You choice 용구비어, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("크림생맥주 2500, 자몽맥주 3000, 감자스틱 3000,5000, 스위트치즈롤 3000, 치킨바스켓 8500");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로141번길 17");
				}
				break;
			case 6:
				AppView.outputLine("You choice 건어물을 굽는 남자들, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("참이슬 3500, 카스 3900, 클라우드 4500, 아이스황도 4900, 감자튀김 6900, 육포 7900");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 궁동로18번길 57");
				}
				break;
			case 7:
				AppView.outputLine("You choice 종로맥가, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("국산맥주 2800, 수입맥주 3800, 먹태 9000, 감자튀김 5000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 농대로17번길 24 1층");
				}
				break;
			case 8:
				AppView.outputLine("You choice 맥주창고낮술, You want to see price and position input 1, return input 0");
				num1 = input.nextInt();
				if (num1 == 0) {
					storeName();
				} else if (num1 == 1) {
					AppView.outputLine("--------가격--------");
					AppView.outputLine("카스 2900, 기린이치방 4900, 산미구엘 5500, 밀러 5500, 기네스 6900, 모듬마른안주 15000");
					AppView.outputLine("--------위치--------");
					AppView.outputLine("대전 유성구 대학로151번길 37");
				}
				break;
			case 9:
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

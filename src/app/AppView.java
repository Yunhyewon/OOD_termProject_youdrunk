package app;

import java.util.Scanner;
import Store.Store;

public class AppView {
//	private static final boolean DEBUG_MODE = true;
//	public static void outputDebugMessage (String aString){
//		if(DEBUG_MODE){
//			System.out.print(aString);
//		}
//	}
	private static Scanner scanner = new Scanner(System.in);

	private AppView() {

	}

	public static void outputLine(String aString) {
		System.out.println(aString);
	}

	public static void output(String aString) {
		System.out.print(aString);
	}

	public static void ThemaChoice() {
		Store st = new Store();
		int a;

		AppView.output("->");
		a = AppView.scanner.nextInt();
		if (a > 4) {
			AppView.outputLine("Wrong number, reinput:");
		}
		if (a == 3) {
			st.menuStoreList();
		}

	}

}

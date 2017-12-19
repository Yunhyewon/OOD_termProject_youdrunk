package app;

import MixDrink.MakeMixList;
import Store.Store;
import app.AppView;

public class AppController {

	private int ThemaChoice() {
		int a;
		while (true) {
			a = AppView.ThemaChoice();
			switch (a) {
			case 1:
				AppView.menuDrinkList();
				break;
			case 2:
				AppView.PlayingGame();
				break;
			case 3:
				AppView.menuStoreList();
				break;
			case 4:
				AppView.menuMixDrinkList();
				break;
			}
		break;	
		}
		return a;
	}
	public void run() {
		AppView.outputLine("---------Start Program---------");
		while(true){
			AppView.outputLine("---------Choice thema---------");
			AppView.outputLine("1. Kind of achol  2. Mini Game  3. store  4. Mix drink 0. End Program");	
			if(this.ThemaChoice() == 0){
				AppView.outputLine("---------End Program---------");
				break;
			}
		}
	}
}

package app;

import Store.Store;

import java.util.Scanner;

public class AppController {
	private void choiceThema(){
		AppView.outputLine("1. Kind of achol  2. Mini Game  3. store  4. Mix drink");
	}

	public void run(){
		AppView.outputLine("---------Choice thema---------");
		this.choiceThema();
		AppView.ThemaChoice();
	}
}

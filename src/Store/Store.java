package Store;

import java.util.Scanner;
//import Store.Hof;
import Store.*;
public class Store {
	int userinput;
	Scanner sc = new Scanner(System.in);
	
	public void menuStoreList(){
		System.out.println("1. Pocha 2. Room 3. Hof 4. Izakaya 5. Wine&Liquor");
		System.out.println("6. Meet 7. SeaFood 8. Chicken 9. Jumak");
		System.out.print("->");
		int userInput = sc.nextInt();	
		viewStoreList(userInput);
	}
	
	public void viewStoreList(int userInput){
		switch (userInput) {
		case 1:
			System.out.println("Pocha");
			break;
		case 2:
			System.out.println("Room");
			break;
		case 3:
			System.out.println("Hof");
			break;
		case 4:
			System.out.println("Izakaya");
			break;
		case 5:
			System.out.println("Wine&Liquor");
			break;
		case 6:
			System.out.println("Meet");
			break;
		case 7:
			System.out.println("SeaFood");
			break;
		case 8:
			Chicken ck = new Chicken();
			ck.storeName();
			ck.detailStore();
//		case 9:
//			System.out.println("Jumak");
//			break;
		default:
			break;
		}
	}
}

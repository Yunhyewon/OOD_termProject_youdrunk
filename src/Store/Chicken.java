package Store;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Store.Store;
//import java.util.LinkedList;

import java.util.Scanner;

public class Chicken implements StoreList{
//	LinkedList<String> chicken_list = new LinkedList<String>();
//
//	public void printChickenList() {
//		for (int i = 0; i < this.chicken_list.size(); i++) {
//			System.out.println(this.chicken_list.get(i));
//		}
//	}

	@Override
	public void storeName() {
		File CS = new File("C:\\Users\\rudtk\\Desktop","ChickenStore.txt");

		System.out.println("----------Chicken store list ----------");
		try{
			BufferedReader input = new BufferedReader(new FileReader(CS));
			String s;
			while((s = input.readLine())!=null){
				System.out.println(s);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("No file.");
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return;
	}
	public String detailStore(){
		System.out.println("---------ChickenStore chice ---------- return is 0");
		System.out.print("->");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		Scanner in = new Scanner(System.in);
		switch(num){
		case 0 : 
			Store st = new Store();
			st.menuStoreList();
		case 1:
			System.out.println("You choice blackdd. You want see price input 1, You want see store scale input 2");
			System.out.print("->");
			int num1 = in.nextInt();
			switch(num1){
			case 1 :
				System.out.println("How much...?");
				break;
			case 2 : 
				System.out.println("where...");
			}
			break;
		case 2 : 
			System.out.println("You choice 2. , You want see price input 1, You want see store scale input 2");
			System.out.print("->");
			int num2 = in.nextInt();
			switch(num2){
			case 1 :
				System.out.println("How much...?");
				break;
			case 2 : 
				System.out.println("where...");
			}
			break;
		}
		return null;
	}
}

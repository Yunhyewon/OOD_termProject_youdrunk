package Store;

import java.util.LinkedList;

public class SeaFood implements StoreList {
	LinkedList<String> seafood_list = new LinkedList<String>();

	public void printPochaList() {
		for (int i = 0; i < this.seafood_list.size(); i++) {
			System.out.println(this.seafood_list.get(i));
		}
	}

	@Override
	public void storeName() {
		// TODO Auto-generated method stub
		return ;
	}


//	@Override
//	public int price() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int scale() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}

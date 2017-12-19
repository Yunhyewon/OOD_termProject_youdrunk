package Store;

import java.util.LinkedList;

public class Izakaya implements StoreList {
	LinkedList<String> izakaya_list = new LinkedList<String>();

	public void printIzakayaList() {
		for (int i = 0; i < this.izakaya_list.size(); i++) {
			System.out.println(this.izakaya_list.get(i));
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

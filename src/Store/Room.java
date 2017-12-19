package Store;

import java.util.LinkedList;

public class Room implements StoreList {
	LinkedList<String> room_list = new LinkedList<String>();

	public void printRoomList() {
		for (int i = 0; i < this.room_list.size(); i++) {
			System.out.println(this.room_list.get(i));
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

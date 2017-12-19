package Store;

import java.util.LinkedList;

public class Hof implements StoreList{
	LinkedList<String> hof_list = new LinkedList<String>();
	
	public void printHofList(){
		for(int i = 0; i < this.hof_list.size(); i++){
			System.out.println(this.hof_list.get(i));
		}
	}
	public Hof(){
		
	}
//	public String getHof(int userInput){ 
//		return this.hof_list.get(userInput);
//	}
	@Override
	public void storeName() {
		
		return ;
	}
//	@Override
//	public int price() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public int scale() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
}

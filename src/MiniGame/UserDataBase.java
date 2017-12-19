package MiniGame;

public class UserDataBase {
	private UserData dataBase[] = new UserData[20];
	private int size = 0;
	
	public UserDataBase(){
	}
	
	public void addData(UserData user){
		dataBase[size] = user;
		size++;
	}
	
	public UserData[] getDataBase(){
		return dataBase;
	}
	
	public boolean userSearch(String name){
		for(int i = 0; i < 20; i++){
			if(dataBase[i]!=null&&dataBase[i].getName().equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public int indexSearch(String name){
		for(int i = 0; i < 20; i++){
			if(dataBase[i].getName().equals(name)){
				return i;
			}
		}
		return 100;
	}
	
	public void print(){
		for(int i=0;i<size;i++){
			System.out.print(i + ". ");
			dataBase[i].print();
		}
	}
}

package chap08;

public class TVFactory extends Factory implements IWorkingTogether{
	
	public TVFactory(){}
	public TVFactory(String name,int openHour, int closeHour) {
		super(name, openHour, closeHour);
	
	}
	
	@Override
	public int makeProducts(char skill) {
		
		if(skill=='A'){
			skill=8;
		}else if(skill=='B'){
			skill=5;
		}else if(skill=='C'){
			skill=3;
		}else{
			skill=1;
		}
		return skill*getWorkingTime();
	}
	@Override
	public int workTogether(IWorkingTogether partner) {
		int skill = 3;
		return skill*getWorkingTime();
	}
}

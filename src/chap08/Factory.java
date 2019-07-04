package chap08;

public abstract class Factory {
	int openHour; 	//공장가동시각 h
	int closeHour;  //공장종료시각 h
	String name; 	//공장이름
	
	//생성자
	public Factory(){}
	public Factory(String name, int openHour, int closeHour) {
		super();
		this.name = name;
		this.openHour = openHour;
		this.closeHour = closeHour;
	}
	
	public String getFactoryName(){
		return name;
	}
	public int getWorkingTime(){
		return closeHour-openHour;
	}
	
	public abstract int makeProducts(char skill); //기술력에 따른 하루 제품 생산량
	
   
}

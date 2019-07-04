package chap08;

public abstract class Factory {
	int openHour; 	//���尡���ð� h
	int closeHour;  //��������ð� h
	String name; 	//�����̸�
	
	//������
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
	
	public abstract int makeProducts(char skill); //����¿� ���� �Ϸ� ��ǰ ���귮
	
   
}

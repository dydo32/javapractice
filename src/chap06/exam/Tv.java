package chap06.exam;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	//������
	public Tv(){
		color = "black";
		power = false;
		channel = 0;
	}
	
	//power() : ������� power �� ���� �ݴ밪���� �����մϴ�.
	public void power(){
		if(power==false){
			power=true;
		}else{
			power=false;
		}
	}
	
	//channelUp() : ������� channel �� ���� 1�����մϴ�. 
	public void channelUp(){
		channel= channel+1;
	}
	//channelDown() : ��� ���� channel �� ���� 1 �����մϴ�.
	public void channelDown(){
		channel= channel-1;
	}
	
	//print() : ����� ���� �� ����������� ����մϴ�.  
	public void print(){
		System.out.println("color :"+color+"\tpower :"+power+"\tchannel :"+channel);
	}
	
}

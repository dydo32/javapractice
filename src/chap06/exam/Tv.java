package chap06.exam;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	//생성자
	public Tv(){
		color = "black";
		power = false;
		channel = 0;
	}
	
	//power() : 멤버변수 power 의 값을 반대값으로 변경합니다.
	public void power(){
		if(power==false){
			power=true;
		}else{
			power=false;
		}
	}
	
	//channelUp() : 멤버변수 channel 의 값을 1증가합니다. 
	public void channelUp(){
		channel= channel+1;
	}
	//channelDown() : 멤버 변수 channel 의 값을 1 감소합니다.
	public void channelDown(){
		channel= channel-1;
	}
	
	//print() : 결과와 같이 각 멤버변수들을 출력합니다.  
	public void print(){
		System.out.println("color :"+color+"\tpower :"+power+"\tchannel :"+channel);
	}
	
}

package chap08;

public class MMSSender extends Sender {
	int length;

	public MMSSender(String name, int length) {
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void send(){
		System.out.println(name+"- 전송이 완료(2000자가 넘지 않는 문자열만 가능)");
	}
}

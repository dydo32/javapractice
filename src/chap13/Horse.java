package chap13;

//Canvas라는 것을 이용해서 그림을 그릴 수 있도록
//Canvas는 평면 공간을 제공하는 컴포넌트
//그림을 그리거나 글자를 나타내거나 할 수 있다.
//paint메소드를 오버라이딩해서 원하는 그림을 그린다.
//paint메소드의 매개변수인 Graphics의 멤버들을 이용해서 그림을 그린다.
//그림이 그려지도록 하려면 Canvas의 repaint메소드를 호출해야 오버라이딩한 paint가 호출된다.
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Horse extends Canvas implements Runnable {
	private int x; // Horse의 x좌표값은 계속 변경될 것 이므로 변수로 정의
	private int randNum;

	public Horse() {
		// nextInt말고 다른방법
		double num = Math.random();
		System.out.println(num);
		randNum = (int) (num * 5);
		System.out.println(randNum);
	}

	@Override
	public void paint(Graphics g) {// 오버라이딩 해서(source)
		setBackground(Color.yellow);
		// Line을 그리고 x의 시작값은 0이고 y는 전체 Canvas의 1/2
		g.drawLine(0, this.getSize().height / 2, this.getSize().width, this.getSize().height / 2);
		g.fillOval(x, 0, 10, this.getSize().height);	//캔버스로 놓고 보아야하므로  -> x값이 움직여야 움직이는 것 처럼 보임
	}

	public void startThread() {
		new Thread(this).start(); // implements Runnable하면 .start안되니까 이렇게 만들어줌.
	}

	@Override
	public void run() {	//Canvas에 색상지정
		//repaint(); //Canvas의 paint()를 호출
		while(true){
			try {
				Thread.sleep(100);	//Horse가 달리는 속도를 조절 0.1초마다 한 걸음씩
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Canvas의 x좌표를 변경
			//여기서 랜덤 수를 더해줘도 되고, x에 랜덤값 취해줘도되고.
			x = x + 10+randNum; //+랜덤수하는것일반적이지만 다른방법 => randNum
			//x좌표값이 Canvas의 width보다 커지면 반복문을 빠져나간다.
			if(x>this.getSize().width-10){//g.fillOval에서 10주었으니 빼줌
				
				break;
			}
			repaint();
			
		}
	}

}

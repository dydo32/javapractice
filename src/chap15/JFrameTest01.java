package chap15;

import javax.swing.JFrame;

public class JFrameTest01 {

	public static void main(String[] args) {
		JFrame f = new JFrame("스윙연습");
		//화면에 표시될 컨테이너가 JFrame이고 이 JFrame의 사이즈를 정의
		f.setSize(400, 500);
		//화면에 컨테이너 보여주기
		f.setVisible(true);
	}

}

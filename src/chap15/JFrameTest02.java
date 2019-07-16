package chap15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest02 {

	public static void main(String[] args) {
		// JFrame위에 컴포넌트를 배치
		// 1. 컴포넌트를 JFrame에 배치하고 화면을 디자인하기 위해서 ContentPane을 구하기
		JFrame f = new JFrame("스윙연습");
		Container c = f.getContentPane();
		
		//2. 화면에 배치할 컴포넌트를 생성
		JButton btn1 = new JButton("안녕");
		JButton btn2 = new JButton("hello swing");
		JButton btn3 = new JButton("확인");
		
		//3. 작성된 컴포넌트를 화면에 배치
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		//4. JFrame의 사이즈를 지정하고 화면에 표시
		f.setSize(400, 500);
		f.setVisible(true);
		
		//5. 윈도우 x버튼을 눌렀을 때 프로그램이 종료되도록 설정 
		//	 - 이벤트처리로 해야하나 스윙에서는 윈도우 종료는 이벤트 처리없이 작업 할 수 있도록 지원
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

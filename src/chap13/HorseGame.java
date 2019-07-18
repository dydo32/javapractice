package chap13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HorseGame extends JFrame implements ActionListener {
	private BorderLayout bl = new BorderLayout();
	private JLabel lb = new JLabel("말 수 = ", Label.RIGHT);
	private JTextField tf = new JTextField(10);
	private JButton bt = new JButton("설정");
	// public JList li = new JList(3, false);
	private JPanel pp;
	private Horse[] horse;
	private JButton bt1 = new JButton("출발하기");

	public HorseGame() {
		super("ActionEvent연습");
		init();
		start();
		this.setSize(600, 500);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void init() {
		this.setLayout(bl);
		Panel p = new Panel(new FlowLayout());
		p.add(lb);
		p.add(tf);
		p.add(bt);
		p.add(bt1);
		this.add("North", p);

		// this.add("South", li);
	}

	public void start() {
		tf.addActionListener(this);
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf || e.getSource() == bt) {
			// 텍스트필드에 입력하는 말의 개수만큼 말을 만드는 작업
			// ---> 버튼을 누르거나 텍스트필드에서 Enter를 누르면 수행
			if (pp != null) {
				this.remove(pp);
			}
			int x = Integer.parseInt(tf.getText().trim());
			pp = new JPanel();
			// 입력받은 x값을 이용해서 그리드의 행을 구성하고
			pp.setLayout(new GridLayout(x, 1, 3, 3));
			//Horse배열갯수를 지정하고
			horse = new Horse[x];
			
			//그 x값만큼 Horse객체를 생성해서 배열의 각 요소에 할당하고 이 Canvas객체를 
			//Jpanel에 붙인다.
			for(int i=0; i<x ;i++){
				horse[i] = new Horse();
				pp.add(horse[i]);
			}
			this.add("Center",pp);
			this.validate();//화면을 재구성
		}else if(e.getSource()==bt1){
			//출발하기 버튼을 누르면 Horse배열의 모든 요소의 Thread를 start한다.
			for (int i = 0; i < horse.length; i++) {
				horse[i].startThread();
			}
		}
	}

	public static void main(String[] args) {
		HorseGame g = new HorseGame();
	}

}

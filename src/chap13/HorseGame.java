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
	private JLabel lb = new JLabel("�� �� = ", Label.RIGHT);
	private JTextField tf = new JTextField(10);
	private JButton bt = new JButton("����");
	// public JList li = new JList(3, false);
	private JPanel pp;
	private Horse[] horse;
	private JButton bt1 = new JButton("����ϱ�");

	public HorseGame() {
		super("ActionEvent����");
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
			// �ؽ�Ʈ�ʵ忡 �Է��ϴ� ���� ������ŭ ���� ����� �۾�
			// ---> ��ư�� �����ų� �ؽ�Ʈ�ʵ忡�� Enter�� ������ ����
			if (pp != null) {
				this.remove(pp);
			}
			int x = Integer.parseInt(tf.getText().trim());
			pp = new JPanel();
			// �Է¹��� x���� �̿��ؼ� �׸����� ���� �����ϰ�
			pp.setLayout(new GridLayout(x, 1, 3, 3));
			//Horse�迭������ �����ϰ�
			horse = new Horse[x];
			
			//�� x����ŭ Horse��ü�� �����ؼ� �迭�� �� ��ҿ� �Ҵ��ϰ� �� Canvas��ü�� 
			//Jpanel�� ���δ�.
			for(int i=0; i<x ;i++){
				horse[i] = new Horse();
				pp.add(horse[i]);
			}
			this.add("Center",pp);
			this.validate();//ȭ���� �籸��
		}else if(e.getSource()==bt1){
			//����ϱ� ��ư�� ������ Horse�迭�� ��� ����� Thread�� start�Ѵ�.
			for (int i = 0; i < horse.length; i++) {
				horse[i].startThread();
			}
		}
	}

	public static void main(String[] args) {
		HorseGame g = new HorseGame();
	}

}

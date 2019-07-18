package chap13.quiz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class OnlineQuiz extends javax.swing.JFrame {
	public JLabel lbltime;
	private JLabel lblquizmain;
	private JButton btnnext;
	private JButton btnpre;
	public JProgressBar jProgressBar1;
	Vector<QuizDTO> list = new Vector<QuizDTO>();
	QuizDAO dao = new QuizDAO();
	int num = 0;
	private ButtonGroup buttonGroup1;
	private JRadioButton radpro4;
	private JRadioButton radpro3;
	private JRadioButton radpro2;
	private JRadioButton radpro1;
	QuizDTO data =null;
	int size = 0;
	
	ClockThread t;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				OnlineQuiz inst = new OnlineQuiz();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public OnlineQuiz() {
		super();
		initGUI();
		list = dao.selectAll();
		dataSetting();
		//new ClockThread(this).start();
		t = new ClockThread(this);
		t.start();	// 최초로 화면이 실행될 때 같이 실행되는 쓰레드	
	}
	
	public void dataSetting(){
		size = list.size();
		System.out.println("size==>"+size);
		data = list.get(num);
		lblquizmain.setText(data.getContent());
		radpro1.setText(data.getOne());
		radpro2.setText(data.getTwo());
		radpro3.setText(data.getThree());
		radpro4.setText(data.getFour());
		System.out.println("datasetting"+num);
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				lbltime = new JLabel();
				getContentPane().add(lbltime);
				lbltime.setText("jLabel1");
				lbltime.setBounds(406, 12, 102, 26);
			}
			{
				jProgressBar1 = new JProgressBar();
				getContentPane().add(jProgressBar1);
				jProgressBar1.setBounds(12, 12, 382, 22);
			}
			{
				btnpre = new JButton();
				getContentPane().add(btnpre);
				btnpre.setText("\uc774\uc804");
				btnpre.setBounds(346, 248, 69, 24);
				btnpre.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						if(num==0){
							JOptionPane.showMessageDialog(OnlineQuiz.this,
									"처음 문제입니다.");
						}else{
							num = num-1;
							System.out.println("pre버튼=>"+num);
							dataSetting();
						}
						t.stopThread();		// 진행되는 쓰레드를 종료한다.
						// 새로운 쓰레드를 생성해서
						t = new ClockThread(OnlineQuiz.this);	// 익명이너클래스에서 onlinequiz를 받는 방법
						t.start();
					}
				});
			}
			{
				btnnext = new JButton();
				getContentPane().add(btnnext);
				btnnext.setText("\ub2e4\uc74c");
				btnnext.setBounds(420, 248, 67, 24);
				btnnext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						if(num==size-1){
							JOptionPane.showMessageDialog(OnlineQuiz.this,
									"마지막 문제입니다.");
						}else{
							num=num+1;
							dataSetting();
						}
						t.stopThread();	// 진행되는 쓰레드를 종료한다.
						t = new ClockThread(OnlineQuiz.this);	// 익명이너클래스에서 onlinequiz를 받는 방법
						t.start();
					}
				});
			}
			{
				lblquizmain = new JLabel();
				getContentPane().add(lblquizmain);
				lblquizmain.setText("jLabel1");
				lblquizmain.setBounds(12, 62, 484, 92);
				lblquizmain.setFont(new java.awt.Font("맑은 고딕",1,12));
			}
			{
				radpro1 = new JRadioButton();
				getContentPane().add(radpro1);
				radpro1.setText("\ubb38\uc81c1");
				radpro1.setBounds(41, 166, 150, 21);
				getButtonGroup1().add(radpro1);
			}
			{
				radpro2 = new JRadioButton();
				getContentPane().add(radpro2);
				radpro2.setText("\ubb38\uc81c2");
				radpro2.setBounds(270, 166, 150, 21);
				getButtonGroup1().add(radpro2);
				radpro2.setContentAreaFilled(false);
			}
			{
				radpro3 = new JRadioButton();
				getContentPane().add(radpro3);
				radpro3.setText("\ubb38\uc81c3");
				radpro3.setBounds(41, 213, 150, 21);
				getButtonGroup1().add(radpro3);
			}
			{
				radpro4 = new JRadioButton();
				getContentPane().add(radpro4);
				radpro4.setText("\ubb38\uc81c4");
				radpro4.setBounds(270, 208, 150, 21);
				getButtonGroup1().add(radpro4);
			}
			pack();
			this.setSize(524, 343);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}

}

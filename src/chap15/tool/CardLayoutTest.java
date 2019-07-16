package chap15.tool;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class CardLayoutTest extends JFrame {

	public JPanel contentPane;
	public JButton btnpre;
	public JButton btnnext;
	public JPanel topPanel;
	public JPanel cardPanel;
	public JPanel page1;
	public JPanel page2;
	public TabView3 page3;
	public CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutTest frame = new CardLayoutTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CardLayoutTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		topPanel.setForeground(Color.BLACK);
		topPanel.setBounds(1, 2, 503, 103);
		contentPane.add(topPanel);
		topPanel.setLayout(null);
		
		btnpre = new JButton("\uC774\uC804");
		btnpre.setBackground(new Color(240, 248, 255));
		btnpre.setFont(new Font("문체부 바탕체", Font.PLAIN, 41));
		btnpre.setBounds(63, 19, 138, 63);
		topPanel.add(btnpre);
		
		btnnext = new JButton("\uB2E4\uC74C");
		btnnext.setBackground(new Color(240, 248, 255));
		btnnext.setFont(new Font("문체부 바탕체", Font.PLAIN, 41));
		btnnext.setBounds(261, 19, 138, 63);
		topPanel.add(btnnext);
		
		cardPanel = new JPanel();
		cardPanel.setBounds(0, 115, 504, 425);
		contentPane.add(cardPanel);
		//코드 수정, CardLayout 객체 참조변수 만들어줌, 위에 멤버변수로 변수 올려주고
		card = new CardLayout(0, 0);
		cardPanel.setLayout(card);
		
		page1 = new JPanel();
		cardPanel.add(page1, "page1"); 	
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		page1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		page1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		page1.add(rdbtnNewRadioButton);
		
		page2 = new JPanel();
		cardPanel.add(page2, "page2");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		page2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		page2.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		page2.add(chckbxNewCheckBox_2);
		
		page3 = new TabView3();
		cardPanel.add(page3, "page3");
		//CardLayout에 기본으로 보여질 패널을 정의
		//=> page1이라는 이름으로 등록된 패널이 보여지도록 설정
		//show의 parentView page1이 추가될 패널을 의미 즉, CardLayout이 적용됨
		//										   패널을 의미
		card.show(cardPanel, "page1");	
		
		startEvent();
	}
	public void startEvent(){
		CardLayoutTestListener listener = new CardLayoutTestListener(this);
		btnnext.addActionListener(listener);
		btnpre.addActionListener(listener);
	}

}

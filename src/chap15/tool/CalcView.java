package chap15.tool;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalcView extends JFrame {

	public JPanel contentPane;
	public JTextField tfdata1;
	public JTextField tfdata2;
	public JLabel lblInfo2;
	public JTextField rfres;
	public JLabel lblres;
	public JButton btnplus;
	public JButton btnminus;
	public JButton btnmul;
	public JButton btndiv;
	public JButton btnexit;

	/**
	 * Create the frame.
	 */
	public CalcView() {
		setTitle("\uACC4\uC0B0\uAE30");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//모든프로그램이 한꺼번에 꺼지지 않게 하기 위해 없앰
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo1 = new JLabel("su1=");
		lblInfo1.setFont(new Font("굴림", Font.BOLD, 18));
		lblInfo1.setBounds(12, 10, 65, 36);
		contentPane.add(lblInfo1);
		
		tfdata1 = new JTextField();
		tfdata1.setFont(new Font("굴림", Font.PLAIN, 18));
		tfdata1.setBounds(66, 13, 327, 36);
		contentPane.add(tfdata1);
		tfdata1.setColumns(10);
		
		tfdata2 = new JTextField();
		tfdata2.setFont(new Font("굴림", Font.PLAIN, 18));
		tfdata2.setColumns(10);
		tfdata2.setBounds(66, 62, 327, 36);
		contentPane.add(tfdata2);
		
		lblInfo2 = new JLabel("su2=");
		lblInfo2.setFont(new Font("굴림", Font.BOLD, 18));
		lblInfo2.setBounds(12, 59, 65, 36);
		contentPane.add(lblInfo2);
		
		rfres = new JTextField();
		rfres.setFont(new Font("굴림", Font.PLAIN, 18));
		rfres.setColumns(10);
		rfres.setBounds(66, 163, 327, 36);
		contentPane.add(rfres);
		
		lblres = new JLabel("res=");
		lblres.setFont(new Font("굴림", Font.BOLD, 18));
		lblres.setBounds(12, 160, 65, 36);
		contentPane.add(lblres);
		
		btnplus = new JButton("+");
		btnplus.setFont(new Font("굴림", Font.BOLD, 18));
		btnplus.setBounds(12, 108, 88, 47);
		contentPane.add(btnplus);
		
		btnminus = new JButton("-");
		btnminus.setFont(new Font("굴림", Font.BOLD, 18));
		btnminus.setBounds(112, 108, 88, 47);
		contentPane.add(btnminus);
		
		btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmul.setFont(new Font("굴림", Font.BOLD, 18));
		btnmul.setBounds(212, 108, 88, 47);
		contentPane.add(btnmul);
		
		btndiv = new JButton("/");
		btndiv.setFont(new Font("굴림", Font.BOLD, 18));
		btndiv.setBounds(312, 108, 88, 47);
		contentPane.add(btndiv);
		
		btnexit = new JButton("\uC885\uB8CC");
		btnexit.setFont(new Font("굴림", Font.BOLD, 18));
		btnexit.setBounds(312, 204, 88, 47);
		//익명이너클래스를 이용해서 이벤트 연결
		//버튼을 누르면 창 종료
		btnexit.addActionListener(new ActionListener() {	// 익명이너클래스 - 클래스안에 클래스가 있는상태라 this쓰면 CalcView칭하는 것 아님
													
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.exit(0);	//모든프로그램이 함께 종료
				// 익명이너클래스에서 outer클래스를 칭하는 방법 - 클래스명.this
				CalcView.this.dispose(); // 현재 작업중인 창만 종료. -> dispose()
				
			}
		});
		contentPane.add(btnexit);
		
		setVisible(true);		//화면 다 만들고 마지막에 추가.
	}
}

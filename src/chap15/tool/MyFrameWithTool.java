package chap15.tool;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MyFrameWithTool extends JFrame {

	public JPanel contentPane;
	public JTextField txtnum1;
	public JLabel lblnum2;
	public JTextField txtnum2;
	public JLabel lbltitle;
	public JLabel lblnum1;
	public JButton btncalc1;
	public JButton btncalc2;
	public JButton btnshow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrameWithTool frame = new MyFrameWithTool();
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
	public MyFrameWithTool() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 100, 614, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitle = new JLabel("\uD654\uBA74\uB514\uC790\uC778\uC5F0\uC2B5");
		lbltitle.setForeground(Color.BLUE);
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lbltitle.setBounds(103, 39, 394, 65);
		contentPane.add(lbltitle);
		
		lblnum1 = new JLabel("\uC22B\uC7901: ");
		lblnum1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblnum1.setBounds(76, 104, 51, 51);
		contentPane.add(lblnum1);
		
		txtnum1 = new JTextField();
		txtnum1.setBounds(134, 100, 366, 62);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		lblnum2 = new JLabel("\uC22B\uC7902: ");
		lblnum2.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblnum2.setBounds(76, 182, 51, 51);
		contentPane.add(lblnum2);
		
		txtnum2 = new JTextField();
		txtnum2.setColumns(10);
		txtnum2.setBounds(134, 172, 366, 62);
		contentPane.add(txtnum2);
		
		btncalc1 = new JButton("\uACC4\uC0B0\uAE301");
		btncalc1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btncalc1.setBounds(233, 269, 118, 51);
		contentPane.add(btncalc1);
		
		btncalc2 = new JButton("\uACC4\uC0B0\uAE302");
		btncalc2.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btncalc2.setBounds(379, 269, 118, 51);
		contentPane.add(btncalc2);
		
		btnshow = new JButton("\uB098\uC758\uACC4\uC0B0\uAE30");
		btnshow.setFont(new Font("±¼¸²", Font.BOLD, 14));
		btnshow.setBounds(87, 269, 118, 51);
		contentPane.add(btnshow);
		
		startEvent();
	}
	public void startEvent(){
		BuilderListener listener = new BuilderListener(this);
		btncalc1.addActionListener(listener);
		btncalc2.addActionListener(listener);
		btnshow.addActionListener(listener);
	}
}

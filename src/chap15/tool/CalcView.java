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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//������α׷��� �Ѳ����� ������ �ʰ� �ϱ� ���� ����
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo1 = new JLabel("su1=");
		lblInfo1.setFont(new Font("����", Font.BOLD, 18));
		lblInfo1.setBounds(12, 10, 65, 36);
		contentPane.add(lblInfo1);
		
		tfdata1 = new JTextField();
		tfdata1.setFont(new Font("����", Font.PLAIN, 18));
		tfdata1.setBounds(66, 13, 327, 36);
		contentPane.add(tfdata1);
		tfdata1.setColumns(10);
		
		tfdata2 = new JTextField();
		tfdata2.setFont(new Font("����", Font.PLAIN, 18));
		tfdata2.setColumns(10);
		tfdata2.setBounds(66, 62, 327, 36);
		contentPane.add(tfdata2);
		
		lblInfo2 = new JLabel("su2=");
		lblInfo2.setFont(new Font("����", Font.BOLD, 18));
		lblInfo2.setBounds(12, 59, 65, 36);
		contentPane.add(lblInfo2);
		
		rfres = new JTextField();
		rfres.setFont(new Font("����", Font.PLAIN, 18));
		rfres.setColumns(10);
		rfres.setBounds(66, 163, 327, 36);
		contentPane.add(rfres);
		
		lblres = new JLabel("res=");
		lblres.setFont(new Font("����", Font.BOLD, 18));
		lblres.setBounds(12, 160, 65, 36);
		contentPane.add(lblres);
		
		btnplus = new JButton("+");
		btnplus.setFont(new Font("����", Font.BOLD, 18));
		btnplus.setBounds(12, 108, 88, 47);
		contentPane.add(btnplus);
		
		btnminus = new JButton("-");
		btnminus.setFont(new Font("����", Font.BOLD, 18));
		btnminus.setBounds(112, 108, 88, 47);
		contentPane.add(btnminus);
		
		btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmul.setFont(new Font("����", Font.BOLD, 18));
		btnmul.setBounds(212, 108, 88, 47);
		contentPane.add(btnmul);
		
		btndiv = new JButton("/");
		btndiv.setFont(new Font("����", Font.BOLD, 18));
		btndiv.setBounds(312, 108, 88, 47);
		contentPane.add(btndiv);
		
		btnexit = new JButton("\uC885\uB8CC");
		btnexit.setFont(new Font("����", Font.BOLD, 18));
		btnexit.setBounds(312, 204, 88, 47);
		//�͸��̳�Ŭ������ �̿��ؼ� �̺�Ʈ ����
		//��ư�� ������ â ����
		btnexit.addActionListener(new ActionListener() {	// �͸��̳�Ŭ���� - Ŭ�����ȿ� Ŭ������ �ִ»��¶� this���� CalcViewĪ�ϴ� �� �ƴ�
													
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.exit(0);	//������α׷��� �Բ� ����
				// �͸��̳�Ŭ�������� outerŬ������ Ī�ϴ� ��� - Ŭ������.this
				CalcView.this.dispose(); // ���� �۾����� â�� ����. -> dispose()
				
			}
		});
		contentPane.add(btnexit);
		
		setVisible(true);		//ȭ�� �� ����� �������� �߰�.
	}
}

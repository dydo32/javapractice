package chap15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JButton�� JLabel
public class BasicComponentTest extends JFrame {
	JLabel lblInfo = new JLabel("Info:");
	ImageIcon imgCheck = new ImageIcon("src/images/check.png"); // ���ϰ��
	JLabel lblImg = new JLabel(imgCheck);
	JButton btnCheck = new JButton(imgCheck);
	JButton btnSound = new JButton("����", new ImageIcon("src/images/sound_off.png"));
	JTextField tfdata1 = new JTextField(); // p.816
	JTextField tfdata2 = new JTextField(10);
	JTextField tfdata3 = new JTextField("[�̰��� �����͸� �Է��ϼ���]");
	JPasswordField pw = new JPasswordField(10);
	JTextArea taInfo = new JTextArea(10, 30);

	public BasicComponentTest() {

	}

	public BasicComponentTest(String title) {
		super(title);
		display();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display() {
		// 1. Contentpane�� ����
		Container c = getContentPane();
		setLayout(new FlowLayout());
		btnCheck.setToolTipText("üũ"); //Ŀ�� �������� �ߴ°�
		btnSound.setRolloverIcon(new ImageIcon("src/images/star.png")); // ���콺��� ������ ��
		c.add(lblInfo);
		c.add(lblImg);
		c.add(btnCheck);
		c.add(btnSound);
		c.add(tfdata1);
		c.add(tfdata2);
		c.add(tfdata3);
		c.add(pw);
		c.add(taInfo);
	}

	public static void main(String[] args) {
		BasicComponentTest obj = new BasicComponentTest("BasicComponent����");
	}
}

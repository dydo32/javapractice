package chap15;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SelectionComponentTest extends JFrame {
	// 1. JCheckBox
	JCheckBox chkjava = new JCheckBox("�ڹ�");
	JCheckBox chkweb = new JCheckBox("��");
	JCheckBox chkspring = new JCheckBox("������");

	// 2. JRadioButton
	// => ���� �׷�ȿ��� JRadioButton�� �ϳ��� ���õǵ��� ����
	// 1) �׷����� ���� JRadioButton�� �����Ѵ�.
	// 2) ButtonGroup�� �����ϰ� ButtonGroup�� JRadioButton�� �߰��Ѵ�.
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton rdojava = new JRadioButton("�ڹ�");
	JRadioButton rdoweb = new JRadioButton("��");
	JRadioButton rdospring = new JRadioButton("������");

	ButtonGroup group2 = new ButtonGroup();
	JRadioButton rdojava2 = new JRadioButton("�ڹ�");
	JRadioButton rdoweb2 = new JRadioButton("��");
	JRadioButton rdospring2 = new JRadioButton("������");

	// JComboBox�� JList�� �߰��� ���ڿ�
	String[] data1 = { "java", "servlet", "jsp", "spring", "MEAN stack" };
	String[] data2 = { "hadoop", "hive", "flume", "sqoop", "spark", "python" };

	// 3. JComboBox
	// => JComboBox�ȿ� �߰��� �������� Ÿ���� String�̶�� ��Ȯ�ϰ� �����ϱ� ���� <>�ȿ� Ÿ���� ����Ѵ�.
	JComboBox<String> cboSubject = new JComboBox<String>(data1);

	// 4. JList
	JList<String> lstSubject = new JList<String>(data2);
	JList<String> lstSubject2 = new JList<String>(data2);
	JTextArea taInfo = new JTextArea(10, 30);

	public SelectionComponentTest() {

	}

	public SelectionComponentTest(String title) {
		super(title);
		display();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display() {
		// 1. Contentpane�� ����
		Container c = getContentPane();

		// JCheckBox
		c.setLayout(new FlowLayout());
		c.add(chkjava);
		c.add(chkweb);
		c.add(chkspring);

		// JRadioButton
		group1.add(rdojava);
		group1.add(rdoweb);
		group1.add(rdospring);
		c.add(rdojava);
		c.add(rdoweb);
		c.add(rdospring);

		group2.add(rdojava2);
		group2.add(rdoweb2);
		group2.add(rdospring2);
		c.add(rdojava2);
		c.add(rdoweb2);
		c.add(rdospring2);

		// JComboBox
		// JList
		c.add(cboSubject);
		c.add(lstSubject);

		// JList�� JTextArea�� ������ �������� ��� ��ũ�ѹٸ� �߰��Ѵ�.
		// => ��ũ���� �߰��ϴ� ��� ��ũ�ѿ� ������Ʈ�� �߰��ϰ�
		// ������Ʈ�� �߰��� ��ũ���� �����̳ʿ� �߰��Ѵ�.
		JScrollPane scrollList = new JScrollPane(lstSubject2);
		lstSubject2.setVisibleRowCount(4);
		c.add(scrollList);

		// JTextArea�� ��ũ���� �߰��ϰ� ���� ȸ������ ������ ����
		JScrollPane scorollTa = new JScrollPane(taInfo);
		taInfo.setBackground(new Color(200, 200, 200));
		// taInfo.setBackground(Color.lightGray);
		c.add(scorollTa);
	}

	public static void main(String[] args) {
		SelectionComponentTest obj = new SelectionComponentTest("SelectionComponent����");
	}

}

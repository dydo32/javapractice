package chap15;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	JTable table = null;
	String[] columnNames = { "�����ȣ", "�����", "�μ���" };
	String[][] rowData = { 
			{ "001", "�����", "�λ��" }, 
			{ "002", "�嵿��", "�����" }, 
			{ "003", "�̹�ȣ", "�λ��" },
			{ "004", "���ؿ�", "�����" }, 
			{ "005", "�����", "�λ��" } 
			};

	public JTableTest() {

	}

	public JTableTest(String title) {
		super(title);
		display();
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void display() {
		// 1. Contentpane�� ����
		Container c = getContentPane();
		
		table = new JTable(rowData, columnNames);
		//c.add(table);
		JScrollPane scroll = new JScrollPane(table);
		c.add(scroll);
	}

	public static void main(String[] args) {
		JTableTest obj = new JTableTest("JTable����");
	}

}

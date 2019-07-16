package chap15;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	JTable table = null;
	String[] columnNames = { "사원번호", "사원명", "부서명" };
	String[][] rowData = { 
			{ "001", "김범룡", "인사부" }, 
			{ "002", "장동건", "전산실" }, 
			{ "003", "이민호", "인사부" },
			{ "004", "류준열", "전산실" }, 
			{ "005", "임재범", "인사부" } 
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
		// 1. Contentpane을 추출
		Container c = getContentPane();
		
		table = new JTable(rowData, columnNames);
		//c.add(table);
		JScrollPane scroll = new JScrollPane(table);
		c.add(scroll);
	}

	public static void main(String[] args) {
		JTableTest obj = new JTableTest("JTable연습");
	}

}

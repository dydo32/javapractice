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
	JCheckBox chkjava = new JCheckBox("자바");
	JCheckBox chkweb = new JCheckBox("웹");
	JCheckBox chkspring = new JCheckBox("스프링");

	// 2. JRadioButton
	// => 같은 그룹안에서 JRadioButton은 하나만 선택되도록 설정
	// 1) 그룹으로 묶일 JRadioButton을 생성한다.
	// 2) ButtonGroup을 생성하고 ButtonGroup에 JRadioButton을 추가한다.
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton rdojava = new JRadioButton("자바");
	JRadioButton rdoweb = new JRadioButton("웹");
	JRadioButton rdospring = new JRadioButton("스프링");

	ButtonGroup group2 = new ButtonGroup();
	JRadioButton rdojava2 = new JRadioButton("자바");
	JRadioButton rdoweb2 = new JRadioButton("웹");
	JRadioButton rdospring2 = new JRadioButton("스프링");

	// JComboBox와 JList에 추가될 문자열
	String[] data1 = { "java", "servlet", "jsp", "spring", "MEAN stack" };
	String[] data2 = { "hadoop", "hive", "flume", "sqoop", "spark", "python" };

	// 3. JComboBox
	// => JComboBox안에 추가될 아이템의 타입이 String이라고 정확하게 정의하기 위해 <>안에 타입을 명시한다.
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
		// 1. Contentpane을 추출
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

		// JList나 JTextArea의 내용이 많아지는 경우 스크롤바를 추가한다.
		// => 스크롤을 추가하는 경우 스크롤에 컴포넌트를 추가하고
		// 컴포넌트가 추가된 스크롤을 컨테이너에 추가한다.
		JScrollPane scrollList = new JScrollPane(lstSubject2);
		lstSubject2.setVisibleRowCount(4);
		c.add(scrollList);

		// JTextArea에 스크롤을 추가하고 밝은 회색으로 색상을 변경
		JScrollPane scorollTa = new JScrollPane(taInfo);
		taInfo.setBackground(new Color(200, 200, 200));
		// taInfo.setBackground(Color.lightGray);
		c.add(scorollTa);
	}

	public static void main(String[] args) {
		SelectionComponentTest obj = new SelectionComponentTest("SelectionComponent연습");
	}

}

package chap15.tool;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class TabTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabTest frame = new TabTest();
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
	public TabTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 261);
		contentPane.add(tabbedPane);
		
		JPanel p_emp = new JPanel();
		p_emp.setToolTipText("");
		tabbedPane.addTab("\uC778\uC0AC\uAD00\uB9AC", null, p_emp, null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		p_emp.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		p_emp.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		p_emp.add(rdbtnNewRadioButton_2);
		
		JPanel p_dept = new JPanel();
		tabbedPane.addTab("\uBD80\uC11C\uAD00\uB9AC", null, p_dept, null);
		p_dept.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 10, 405, 29);
		p_dept.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 49, 405, 173);
		p_dept.add(textArea);
		
		TabView3 tabView3 = new TabView3();
		tabbedPane.addTab("\uB3C4\uC6C0\uB9D0", null, tabView3, null);
	}
}

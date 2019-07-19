package swingPro.dept.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeptSelectPage extends JPanel {
	public JTextField txtsearch;
	public JLabel lblDeptSelect;
	public JButton btnsearch;
	public JTextArea tainfo;
	public JButton btnsearch2;
	public JButton btnsave;

	/**
	 * Create the panel.
	 */
	public DeptSelectPage() {
		setLayout(null);
		
		lblDeptSelect = new JLabel("\uBD80\uC11C\uC815\uBCF4 \uC870\uD68C\uD558\uAE30");
		lblDeptSelect.setFont(new Font("πŸ≈¡", Font.BOLD, 20));
		lblDeptSelect.setBounds(120, 10, 217, 41);
		add(lblDeptSelect);
		
		txtsearch = new JTextField();
		txtsearch.setBounds(12, 68, 142, 30);
		add(txtsearch);
		txtsearch.setColumns(10);
		
		btnsearch = new JButton("\uAC80\uC0C9");
		btnsearch.setFont(new Font("πŸ≈¡", Font.BOLD, 15));
		btnsearch.setBounds(163, 62, 67, 41);
		add(btnsearch);
		
		tainfo = new JTextArea();
		JScrollPane scroll = new JScrollPane(tainfo);
		scroll.setBounds(13, 108, 435, 179);
		add(scroll);
		
		
		btnsave = new JButton("\uC800\uC7A5");
		btnsave.setFont(new Font("πŸ≈¡", Font.BOLD, 15));
		btnsave.setBounds(375, 62, 73, 41);
		add(btnsave);
		
		btnsearch2 = new JButton("\uBD80\uC11C\uBA85\uAC80\uC0C9");
		btnsearch2.setFont(new Font("πŸ≈¡", Font.BOLD, 15));
		btnsearch2.setBounds(243, 61, 122, 41);
		add(btnsearch2);

	}

}

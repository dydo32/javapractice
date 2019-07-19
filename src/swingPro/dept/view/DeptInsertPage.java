package swingPro.dept.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class DeptInsertPage extends JPanel {
	public JTextField tfdeptno;
	public JTextField tfdeptname;
	public JTextField tfloc;
	public JTextField tftel;
	public JTextField tfmgr;
	public JLabel lblDeptInsert;
	public JLabel lblDeptinsert;
	public JLabel lblDeptName;
	public JLabel lblDeptLo;
	public JLabel lblDepttelNum;
	public JLabel lblDeptMgr;
	public JButton btninsert;

	/**
	 * Create the panel.
	 */
	public DeptInsertPage() {
		setLayout(null);
		
		lblDeptInsert = new JLabel("\uBD80\uC11C\uB4F1\uB85D");
		lblDeptInsert.setFont(new Font("πŸ≈¡", Font.BOLD, 20));
		lblDeptInsert.setBounds(188, 23, 110, 40);
		add(lblDeptInsert);
		
		lblDeptinsert = new JLabel("\uBD80\uC11C\uB4F1\uB85D:");
		lblDeptinsert.setFont(new Font("πŸ≈¡", Font.BOLD, 18));
		lblDeptinsert.setBounds(15, 86, 176, 40);
		add(lblDeptinsert);
		
		lblDeptName = new JLabel("\uBD80\uC11C\uBA85:");
		lblDeptName.setFont(new Font("πŸ≈¡", Font.BOLD, 18));
		lblDeptName.setBounds(13, 141, 176, 40);
		add(lblDeptName);
		
		lblDeptLo = new JLabel("\uC704\uCE58:");
		lblDeptLo.setFont(new Font("πŸ≈¡", Font.BOLD, 18));
		lblDeptLo.setBounds(15, 193, 176, 40);
		add(lblDeptLo);
		
		lblDepttelNum = new JLabel("\uC804\uD654\uBC88\uD638:");
		lblDepttelNum.setFont(new Font("πŸ≈¡", Font.BOLD, 18));
		lblDepttelNum.setBounds(15, 244, 176, 40);
		add(lblDepttelNum);
		
		lblDeptMgr = new JLabel("\uAD00\uB9AC\uC790:");
		lblDeptMgr.setFont(new Font("πŸ≈¡", Font.BOLD, 18));
		lblDeptMgr.setBounds(15, 301, 176, 40);
		add(lblDeptMgr);
		
		tfdeptno = new JTextField();
		tfdeptno.setBounds(103, 86, 335, 40);
		add(tfdeptno);
		tfdeptno.setColumns(10);
		
		btninsert = new JButton("\uBD80\uC11C\uB4F1\uB85D");
		btninsert.setFont(new Font("πŸ≈¡", Font.BOLD, 19));
		btninsert.setBounds(287, 363, 145, 40);
		add(btninsert);
		
		tfdeptname = new JTextField();
		tfdeptname.setColumns(10);
		tfdeptname.setBounds(103, 141, 335, 40);
		add(tfdeptname);
		
		tfloc = new JTextField();
		tfloc.setColumns(10);
		tfloc.setBounds(103, 192, 335, 40);
		add(tfloc);
		
		tftel = new JTextField();
		tftel.setColumns(10);
		tftel.setBounds(104, 245, 335, 40);
		add(tftel);
		
		tfmgr = new JTextField();
		tfmgr.setColumns(10);
		tfmgr.setBounds(104, 301, 335, 40);
		add(tfmgr);

	}
}

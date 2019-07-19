package swingPro.dept.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class EmpListPage extends JPanel {
	public JComboBox cboMgr;
	public JTextArea taEmpList;
	public String[] itemValue = {"jang","kim","kang","lee"};
	private JLabel lblNewLabel_1;
	/**
	 * Create the panel.
	 */
	public EmpListPage() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAD00\uB9AC\uC790:");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 26, 159, 35);
		add(lblNewLabel);
		
		cboMgr = new JComboBox(itemValue);
		cboMgr.setBounds(89, 26, 324, 35);
		add(cboMgr);
		
		/*taEmpList = new JTextArea();
		taEmpList.setBounds(12, 104, 414, 186);
		add(taEmpList);*/
		taEmpList = new JTextArea();
		JScrollPane scroll = new JScrollPane(taEmpList);
		scroll.setBounds(12, 104, 414, 186);
		add(scroll);
		
		lblNewLabel_1 = new JLabel("\uBD80\uC11C\uC815\uBCF4:");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 71, 184, 29);
		add(lblNewLabel_1);

	}
}

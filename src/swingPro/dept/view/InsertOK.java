package swingPro.dept.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class InsertOK extends JPanel {
	private final JLabel lblImg = new JLabel("");

	/**
	 * Create the panel.
	 */
	public InsertOK() {
		setLayout(null);
		
		JLabel lblmsg = new JLabel("\uD658\uC601\uD569\uB2C8\uB2E4. \uB4F1\uB85D\uC131\uACF5");
		lblmsg.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblmsg.setForeground(Color.WHITE);
		lblmsg.setBounds(22, 37, 344, 71);
		add(lblmsg);
		lblImg.setIcon(new ImageIcon(InsertOK.class.getResource("/swingPro/images/star.png")));
		lblImg.setBounds(0, 0, 426, 300);
		add(lblImg);

	}
}

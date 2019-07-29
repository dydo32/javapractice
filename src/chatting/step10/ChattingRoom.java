package chatting.step10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;

public class ChattingRoom extends JFrame {

	public JPanel contentPane;
	public JButton btnMake;
	public JButton btnEntry;


	/**
	 * Create the frame.
	 */
	public ChattingRoom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(12, 24, 291, 300);
		contentPane.add(list);
		
		btnMake = new JButton("\uBC29\uB9CC\uB4E4\uAE30");
		btnMake.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnMake.setBounds(168, 362, 130, 52);
		contentPane.add(btnMake);
		
		btnEntry = new JButton("\uC785\uC7A5\uD558\uAE30");
		btnEntry.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnEntry.setBounds(12, 362, 130, 52);
		contentPane.add(btnEntry);
		
		setVisible(true);
	}
}

package chap15.event;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItemEventTest01 extends JFrame{
	/*
	 * JCheckBox chk1 = new JCheckBox("¥���(4000)"); 
	 * JCheckBox chk2 = newJCheckBox("«��(4500)"); 
	 * JCheckBox chk3 = new JCheckBox("������(5000)");
	 * JCheckBox chk4 = new JCheckBox("��μ���"); 
	 * JCheckBox chk5 = new JCheckBox("����");
	 */
	String[] data = new String[] { "¥���(4000)", "«��(4500)", "������(5000)", "��μ���", "����" };
	JCheckBox[] chkItem = new JCheckBox[data.length];
	JLabel lblInfo = new JLabel("�ֹ��� ���ϴ� �������� ����:");
	JLabel lblresult = new JLabel("�ֹ��ݾ�:");
	
	public ItemEventTest01(String title) {
		super(title);
		display();
		setSize(250, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	// ȭ��������� ���� �޼ҵ�
		public void display() {
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.add(lblInfo);
			ItemEventTest01Listener listener = new ItemEventTest01Listener(this);
			
			for (int i = 0; i < chkItem.length; i++) {
				chkItem[i] = new JCheckBox(data[i]);
				chkItem[i].setBorderPainted(true);
				c.add(chkItem[i]);
				//������ üũ�ڽ��� �̺�Ʈ�� ����
				chkItem[i].addItemListener(listener);
			}
			/*
			 * c.add(chk1); 
			 * c.add(chk2); 
			 * c.add(chk3); 
			 * c.add(chk4); 
			 * c.add(chk5);
			 */
			c.add(lblresult);
			/*
			 * chk1.addItemListener(listener); 
			 * chk2.addItemListener(listener);
			 * chk3.addItemListener(listener); 
			 * chk4.addItemListener(listener);
			 * chk5.addItemListener(listener);
			 */
		}
	public static void main(String[] args) {
		ItemEventTest01 f = new ItemEventTest01("GUI����");
	}

}

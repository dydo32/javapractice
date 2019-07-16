package chap15.event;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItemEventTest01 extends JFrame{
	/*
	 * JCheckBox chk1 = new JCheckBox("짜장면(4000)"); 
	 * JCheckBox chk2 = newJCheckBox("짬뽕(4500)"); 
	 * JCheckBox chk3 = new JCheckBox("탕수육(5000)");
	 * JCheckBox chk4 = new JCheckBox("모두선택"); 
	 * JCheckBox chk5 = new JCheckBox("해제");
	 */
	String[] data = new String[] { "짜장면(4000)", "짬뽕(4500)", "탕수육(5000)", "모두선택", "해제" };
	JCheckBox[] chkItem = new JCheckBox[data.length];
	JLabel lblInfo = new JLabel("주문을 원하는 아이템을 선택:");
	JLabel lblresult = new JLabel("주문금액:");
	
	public ItemEventTest01(String title) {
		super(title);
		display();
		setSize(250, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	// 화면디자인을 위한 메소드
		public void display() {
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.add(lblInfo);
			ItemEventTest01Listener listener = new ItemEventTest01Listener(this);
			
			for (int i = 0; i < chkItem.length; i++) {
				chkItem[i] = new JCheckBox(data[i]);
				chkItem[i].setBorderPainted(true);
				c.add(chkItem[i]);
				//각각의 체크박스에 이벤트를 연결
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
		ItemEventTest01 f = new ItemEventTest01("GUI연습");
	}

}

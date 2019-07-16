package chap15;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest02 {

	public static void main(String[] args) {
		// JFrame���� ������Ʈ�� ��ġ
		// 1. ������Ʈ�� JFrame�� ��ġ�ϰ� ȭ���� �������ϱ� ���ؼ� ContentPane�� ���ϱ�
		JFrame f = new JFrame("��������");
		Container c = f.getContentPane();
		
		//2. ȭ�鿡 ��ġ�� ������Ʈ�� ����
		JButton btn1 = new JButton("�ȳ�");
		JButton btn2 = new JButton("hello swing");
		JButton btn3 = new JButton("Ȯ��");
		
		//3. �ۼ��� ������Ʈ�� ȭ�鿡 ��ġ
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		//4. JFrame�� ����� �����ϰ� ȭ�鿡 ǥ��
		f.setSize(400, 500);
		f.setVisible(true);
		
		//5. ������ x��ư�� ������ �� ���α׷��� ����ǵ��� ���� 
		//	 - �̺�Ʈó���� �ؾ��ϳ� ���������� ������ ����� �̺�Ʈ ó������ �۾� �� �� �ֵ��� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

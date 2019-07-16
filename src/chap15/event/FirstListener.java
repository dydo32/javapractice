package chap15.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstListener implements ActionListener {
	FirstEventTest mainView;

	public FirstListener() {
	}

	public FirstListener(FirstEventTest mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ������ ��ư�� �������� ��ư�� ���ڿ��� ���
		if (e.getActionCommand().equals("east")) {
			System.out.println("����");
		} else if (e.getActionCommand().equals("west")) {
			System.out.println("����");
		} else if (e.getActionCommand().equals("south")) {
			System.out.println("����");
		} else if (e.getActionCommand().equals("north")) {
			System.out.println("����");
		} else if (e.getActionCommand().equals("center")) {
			System.out.println("���");
		}

		// e.getSource()�� Ȱ���ؼ� ������ ��ư�� �������� ����
		// ��ư�� ���ڿ� => ____ 	(FirstListener, FirstEventTest �Ѵ� ���� ���� ����)
		if(e.getSource()==mainView.btn1){
			System.out.println("��ư�� ���ڿ� => north");
			String text = mainView.btn1.getText();
			System.out.println("��ư�� ���ڿ� => "+text);
		}else if(e.getSource()==mainView.btn2){
			mainView.btn2.setText("����");
			System.out.println("��ư�� ���ڿ� => west");
		}else if(e.getSource()==mainView.btn3){
			CalcMini calc = new CalcMini();
		}else if(e.getSource()==mainView.btn4){
			System.out.println("��ư�� ���ڿ� => east");
		}else if(e.getSource()==mainView.btn5){
			System.out.println("��ư�� ���ڿ� => south");
		}
		
	/*	System.out.println("�̺�Ʈ �߻�..�����Ϸ�...");
		System.out.println(e); 	//e.toString();
		
		// �̺�Ʈ �ҽ� ��ü�� ���� �ִ� ���ڿ��� ����
		System.out.println("e.getActionCommand()=> " + e.getActionCommand());
	
		// ���� �̺�Ʈ�� �߻���Ų �ҽ���ü ����
		System.out.println(e.getSource());*/
		
	}

}

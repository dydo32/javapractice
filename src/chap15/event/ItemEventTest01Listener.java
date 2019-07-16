package chap15.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventTest01Listener implements ItemListener {
	ItemEventTest01 mainView;
	int result = 0;

	public ItemEventTest01Listener() {
	}

	public ItemEventTest01Listener(ItemEventTest01 mainView) {
		super();
		this.mainView = mainView;
	}

	// üũ�ڽ��� ���°� ���ð� ������ �ٲ𶧸��� ȣ��Ǵ� �޼ҵ�
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getStateChange()); // SELECTED�� 1�̰�,
												// DESELECTED�� 2�̴�.
		// üũ�ڽ��� ���� (1 - ItemEvent�� ���ǵǾ� �ִ� ItemEvent.SELECTED
		// 			 2 - ItemEvent�� ���ǵǾ� �ִ� ItemEvent.DESELECTED)
		
		int state = 1;	// 1�� ���û���,  -1�� ��������
		if(e.getStateChange() == ItemEvent.SELECTED){
			state = 1;
		}else{
			state = -1;
		}
		
		if(e.getSource() == mainView.chkItem[0]){
			result = result + (state*4000);
		}else if(e.getSource() == mainView.chkItem[1]){
			result = result + (state*4500);
		}else if(e.getSource() == mainView.chkItem[2]){
			result = result + (state*5000);
		}
		
		/*
		 if(e.getStateChange()== ItemEvent.SELECTED){  
			//System.out.println("����");
			if(e.getSource() == mainView.chkItem[0]){
				result = result + 4000;
			}else if(e.getSource() == mainView.chkItem[1]){
				result = result + 4500;
			}else if(e.getSource() == mainView.chkItem[2]){
				result = result + 5000;
			}
			
		}else{						
			//System.out.println("��������");
			if(e.getSource() == mainView.chkItem[0]){
				result = result - 4000;
				
			}else if(e.getSource() == mainView.chkItem[1]){
				result = result - 4500;
			}else if(e.getSource() == mainView.chkItem[2]){
				result = result - 5000;
			}
		} 
		*/
		mainView.lblresult.setText("�ֹ��ݾ�: " + result);
		//mainView.lblres.setText(result+"");
	}
}

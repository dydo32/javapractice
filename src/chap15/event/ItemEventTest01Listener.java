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

	// 체크박스의 상태가 선택과 해제로 바뀔때마다 호출되는 메소드
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getStateChange()); // SELECTED은 1이고,
												// DESELECTED는 2이다.
		// 체크박스를 선택 (1 - ItemEvent에 정의되어 있는 ItemEvent.SELECTED
		// 			 2 - ItemEvent에 정의되어 있는 ItemEvent.DESELECTED)
		
		int state = 1;	// 1은 선택상태,  -1은 해제상태
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
			//System.out.println("선택");
			if(e.getSource() == mainView.chkItem[0]){
				result = result + 4000;
			}else if(e.getSource() == mainView.chkItem[1]){
				result = result + 4500;
			}else if(e.getSource() == mainView.chkItem[2]){
				result = result + 5000;
			}
			
		}else{						
			//System.out.println("선택해제");
			if(e.getSource() == mainView.chkItem[0]){
				result = result - 4000;
				
			}else if(e.getSource() == mainView.chkItem[1]){
				result = result - 4500;
			}else if(e.getSource() == mainView.chkItem[2]){
				result = result - 5000;
			}
		} 
		*/
		mainView.lblresult.setText("주문금액: " + result);
		//mainView.lblres.setText(result+"");
	}
}

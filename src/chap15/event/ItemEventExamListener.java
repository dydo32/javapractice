package chap15.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/*
 * view에서 이벤트가 발생하면 어떤 컴포넌트가 이벤트를 발생시켰는지 확인하고 처리할 비지니스 메소드를 호출
 * (비지니스메소드에서 처리할 로직에서 뷰에 대한 정보가 필요하면 메소드의 매개변수로 넘겨준다.)
 * 비지니스 메소드 처리 결과가 view에서 필요하면 비지니스 메소드의 리턴값으로 전달한다.
 */
public class ItemEventExamListener implements ItemListener {

	ItemEventExam mainView;

/*	int mainTotal = 0;
	int subTotal = 0;*/
	
	int totalPrice = 0;	// 전체금액
	int mainPrice = 0; 	// 주메뉴
	int subPrice = 0;	// 부메뉴
	

	public ItemEventExamListener() {}
	public ItemEventExamListener(ItemEventExam mainView) {
		super();
		this.mainView = mainView;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 주메뉴와 부메뉴에 대한 작업 각각 처리
		ItemEventExamLogic logic = new ItemEventExamLogic();

		// 주메뉴에 대해 계산하기 위해서 주메뉴의 가격이 저장된 배열과 주메뉴 객체를 넘기고 있다.
		// mainPrice = logic.calcTotalPrice(mainView.mainPrice, mainView.rbomenu);
		// 부메뉴에 대해 계산하기 위해서 부메뉴의 가격이 저장된 배열과 주메뉴 객체를 넘기고 있다.
		// subPrice = logic.calcTotalPrice(mainView.subPrice, mainView.chkmenu);
		
		/*String opr = null;
		if (e.getStateChange() == ItemEvent.SELECTED) {
			opr ="+";
		}else{
			opr="-";
		}*/

		for (int i = 0; i < mainView.rbomenu.length; i++) {
			if (mainView.rbomenu[i].isSelected())
				mainPrice = mainView.mainPrice[i];
		}
		
		for (int i = 0; i < mainView.chkmenu.length; i++) {
			if(e.getSource() == mainView.chkmenu[i] & e.getStateChange() == ItemEvent.SELECTED){
				subPrice = logic.calcTotalPrice(mainView.subPrice[i], subPrice, "+");
			} else if(e.getSource() == mainView.chkmenu[i]) {
				subPrice = logic.calcTotalPrice(mainView.subPrice[i], subPrice, "-");
			}
		}
		
		// === 추후에 이 곳에서 선택된 주메뉴와 부메뉴에 대한 제어작업을 리스너에서 처리하고 로직에서는 합산만 할수 있도록 구현 : 했음
		totalPrice = mainPrice + subPrice;
		mainView.tfPrice.setText(totalPrice+"");		
	}
}

